# io.mersys

# Used Technologys

![Maven Central](https://img.shields.io/maven-central/v/org.seleniumhq.selenium/selenium-java?versionSuffix=4.11.0&style=%20for-the-badge&logo=Selenium&label=Selenium&labelColor=black&color=grey)
![Maven Central](https://img.shields.io/maven-central/v/io.cucumber/cucumber-java?versionSuffix=7.9.0&style=%20for-the-badge&logo=Cucumber&label=Cucumber&labelColor=black&color=grey)
![Maven Central](https://img.shields.io/maven-central/v/org.testng/testng?versionSuffix=6.14.3&style=%20for-the-badge&logo=testng&label=TestNG&labelColor=black&color=grey)
![Maven Central](https://img.shields.io/maven-central/v/org.slf4j/slf4j-api?versionSuffix=1.8.0-beta2&style=%20for-the-badge&logo=slfj&label=Slfj&labelColor=black&color=grey)
![Maven Central](https://img.shields.io/maven-central/v/org.apache.commons/commons-lang3?versionSuffix=3.12.0&style=%20for-the-badge&label=Apache-Commons&labelColor=black&color=grey)
![Maven Central](https://img.shields.io/maven-central/v/tech.grasshopper/extentreports-cucumber7-adapter?versionSuffix=1.9.2&style=%20for-the-badge&logo=Grasshopper&label=Grasshopper&labelColor=black&color=grey)
![Maven Central](https://img.shields.io/maven-central/v/org.apache.poi/poi?versionSuffix=4.1.0&style=%20for-the-badge&label=ApachePOI&labelColor=black&color=grey)


List of Dependencies
----------------

| Package     | Description                           |
|-------------|---------------------------------------|
| TestNG      | Next Generation Testing Tool.         |
| Selenium    | Browser Automation Framework.         |
| slf4j       | The Simple Logging Facade for Java.   |
| commons.io  | The Apache Commons IO library.        |
| cucumber    | Cucumber is a tool that supports BDD. |
| grasshopper | HTML & PDF Report tool.               |

## File Structure

```bash
|-- src
|   |-- main
|       |-- java
|       |-- resources
|
|   |-- test
|       |-- java
|           |-- ApachePOI
|           |-- featureFiles
|               |-- Feature Files
|           |-- pages
|               |-- Body, Header, LoginPage, Methods
|           |-- runners
|               |-- AllTestRunner
|               |-- ParallelTestRunner
|               |-- RegressionTestRunner
|               |-- SmokeTestRunner
|           |-- StepDefinitions
|               |-- Hooks
|               |-- * Test Class Files
|           |-- Utilities
|               |-- BaseDriver
|               |-- Config
|               |-- ExcelUtility
|           |-- XML
|               |-- XMLRUNNER
|       |-- resources
|       |-- results
|           |-- reports*
|           |-- .gitignore
|
|-- .gitignore
|-- pom.xmlTestRunner

```

