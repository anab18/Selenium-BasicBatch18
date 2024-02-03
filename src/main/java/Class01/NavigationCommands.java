package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
    public static void main(String[] args) throws InterruptedException {
        //initiate the instance of webdriver

        WebDriver driver = new ChromeDriver();

        //maximize

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        //facebook
        driver.navigate().to("https://www.fb.com");
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        //refrash

        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.close();
    }
}