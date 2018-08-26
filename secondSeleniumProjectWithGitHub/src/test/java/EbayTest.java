import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EbayTest {
    ChromeDriver driver;

    @Test

    public void setUp ()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);

        driver.get("https://www.ebay.com/");

        driver.quit();
    }
}
