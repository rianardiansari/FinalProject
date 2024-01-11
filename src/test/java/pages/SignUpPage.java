package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.time.Duration;

import static helper.Utility.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUpPage {

    By sign_up_link = By.xpath("//a[@id = 'signin2']");
    By input_username = By.xpath("//input[@id = 'sign-username']");
    By input_pwd = By.xpath("//input[@id = 'sign-password']");
    By btn_sign_up = By.xpath("//button[@onclick = 'register()']");


    public void goToSignUpPage() {
        driver.get("https://www.demoblaze.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //add delay
        driver.findElement(sign_up_link).click();
    }

    public void inputUsernameWithGeneratedValue() {driver.findElement(input_username).sendKeys(generateRandomUsername());}

    public void inputUsername(String username) {driver.findElement(input_username).sendKeys(username);}

    public void inputPwd(String pwd) {
        driver.findElement(input_pwd).sendKeys(pwd);
    }

    public void clickBtnSignUp(){
        driver.findElement(btn_sign_up).click();
    }

    public void assert_signup_message_show(String Message) throws InterruptedException {
        Thread.sleep(2500);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        assertTrue(alert.getText().contains(Message));
    }
}
