import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelIntroduction  {

    public static void main(String[] args) {
        //Course - Selenium WebDriver with Java - Basics to Advanced+Frameworks


        //Invoking Browser
        // Chorme - ChromeDriver -> Methods
        // Firefox - FirefoxDriver -> Methods
        // Safari

        // webDriver on top of below    close   get
        // WebDriver methods + class methods

        // chromedriver.exe -> chrome browser Selenium Manager
        // Step to invoke chrome driver
        // Selenium Manager

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\JanaLukjanska\\Desktop\\automation\\chromedriver-win64\\chromedriver.exe");


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");


        WebDriver driver = new ChromeDriver(options);

        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();





        }
    }
