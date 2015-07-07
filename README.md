# Prototype Link
- [FDSeek Home]
# Approach for the 18f Challenge
There are numerous Agile-aligned frameworks: Scrum, Kanban, Feature-Driven Development etc. We examined the parameters of this challenge-1 week delivery, needing to demonstrate process in action, ability to discover and adapt on an hourly / daily basis and the tenets of the Digital Services Playbook. We believe that Scrum's ceremonies and focus on heads down, work the committed/forecasted plan for the iteration were less applicable to the 18f challenge. Therefore, we determined that Kanban in combination with XP practices were the most appropriate frameworks to get the project needs delivered because we could: 
 - Visually see work in progress (WIP)
 - Instantly understand delays and impediments and take steps to resolve them  
 - Improve communication amongst all team members
 - Empower teams to self-manage visual processes and work flows 
 - Inspire team collaboration
# Assembling the Team
We assembled a team of four team members with these roles:
- Technical Architect
- Frontend Web Developer 
- Backend Web Developer
- DevOps Engineer
The team self-selected the Technical Architect as the team member to lead this effort and responsible for the outcomes.
# Preparation
To bootstrap the Kanban execution, we needed to get work items (or cards) loaded into the beginning of the pipeline in a priority order focused on maximizing the value of the solution being created. To this end, we performed two preparatory steps:
1.	Rapid ideation and idea selection
2.	Backlog grooming towards a targeted Minimal Viable Product (MVP)

For our rapid ideation process, we reviewed the parameters of the challenge with all team members. We then asked everyone to independently research the OpenFDA capabilities and data sets and come up with one or more ideas to bring to the next part of the process. We assembled the team again into an ideation exchange meeting. During this meeting, we brainstormed new ideas, and the performed a rapid prioritization to reach a consensus on the idea with the strongest alignment to the 18f challenge's goals. The selected idea was a search engine for enforcement reports on Food, Drugs and Devices as reported by the FDA's API's.
The initial draft of the product backlog had 5 user stories.  A design prototype using iRise was created and tested for usability through users on the team. That backlog and UI mockups were then brought to the full team the next day to determine a Minimal Viable Product (MVP) version of a software system that would realize the target idea.
Additionally, we settled on a target architecture which included: 
- Spring Core
- AngularJS
- Java
- Tomcat
- MySQL
- Spring MVC - API for RESTful Webservices

# Execution
Our Kanban board consisted of the following 5 columns each representing a different work process in the delivery flow:
- Backlog
- Selected for Development
- In Progress
- Done
- Release

The team met on a daily basis for a stand-up to ensure full team alignment and an opportunity for re-synchronization of the coming day's goals in order to best ensure delivery of the target MVP system. 
The UI was testable, so every day thereafter we  performed some usability testing.
- [FDseek] is deployed on Amazon Web Services (AWS) which is a widely known Infrastructure as a Service tool. 
- We included Continuous Integration in conjunction with our Kanban delivery execution that required developers to integrate code into a shared repository several times a day. Each check-in was then verified by an automated build, allowing teams to detect problems early.
- We used Jenkins, an open-source software application to monitor, build, and assist in deployment of FDSeek.com. Builds are triggered when changes are pushed to GitHub. Maven finds the root pom.xml file and runs the goals set by Jenkins. If the build succeeds code is deployed to our EC2 instance through Amazon’s Code Deploy plugin, and SonarQube generates an analysis. 
- We used docker on our Amazon EC2 instance to take advantage of the minimal runtime requirements of the application allowing for rapid application deployment. 
- Hardware monitoring is done through Amazon’s CloudWatch. 
- We are also using SonarQube for code coverage and vulnerability analysis. 
- In order to increase scalability efficiency, stability, and reduce costs we chose Chef as our configuration management tool. 

# Conclusion
We completed the timebox associated with the 18f challenge with all MVP targeted user stories completed. The Technical Architect facilitated a review session, with participation of the rest of the delivery team. Additionally, the group provided feedback to ensure that the overall product delivery met with the goals of the project, including the realization of the target idea and meeting all of the evaluation criteria outlined in the RFQ.
# Website
- [FDSeek Home]
- [Git Repo] 
- [Docker Hub]

# Evidence
U.S. Digital Services Playbook principles were used extensively in our approach and the evidences to the approach are documented in here
- [Evidence for Section E]

[fdseek]:http://fdseek.com
[FDSeek Home]:(http://fdseek.com)
[Git Repo]:https://github.com/RigilCorp/RIGIL-18F-Pool2
[Evidence for Section E]:https://github.com/RigilCorp/RIGIL-18F-Pool2/tree/master/documents/evidence
[Docker Hub]:https://registry.hub.docker.com/u/agiletrailblazers/pool2-18f/



