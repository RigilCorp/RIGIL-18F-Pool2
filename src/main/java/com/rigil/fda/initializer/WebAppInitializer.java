package com.rigil.fda.initializer;

import com.rigil.fda.config.RootContextConfig;
import com.rigil.fda.config.WebMvcContextConfig;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer{
    private static final Logger logger = LoggerFactory.getLogger(WebAppInitializer.class);
    private static final String DISPATCHER_SERVLET = "dispatcher";

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        registerContextListener(servletContext);
        registerDispatcherServlet(servletContext);
    }

    private void registerDispatcherServlet(ServletContext servletContext) {
        logger.debug("Registering Dispatcher Servlet {} [name:{}]", WebMvcContextConfig.class.getName(), DISPATCHER_SERVLET);
        WebApplicationContext dispatcherContext = createContext(WebMvcContextConfig.class);
        DispatcherServlet dispatcherServlet = new DispatcherServlet(dispatcherContext);
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet(DISPATCHER_SERVLET, dispatcherServlet);
        dispatcher.addMapping("/");
        dispatcher.setLoadOnStartup(1);

        FilterRegistration.Dynamic filter = servletContext.addFilter("openEntityManagerInViewFilter", OpenEntityManagerInViewFilter.class);
        filter.addMappingForServletNames(null, true, "dispatcher");
    }

    private void registerContextListener(ServletContext servletContext) {
        logger.debug("Registering ContextListener {}", RootContextConfig.class.getName());
        WebApplicationContext rootContext = createContext(RootContextConfig.class);
        servletContext.addListener(new ContextLoaderListener(rootContext));

    }

    private WebApplicationContext createContext(Class<?> configClass) {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(configClass);
        return ctx;
    }

}
