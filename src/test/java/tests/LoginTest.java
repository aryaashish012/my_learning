package tests;

import base.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginTest extends BaseTest {

    LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        initDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLoginFlow() throws InterruptedException {
        loginPage.openLoginPopup();
        Thread.sleep(3000); // Adjust for popup
        loginPage.enterEmail("dummy@email.com");
        loginPage.enterPassword("dummyPassword123");
        loginPage.clickSignIn();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown() {
        quitDriver();
    }
}
