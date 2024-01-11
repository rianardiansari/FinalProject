# FinalProjectRianaArdiansari

<h2>Automation Test Framework API & Web UI</h2>

<h3>Specifications</h3>
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

<h3>Run the Automation Testing</h3>
1. Set up Github Actions Configuration
2. Configurations is located at .github/workflows/web-api-automation-workflow.yml
3. Execute Web UI Testing 
   - name: Execute Web Test
     run: ./gradlew webTest
4. Execute API Testing
   - name: Execute API Test
     run: ./gradlew apiTest 
5. Performing a pull, push, and build to the repository
6. Automation Testing run automatically

<h3>Test Result</h3>
<img width="1440" alt="Screenshot 2024-01-11 at 14 03 07" src="https://github.com/rianardiansari/FinalProjectRianaArdiansari/assets/149749846/df7de913-5175-4f20-9199-d18140bbea1a">
