package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest{

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setupTest(){
        openBrowser(baseUrl);
    }

    @Test
     public void tabclick() {
        WebElement loginTabs = driver.findElement(By.linkText("Computers"));
        loginTabs.click();
        driver.findElement(By.xpath("//*[@class=\"top-menu notmobile\"]/li/a"));


        WebElement ElecTabs = driver.findElement(By.linkText("Electronics"));
        ElecTabs.click();
        driver.findElement(By.xpath("//*[@class=\"top-menu notmobile\"]/li[2]/a"));

      WebElement Apperaltab = driver.findElement(By.linkText("Apparel"));
       Apperaltab.click();
       driver.findElement(By.xpath("//*[@class=\"top-menu notmobile\"]/li[3]/a"));


        WebElement DigtDontab  = driver.findElement(By.linkText("Digital downloads"));
        DigtDontab.click();
        driver.findElement(By.xpath("//*[@class=\"top-menu notmobile\"]/li[4]/a"));


       WebElement bookbox = driver.findElement(By.linkText("Books"));
        bookbox.click();
       driver.findElement(By.xpath("//*[@class=\"top-menu notmobile\"]/li[5]/a"));


       WebElement jweltab = driver.findElement(By.linkText("Jewelry"));
        jweltab.click();
        driver.findElement(By.xpath("//*[@class=\"top-menu notmobile\"]/li[6]/a"));

        WebElement gifttab = driver.findElement(By.linkText("Gift Cards"));
        gifttab.click();
        driver.findElement(By.xpath("//*[@class=\"top-menu notmobile\"]/li[7]/a"));
    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}

