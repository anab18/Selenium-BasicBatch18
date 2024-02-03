package Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        String Alerts="https://syntaxprojects.com/javascript-alert-box-demo.php";
       driver.get(Alerts);
        WebElement alert1=driver.findElement(By.xpath("//p[contains(text(),'Click')]/following::button[1]"));
        WebElement alert2=driver.findElement(By.xpath("//p[contains(text(),'Click')]/following::button[2]"));
        WebElement alert3=driver.findElement(By.xpath("//p[contains(text(),'Click')]/following::button[3]"));
        alert3.click();
        Thread.sleep(2000);

        Alert alert=driver.switchTo().alert();
        String alertText=alert.getText();
        System.out.println(alertText);
        //alert.accept();
        //alert.dismiss();
        //alert.getText();
        alert.sendKeys("Syntax");
        alert.accept();

}
}