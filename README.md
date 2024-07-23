Actuators:-  
Actuators provide insight into what's happening inside a running Spring Boot application. They offer a range of features for monitoring, gathering metrics, understanding traffic, or even taking some management actions without having to leave your application.

Key Features of Actuators:-  
Health Checks: They let you know if your application is running correctly.

Example: http://localhost:8080/actuator/health shows if the app is healthy.
Metrics: They provide data about the performance and behavior of your application.

Example: http://localhost:8080/actuator/metrics shows various metrics like memory usage, CPU usage, and more.
Info: They give basic information about your application.

Example: http://localhost:8080/actuator/info can display version, description, etc.
Loggers: They help you check and manage logging levels.

Example: http://localhost:8080/actuator/loggers shows and lets you change the logging level.
Auditing: They track security-related events, useful for auditing purposes.


How to Use Actuators:-  
Add Dependency: You need to add the spring-boot-starter-actuator dependency to your pom.xml/build.gradle.  
Enable Actuator Endpoints: By default, some endpoints are disabled for security reasons. You can enable them in your application.properties file.  management.endpoints.web.exposure.include=health,info,metrics  
Access Endpoints: Once configured, you can access the endpoints through your browser or any HTTP client

Uses of Actuators:-  
Monitoring: Keep an eye on the application's health and performance.  
Management: Perform administrative tasks like changing log levels or checking configuration properties.  
Troubleshooting: Quickly identify and solve issues by checking the application's state.  
