# MazarinTest
test  for mazarin

This is a web application develop for mazarin software engineering position
technologies used - 
-java 8
-spring 
-maven
-hibernate
-jquery
-javascript
-mysql


Database queries will be availble in the scripts folder in project directory.
Change the DB related configurations in 'spring-database.xml'.
        <property name="driverClassName" value="com.mysql.jdbc.Driver" />
        <property name="url" value="jdbc:mysql://localhost:3306/mazarintest" />
        <property name="username" value="root" />
        <property name="password" value="" />
        
When the application is started you can access the application by 
http://'yourDomain'/mazarinTest

above URL will redirect the users to dashvoard page which is empty and there is a link to go to Customer page,
from customer page ypu will be able to Add and view customers with auditing the actions in the database.
