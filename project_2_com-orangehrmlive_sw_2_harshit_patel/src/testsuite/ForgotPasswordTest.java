package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        clickOnElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));

        //Expected Result
        String expectedMessage = "Reset Password";

        // Find the Reset Password text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Reset Password page", expectedMessage, actualMessage);
    }
    @After
    public void closeBrowser() {
        //to close all associated window where selenium is running test.
        driver.quit();
    }
}
