# FinalProjectRianaArdiansari

Automation Test Framework API & Web UI

Specifications
1. Using IntelliJ IDEA tools
2. Creating new project with Java Language, Gradle Build system, Groovy Gradle DSL
3. Testing with JUnit, HTTP client library using Request, project structure with utilities
4. Libraries and Tools are used:
    - JUnit
    - Cucumber
    - Rest Assured
    - Selenium
    - Github
    - Github Actions
5. Creating Scenario with Gherkin format
6. Creating folder feature, stepDef, pages, helper, runner package
7. Creating class Models, Utility, Endpoint, ApiRunner function
8. Creating reports with json and html format

Run the Automation Testing
1. Set up Github Actions Configuration
2. Configurations is located at .github/workflows/web-api-automation-workflow.yml
    - Execute Web UI Testing
      name: Execute Web Test
      run: ./gradlew webTest
    - Execute API Testing
      name: Execute API Test
      run: ./gradlew apiTest
3. Performing a pull, push, and build to the repository
4. Automation Testing run automatically

Test Result