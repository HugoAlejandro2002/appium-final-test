package basicAppium;

import java.util.UUID;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CreateTaskTest {
    AppiumDriver driver;

    @BeforeEach
    public void openApp() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:deviceName","UPBV9");
        capabilities.setCapability("appium:platformVersion","9.0");
        capabilities.setCapability("appium:appPackage","com.vrproductiveapps.whendo");
        capabilities.setCapability("appium:appActivity","ui.HomeActivity");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appium:automationName","uiautomator2");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterEach
    public void closeApp(){
        driver.quit();
    }

    @Test
    public void addTaskTest() throws InterruptedException {
        String name = "Task " + UUID.randomUUID().toString();
        String note = "Note " + UUID.randomUUID().toString();

        driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id=\"com.vrproductiveapps.whendo:id/fab\"]")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.vrproductiveapps.whendo:id/noteTextTitle\"]")).sendKeys(name);
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.vrproductiveapps.whendo:id/noteTextNotes\"]")).sendKeys(note);
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/saveItem")).click();

        String actualName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.vrproductiveapps.whendo:id/home_list_item_text\" and @text='" + name + "']")).getText();
        String actualNote = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.vrproductiveapps.whendo:id/home_list_item_text2\" and @text='" + note + "']")).getText();

        Assertions.assertEquals(name, actualName);
        Assertions.assertEquals(note, actualNote);
    }
}
