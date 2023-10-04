# ACSM Web Automation Testing
# Prerequisite 
  - JDK (v1.8) or Greater version [link](https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html) 
  - Maven (v3.8.1) or Greater version [link](https://maven.apache.org/download.cgi) 
  - Eclipse (v4.22.0) [link](https://www.eclipse.org/downloads/)

# Setup
### Install the JDK, Maven and Eclipse
##### JDK 
  - Download JDK (v1.8) or Greater version [link](https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html)
  - Install JDK file 
  - Set environment variable for JDK bin folder and restart system
  - Verify JDK installation by running following command `java -version`
  
##### Maven 
  - Download  Maven (v3.8.1) or Greater version [link](https://maven.apache.org/download.cgi) 
  - Copy path to maven bin folder
  - Set environment variable for maven and restart system
  - To check the Maven version by running following command `mvn --version`
  
  
##### Eclipse
  - Download Eclipse (v4.22.0) [link](https://www.eclipse.org/downloads/)
  - Install Eclipse
  
# Open project and run the tests
  - Open the project `ACSM` in Eclipse
  - Right click in the `ACSM` Project and select `Show In` > `Terminal`
  - Run command `mvn clean install`
  - The tests will start running.
  
# Explore automation test reports
  - Report file will be generated in the `report`>`reports` folder.
  - Open `index.html` file. 