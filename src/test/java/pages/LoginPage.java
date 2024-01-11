package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.time.Duration;

import static helper.Utility.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {

    By login_link = By.xpath("//a[@id = 'login2']");
    By input_username = By.xpath("//input[@id = 'loginusername']");
    By input_pwd = By.xpath("//input[@id = 'loginpassword']");
    By btn_login = By.xpath("//button[@onclick = 'logIn()']");

    public void goToLoginPage() {
        driver.get("https://www.demoblaze.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //add delay
        driver.findElement(login_link).click();
    }

    public void inputUsernameLogin(String username) {driver.findElement(input_username).sendKeys(username);}

    public void inputPwdLogin(String pwd) {
        driver.findElement(input_pwd).sendKeys(pwd);
    }

    public void clickBtnLogin(){
        driver.findElement(btn_login).click();
    }

    public void navMenuShow(String Message){
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
        w.until(ExpectedConditions.visibilityOfElementLocated( By.xpath("//*[text() = '" + Message + "']") ));

        driver.findElement(By.xpath("//*[text() = '" + Message + "']")).isDisplayed();
    }

    public void assert_login_message_show(String Message){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        assertTrue(alert.getText().contains(Message));
    }

}
