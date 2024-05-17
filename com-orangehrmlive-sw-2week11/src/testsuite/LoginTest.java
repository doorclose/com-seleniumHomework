package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    @Before
    public void setUsernamefield() {

    }

    @Test
    public void Username1() {

        WebElement usernamefield = driver.findElement(By.id("txtUsername"));
        usernamefield.sendKeys("Admin");

        WebElement passwordfield1 = driver.findElement(By.id("txtPassword"));
        passwordfield1.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.id("Loginbutton"));
        loginButton.click();

        //Verify "Dashboard

      /*  WebElement Dashboard = driver.findElement(By.tagName("hi"));
        Assert.assertEquals(Dashboard.getText(), "Dashboard", "Dashboard text is not dispaly");*/
    }
    @After
    public void closebroser(){

    }
}