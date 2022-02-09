# react-nb-spring-mongo-starter
Docker development environment in separated containers. NetBeans/Vsc support is optional. However, it's recommended. This is a very simple configuration out-of-the-box, and it's inspired by some popular Docker images and builds (awesome-compose/react-nginx, mongoDB). I was compiled both in a single folder, with learning purposes. I thought that it could be useful for you to start coding a project fast, so I decided to share it.

## Prerequisites

* Docker daemon and client installed on dev machine, physically
* LINUX Shell console, basic commands
* Code editor, NetBeans as in example for backend project, VSC for frontend
* Basic knowledges about Javascript and Java languages, Html, Css and JSON. 

## Configuration

* Download or clone this folder
* Open new shell allocated in ~/DownloadedFolder
* In the same folder level (where the file named 'docker-compose.yml' is stored), execute from shell the command ´´´ docker-compose up ´´´, then you'll be noticed by the logs in console about  the steps of building new images and setting up containers in Docker, it may take some minutes, only the first time it was executed, be patience.

### Containers included

* frontend-react: According with file 'package.json' provided, React.js will be installed, so you´ll be noticed that your 'helloReact' is available from address 'http://localhost:3000'.
* database-mongo: Another container will be setup to start a MongoDB container, where to save your model.
* backend-spring: Last, another container will be created to test the Spring built application, found in 'target/app-SNAPSHOT.jar'.

### Management

Once your environment will be installed and setup, you will be able to manage any of these containers by executing the command 'docker-compose exec' from the same folder level, in example: ´´´ docker-compose exec frontend-react bash ´´´. Then you will access by shell, so you could still execute 'npm install' or other command to extend or to manage 'React' and 'Node', with other libraries, such as 'Theme-ui', 'React-router-dom', 'i18next', or other... 

### Coding

* Frontend can be coded and compiled from ./src folder
* Backend can be coded and build from ./java-src folder.

Backend API can be tested visually from the address 'http://localhost:8080' (from you could fetch data responses), while your app to develop in React.js will be served in the address 'http://localhost:3000'.

### Tomcat server reads from Built 'backend-spring/target/app.jar

You have two option there. By default, the file 'app.jar' is served by the container named 'backend-spring'. This container gets the target 'file.jar' built from the NetBeans project included. But if you'll want to use your own Tomcat dev server (maybe from your IDE, most recommendable option while developing) you could disable this container typing 'docker-compose stop backend-spring' in shell (or editing the file 'docker-compose', to change the ports exposed, or to delete or comment the lines related to this container). 
