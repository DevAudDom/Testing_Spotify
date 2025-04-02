import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.PriorityQueue;

public class SignupTest {
    WebDriver chromeDriver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/domlu/OneDrive - Florida Gulf Coast University/Spring 2025/ST/Installations/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        chromeDriver = new ChromeDriver(); // why new?
        chromeDriver.manage().window().maximize();
    }

    @Test ()
    public void enterNewEmail() throws InterruptedException {
        chromeDriver.get("https://www.spotify.com/us/signup?forward_url=https%3A%2F%2Fopen.spotify.com%2F");

        WebElement emailAddress = chromeDriver.findElement(By.id("username"));
        emailAddress.sendKeys("dalucien2792@eagle.fgcu.edu");
        WebElement nextButton = chromeDriver.findElement(By.cssSelector(".Button-sc-qlcn5g-0.VsdHm.encore-text-body-medium-bold"));
        Thread.sleep(2000);
        nextButton.click();
        Thread.sleep(2000);
    }
    @Test ()
    public void enterNewPassword() throws InterruptedException {
        WebElement newPassword = chromeDriver.findElement(By.id("new-password"));
        newPassword.sendKeys("123456789a");
        WebElement nextButton = chromeDriver.findElement(By.cssSelector(".Button-sc-qlcn5g-0.VsdHm.encore-text-body-medium-bold"));
        Thread.sleep(2000);
        nextButton.click();
    }


}
