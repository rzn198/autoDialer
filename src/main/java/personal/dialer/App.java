package personal.dialer;

import org.openqa.selenium.WebDriver;

public class App
{
    public static void main( String[] args ) throws InterruptedException {

        WebDriver driver = Instance.get("https://sarajevo.kdmid.ru/queue/orderinfo.aspx", "4018", "4EECF6A0" );

        WebDriver driver1 = Instance.get("https://sarajevo.kdmid.ru/queue/orderinfo.aspx", "4018", "4EECF6A0" );


        Thread.sleep(60000);

        driver.quit();
        driver1.quit();
    }
}
