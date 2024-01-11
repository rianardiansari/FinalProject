package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginStep {
    LoginPage loginPage;

    public LoginStep() {
        this.loginPage = new LoginPage();
    }

    @Given("user go to login page")
    public void userGoToSignUpPage() {loginPage.goToLoginPage();}

    @And("user input username login {string}")
    public void userInputUsernameLogin(String username) {loginPage.inputUsernameLogin(username);}

    @And("user input pwd login {string}")
    public void userInputPwdLogin(String pwd) {
        loginPage.inputPwdLogin(pwd);
    }

    @And("user click button login")
    public void userClickButtonLogin() {
        loginPage.clickBtnLogin();
    }

    @Then("nav menu show {string}")
    public void navMenuShow(String Message) throws InterruptedException {
        loginPage.navMenuShow(Message);
    }

    @Then("login message show {string}")
    public void loginMessageShow(String Message) throws InterruptedException {
        loginPage.assert_login_message_show(Message);
    }

}