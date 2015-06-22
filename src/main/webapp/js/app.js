var app = angular.module('rigil.f18.pool2.app', 
    ['ngRoute', 
     'rigil.f18.pool2.contants',
     'rigil.f18.pool2.services', 
     'rigil.f18.pool2.controllers']);

app.config(function($routeProvider){
    $routeProvider
    .when('/', {
        templateUrl: 'pages/search-and-result-view.html',
        controller: 'searchAndResultController'
    })
    .otherwise({
        redirectTo : '/'
    })
});