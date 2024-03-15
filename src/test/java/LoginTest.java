import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    void LoginTest() {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        WebDriver driver=new FirefoxDriver();

        driver.get("https://spb.hh.ru/resume/1c7aa11cff0119050f0039ed1f54416c666f47");
        System.out.println(driver.getTitle());

    }
}
