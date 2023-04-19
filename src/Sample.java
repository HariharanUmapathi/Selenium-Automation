import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

    public static void main(String[] args) {
        try {
            // System Property for Chrome Driver
            System.setProperty("webdriver.chrome.driver",
                    "E:\\Selenium-Workspace\\Libraries\\chromedriver_win32\\chromedriver.exe");

            // Instantiate a ChromeDriver class.
            WebDriver driver = new ChromeDriver();

            // Launch Website
            driver.navigate().to("http://localhost/");

            // Maximize the browser
            driver.manage().window().maximize();

            // Scroll down the webpage by 5000 pixels
            //JavascriptExecutor js = (JavascriptExecutor) driver;
            //js.executeScript("scrollBy(0, 5000)");

            // Click on the Search button
            driver.findElement(By.linkText("Name")).click();
            Thread.sleep(3000);
            driver.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}