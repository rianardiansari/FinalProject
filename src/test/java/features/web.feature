Feature: UI Web Automation

    @web
    Scenario: Test web sign up normal
        Given user go to sign up page
        And user input username with generated value
        And user input pwd "admin123"
        And user click button sign up
        Then sign up message show "Sign up successful."

    @web
    Scenario: Test web sign up with existing username
        Given user go to sign up page
        And user input username "rianaardiansari"
        And user input pwd "admin123"
        And user click button sign up
        Then sign up message show "This user already exist."

    @web
    Scenario: Test web sign up with empty username
        Given user go to sign up page
        And user input username ""
        And user input pwd "admin123"
        And user click button sign up
        Then sign up message show "Please fill out Username and Password."

    @web
    Scenario: Test web sign up with empty password
        Given user go to sign up page
        And user input username "rianaardiansari"
        And user input pwd ""
        And user click button sign up
        Then sign up message show "Please fill out Username and Password."

    @web
    Scenario: Test web login normal
        Given user go to login page
        And user input username login "rianaardiansari"
        And user input pwd login "admin123"
        And user click button login
        Then nav menu show "Welcome rianaardiansari"

    @web
    Scenario: Test web login with existing username
        Given user go to login page
        And user input username login "xyz123lkfjfkl"
        And user input pwd login "123"
        And user click button login
        Then login message show "User does not exist."

    @web
    Scenario: Test web login with empty username
        Given user go to login page
        And user input username login "rianaardiansari"
        And user input pwd login ""
        And user click button login
        Then login message show "Please fill out Username and Password."

    @web
    Scenario: Test web login with empty password
        Given user go to login page
        And user input username login ""
        And user input pwd login "admin123"
        And user click button login
        Then login message show "Please fill out Username and Password."