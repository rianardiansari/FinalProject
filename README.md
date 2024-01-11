# FinalProjectRianaArdiansari

<h2>Automation Test Framework API & Web UI</h2>

<h3>Specifications</h3>
1. Using IntelliJ IDEA tools<br/>
2. Creating new project with Java Language, Gradle Build system, Groovy Gradle DSL<br/>
3. Testing with JUnit, HTTP client library using Request, project structure with utilities<br/>
4. Libraries and Tools are used:<br/>
    - JUnit<br/>
    - Cucumber<br/>
    - Rest Assured<br/>
    - Selenium<br/>
    - Github<br/>
    - Github Actions<br/>
5. Creating Scenario with Gherkin format<br/>
6. Creating folder feature, stepDef, pages, helper, runner package<br/>
7. Creating class Models, Utility, Endpoint, ApiRunner function<br/>
8. Creating reports with json and html format<br/>

<h3>API Test Case</h3>
<h4>https://dummyapi.io/docs/user</h4>
1. Get all users<br/>
2. Get user by ID<br/>
3. Create a new user<br/>
4. Delete a user<br/>
5. Update a user<br/>

<h4>https://dummyapi.io/docs/tag</h4>
1. Get list of tags<br/>

<h3>Web Test Case</h3>
https://www.demoblaze.com/#<br/>

<h4>Positive Case - Sign Up</h4>
1. Sign up successfully<br/>

<h4>Negative Case - Sign Up</h4>
1. Sign up with existing username<br/>
2. Sign up with empty username<br/>
3. Sign up with empty password<br/>

<h4>Positive Case - Login</h4>
1. Login successfully<br/>

<h4>Negative Case - Login</h4>
1. Login with existing username<br/>
2. Login with empty username<br/>
3. Login with empty password<br/>

<h3>Run the Automation Testing</h3>
1. Set up Github Actions Configuration<br/>
2. Configurations is located at .github/workflows/web-api-automation-workflow.yml<br/>
3. Execute Web UI Testing <br/>
   - name: Execute Web Test<br/>
     run: ./gradlew webTest<br/>
4. Execute API Testing<br/>
   - name: Execute API Test<br/>
     run: ./gradlew apiTest<br/>
5. Performing a pull, push, and build to the repository<br/>
6. Automation Testing run automatically<br/>

<h3>Test Result</h3>
<img width="1440" alt="Screenshot 2024-01-11 at 14 03 07" src="https://github.com/rianardiansari/FinalProjectRianaArdiansari/assets/149749846/df7de913-5175-4f20-9199-d18140bbea1a">
