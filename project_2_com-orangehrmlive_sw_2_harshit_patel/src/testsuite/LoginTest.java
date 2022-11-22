package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        // Find the email field element and send the email
        sendTextToElement(By.name("username"), "Admin");

        // Find the password field element and send the password
        sendTextToElement(By.name("password"), "admin123");

        // Find the login button and click on it
        clickOnElement(By.xpath("//button[@type='submit']"));

        //Expected Result
        String expectedMessage = "Dashboard";

        // Find the Log out text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h6[text()='Dashboard']"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }

    @After
    public void closeBrowser() {
        //to close all associated window where selenium is running test.
        driver.quit();
    }


}
