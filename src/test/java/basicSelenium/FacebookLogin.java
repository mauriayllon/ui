package basicSelenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FacebookLogin {

    ChromeDriver driver;

    @Before
    public void before(){

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromeDriver/chromedriver");
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Test
    public void loginTodoLy() throws InterruptedException {
        driver.get("http://facebook.com");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("65561070");
        //3) Set Password
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("teamao");
        //4) Click Login Button
        //tdriver.findElement(By.xpath("//input[@name='ctl00$MainContent$LoginControl1$ButtonLogin']")).click();
    }



    @After
    public void after() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}

