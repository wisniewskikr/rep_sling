


------------- INSTALL AND RUN SLING -----------------



I. INSTALL JAVA 5



II. DOWNLOAD STANDALONE JAR FILE
Download file:
org.apache.sling.launchpad-6-standalone.jar



III. RUN SLING STANDALONE
Use command:
java -jar org.apache.sling.launchpad-6-standalone.jar



IV. CHECK IF SLING IS RUNNING
In browser adress field type:
http://localhost:8080
 
 
 
 ------------- DEPLOY PRESENTATION TIER -----------------
 
 
 
 I. CREATE TEMPLATE
 For instance GET.esp (look in root of project)
 
 
 
 II. DEPLOY ESP FILE ON SLING
 Deploy file GET.esp as "helloWorld" resource (use application curl)
 curl -X MKCOL -u admin:admin http://localhost:8080/apps/helloWorld
 curl -u admin:admin -T GET.esp http://localhost:8080/apps/helloWorld/GET.esp
 
 
 
 III. DEPLOY URL AND PROPERTIES OF SLING WEB APPLICATION
 Property "resourceType" has to be the same type as resource of *.esp file
 curl -u admin:admin -F"sling:resourceType=helloWorld" -F"message=Hello World" http://localhost:8080/content/webapp
 
 
 

  ------------- DEPLOY BUSINESS TIER -----------------
 
 
 
 I. BUILD BUNDLE USING MAVEN
 Use command:
 mvn clean install 
 
 
 
 
 II. OPEN SLING OSGI CONSOLE
 Type in browser:
 http://localhost:8080/system/console/bundles
 
 
 
 III. DEPLOY BUNDLE IN OSGI CONSOLE
 Use button "Install/Update"
 
 
 
 IV. RUN SERVICE IN OSGI CONSOLE
 Use button "Start" in "Actions" column 
 
 
 
 ------------- RUN SLING WEB APPLICATION -----------------
 
 
 
  I. RUN SLING WEB APPLICATION
 In browser type address created earlier by you
 http://localhost:8080/content/webapp