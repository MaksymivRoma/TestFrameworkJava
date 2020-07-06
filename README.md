# Installation guide
##Java
###Installation on Windows:
1. Download and install JDK [here](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
1. Open System Properties->Environment variables-> Add a %JAVA_HOME% into user variables and  %JAVA_HOME%\bin into the “path” system variable. %JAVA_HOME% - it is a path to the JDK folder in your system(for ex. C:\Program Files\Java\jdk1.8.0_251). 
1. Open command line and run `java -version` to verify successful installation. 


##Gradle
###Installation on Windows/Linux:
1. Open [link](https://gradle.org/install/)
1. Scroll to “Installing manually”
1. Download binary-only file
1. Follow instructions

##Running tests
###To run tests you need to create suit and gradle task
###To create suit:
1. Create java class
1. Add annotation above class declaration `@RunWith(JUnitPlatform.class)`
1. Add needed tests classes or tests in package with annotation `@SelectPackages("com.examples.packageA")` or 
`@SelectClasses(ClassATest.class)`. Read more about test suits [here](https://howtodoinjava.com/junit5/junit5-test-suites-examples/).

###We created main gradle tasks to run tests, but if you need something specific, you can create it by your own:
1. In build.gradle file add new block by patter “task youtaskname(type: test){}”
1. Inside curly braces block add needed parameters, for example `systemProperties['selenide.browser'] = 'chrome'`
1. Add needed suits include `'**/SampleSuite.class'`

###Run task:
1. Type in terminal “gradle yourtaskname” to run the task.
1. Or you can run it by pressing the “play” button in build.gradle file.

##Allure report
 
###Installation on Windows:
1. Open Windows PowerShell
1. Enter `iwr -useb get.scoop.sh | iex` to install a command-line installer for Windows. If you are getting warning regarding scope, run this command
`Set-ExecutionPolicy RemoteSigned -scope CurrentUser`
1. Enter `scoop install allure` to install allure report
1. Additional info about installation and future configuration can be found [here](https://docs.qameta.io/allure/).

To **generate report** after test run enter following command in command line/terminal:
 `gradlew allureReport`

To **generate report** and open it in browser after test run enter following command in command line/terminal:
 `gradlew allureServe`

To **stop report** run press `Ctrl + C`  followed by “y” and press Enter


##For more information you can read the documentation:
1. [Selenide](https://selenide.org/documentation.html)
1. [Junit 5](https://junit.org/junit5/docs/current/user-guide/)
1. [Allure](https://docs.qameta.io/allure/)
