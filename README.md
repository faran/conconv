Task is completed as mentioned in the technical test doc.

Implmented my solution using JVM stack
IDE used IntelliJ
Jdk source and target version is 1.8
maven 3.5.3 for build tool and dependencies.
Testing framework is TestNG 
I have included chrome driver under resource directory for mac which is the os i was working on and also windows chrome driver (but couldnt test it since dont have windows)

Pakage name is set in the project com.xe.cc which is under the standard maven project structure.
Test class itself is under test/java/comex.cc/CurrencyConversion.java which has 5 test cases excluding gdpr notification
acceptance.
Created a little POM structure with brief introduction of classes.
BaseDriver included driver related code.
BasePage has all the elements related wraper methods
BaseTest is used to intiate all classes and beforesuite and afterclass for avoiding repetable code in individual tests
Constants include all static strings and xpaths.
HomePage has all wraper methods around basepage to concise test steps
Standard testng.xml has mention of only test class.

POM has test profile which executes above testng.xml
All dependencies needed for project to run

I tried using <scope>test</scope> for testng deoendecy but i kept on getting error,
i double checked with junit and it works.
There are some stackoverflow threads about problem with testng test scope.
So for now was not able to use test scope with testng.

Allure has been used for reporting tool
and location is mentioned in allure.properties 
under resources i.e target/allure-results. Tests will appear there after running complete maven build.

How to run maven build.

From project directory /conconv-master
mvn test -P test
It should run all tests in test class.
To see test results in allure (allure needs to be installed)
From the project directory  /conconv-master
cd target
allure serve allure-results



