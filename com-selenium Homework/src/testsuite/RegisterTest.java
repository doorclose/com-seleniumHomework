package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }

    @Test
    public void reg() {
        //Register
        WebElement registab = driver.findElement(By.linkText("Register"));
        registab.click();

        //gender button
        WebElement gendertab = driver.findElement(By.id("gender-male"));
        gendertab.click();

        //First name
        WebElement firtnametab = driver.findElement(By.id("FirstName"));
        firtnametab.sendKeys("Ram");
        firtnametab.click();

        //last name
        WebElement lastnametab = driver.findElement(By.id("LastName"));
        lastnametab.sendKeys("Sita");
        lastnametab.click();

        //Date of Birth-date
        WebElement dobtab = driver.findElement(By.name("DateOfBirthDay"));
        dobtab.sendKeys("01");
        dobtab.click();
        //  by month
        WebElement dobmontab = driver.findElement(By.name("DateOfBirthMonth"));
        dobmontab.sendKeys("01");
        dobmontab.click();

        //by year
        WebElement dobyeartab = driver.findElement(By.name("DateOfBirthYear"));
        dobyeartab.sendKeys("1950");
        dobyeartab.click();

        //by email

        WebElement emailtab = driver.findElement(By.id("Email"));
        emailtab.sendKeys("Ramsita@yahoo.com");
        emailtab.click();

        //by password
        WebElement passwrodtab = driver.findElement(By.id(("Password")));
        passwrodtab.sendKeys("Ramsita@1950");
        passwrodtab.click();

        //By confirm password
        WebElement confmpassvrd = driver.findElement(By.id("ConfirmPassword"));
        confmpassvrd.sendKeys("Ramsita@1950");
        confmpassvrd.click();


        //By register

        WebElement registtab = driver.findElement(By.id("register-button"));
        registtab.click();

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}


