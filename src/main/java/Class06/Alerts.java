package Class06;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
         //          find the alert1
        WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1.click();
        Thread.sleep(2000);
        //        switch the focus of the driver to alert
        Alert alertHandler = driver.switchTo().alert();
        alertHandler.accept();

        //        find the alert2 button
        WebElement alert2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2.click();
        Thread.sleep(2000);
        System.out.println(alertHandler.getText());
        alertHandler.dismiss();

       //find the alert3 button

        WebElement alert3=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3.click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("Hello");
        alert.accept();






    }
}
