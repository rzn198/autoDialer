package personal.dialer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instance {

    public static WebDriver get (String address, String number, String protectionCode) {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get(address);

        WebElement orderNumber = driver.findElement(By.id("ctl00_MainContent_txtID"));

        WebElement code = driver.findElement(By.id("ctl00_MainContent_txtUniqueID"));

        orderNumber.sendKeys(number);

        code.sendKeys(protectionCode);

        return driver;

    }

}
