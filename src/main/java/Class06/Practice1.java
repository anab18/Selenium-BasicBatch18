package Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        WebElement alert3=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3.click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("Hello");
        alert.accept();



    }
}
