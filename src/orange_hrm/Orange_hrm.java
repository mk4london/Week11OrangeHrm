package orange_hrm;
        /*https://opensource-demo.orangehrmlive.com/
        (Username:Admin|Password:admin123)
        Enter username
        Enter password
        Click login
        Verify that the text “Welcome Paul”
        After Paul one symbol there so click on symbol for logout.
        Verify that the below text.
        LOGIN Panel

        */

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Orange_hrm {
    WebDriver driver;

    @Before
    public void verify_User_Can_Open_Browser() {
        System.setProperty("Webdriver.Chrome.driver","drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");


    }
    @Test
    public void verify_User_Can_Login(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

    }
}

