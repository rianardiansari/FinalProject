package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.SignUpPage;

public class SignUpStep {
    SignUpPage signUpPage;

    public SignUpStep() {
        this.signUpPage = new SignUpPage();
    }

    @Given("user go to sign up page")
    public void userGoToSignUpPage() {
        signUpPage.goToSignUpPage();
    }

    @And("user input username with generated value")
    public void userInputUsernameWithGeneratedValue() {
        signUpPage.inputUsernameWithGeneratedValue();
    }

    @And("user input username {string}")
    public void userInputUsername(String username) {signUpPage.inputUsername(username);}

    @And("user input pwd {string}")
    public void userInputPwd(String pwd) {
        signUpPage.inputPwd(pwd);
    }

    @And("user click button sign up")
    public void userClickButtonSignUp() {
        signUpPage.clickBtnSignUp();
    }

    @Then("sign up message show {string}")
    public void signUpMessageShow(String Message) throws InterruptedException {
        signUpPage.assert_signup_message_show(Message);
    }

}