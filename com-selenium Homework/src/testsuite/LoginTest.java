package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
public void setupTest(){
        openBrowser(baseUrl);
    }

    @Test
        public void Login(){
        WebElement loginLink =driver.findElement(By.className("ico-login"));
        loginLink.click();


       String actualWelcomeText = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")).getText();
        String expectingWelcomeText = "Welcome, Please Sign In!";
        Assert.assertEquals("Validating welcome text",expectingWelcomeText,actualWelcomeText);

        WebElement emailField = driver.findElement(By.id("Email"));
       emailField.sendKeys("Ram_sita@yahoo.com");

        WebElement passwordFied = driver.findElement(By.id("Password"));
        passwordFied.sendKeys("Ramsita@1950");

        WebElement loginButton = driver.findElement(By.linkText("Log in"));
       loginButton.click();

        //Invalid Credential//

      WebElement emailField1 = driver.findElement(By.id("Email"));
        emailField1.sendKeys("Ram_sita@yahoo.com");
        //driver.findElement(By.xpath("//input[@id=\"Email\"]"));

        WebElement passwordFied1 = driver.findElement(By.id("Password"));
       passwordFied1.sendKeys("Ramsiya@1955");
       //driver.findElement(By.xpath("//div[@id=\"main\"]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[2]"));

       WebElement loginButton1 = driver.findElement(By.linkText("Log in"));
        loginButton1.click();
        //driver.findElement(By.xpath("//div[@id=\"main/div/div/div/div[2]/div[1]/from/div[3]/button"));

      String actualErrormsgText = driver.findElement(By.xpath("//div[@class='message-error validation-summary-error']")).getText();
        System.out.println(actualErrormsgText);
        String expectingErrormsgText = "Login was unsuccessful. Please correct the errors and try again.\n" +
             "No customer account found";
        Assert.assertEquals(expectingErrormsgText,actualErrormsgText);


    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
