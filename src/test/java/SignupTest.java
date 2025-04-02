import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignupTest {
    WebDriver chromeDriver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/domlu/OneDrive - Florida Gulf Coast University/Spring 2025/ST/Installations/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        chromeDriver = new ChromeDriver(); // why new?
        chromeDriver.manage().window().maximize();
    }

    @Test
    public void enterCredentials(){
        chromeDriver.get("https://www.spotify.com/us/signup?forward_url=https%3A%2F%2Fopen.spotify.com%2F");


    }


}
