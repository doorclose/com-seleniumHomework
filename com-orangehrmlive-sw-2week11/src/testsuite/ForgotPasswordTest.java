package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }
        @Test
        public void Login () {
            // WebElement Forgetpsvrd = driver.findElement(By.linkText("Forgot your password?"));

            WebElement Forgetpsvrd = driver.findElement(By.xpath("//div[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p"));//
            Forgetpsvrd.click();


           // WebElement RsetpasswordText = driver.findElement(By.tagName("hi"));
         //   Assert.assertEquals(RsetpasswordText.getText(), "Reset Password", "Reset Password text is not displayed.");

        }
        @After
        public void closebroser () {

        }

    }
