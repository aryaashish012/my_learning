package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    private By loginIcon = By.id("util-account");
    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private By signInBtn = By.id("signInBtn");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPopup() {
        driver.findElement(loginIcon).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickSignIn() {
        driver.findElement(signInBtn).click();
    }
}
