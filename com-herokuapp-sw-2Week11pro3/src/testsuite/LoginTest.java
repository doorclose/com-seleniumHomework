package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


    public class LoginTest extends BaseTest {

        String baseUrl = "http://the-internet.herokuapp.com/login";

        @Before
        public void setupTest() {openBrowser(baseUrl);}

        @Test
        public void Login() {

    /*    WebElement userField = driver.findElement(By.name("username"));
            userField.sendKeys("tomsmith");

            WebElement passvrdField = driver.findElement(By.name("password"));
            passvrdField.sendKeys("SuperSecretPassword!");

            WebElement loginField = driver.findElement(By.xpath("//button[@class='radius']"));
            loginField.click();

            //InvalidUsername//

         WebElement UserField1 = driver.findElement(By.name("username"));
            UserField1.sendKeys("tomsmith1");

            WebElement passvrdField1= driver.findElement(By.name("password"));
            passvrdField1.sendKeys("SuperSecretPassword!");

            WebElement loginField1= driver.findElement(By.xpath("//button[@class='radius']"));
            loginField1.click(); */

            //Invalid Password//

         WebElement userField2 = driver.findElement(By.name("username"));
            userField2.sendKeys("tomsmith");

            WebElement passvrdField2 = driver.findElement(By.name("password"));
            passvrdField2.sendKeys("SuperSecretPassword");

            WebElement loginField2= driver.findElement(By.xpath("//button[@class='radius']"));
            loginField2.click();

        }
        @After
        public void closebrowser() {
            closeBrowser();
        }

    }












