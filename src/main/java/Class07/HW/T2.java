package Class07.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T2 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//click on button "click to display button" and click on the displayed button
        driver.findElement(By.xpath("//button[@id='display_button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Enabled']")));
        WebElement DisplayButton=driver.findElement(By.xpath("//button[text()='Enabled']"));
        DisplayButton.click();
//click on "click me to enable button" click on the button below

driver.findElement(By.xpath("//button[@id='enable_button']")).click();
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));
driver.findElement(By.xpath("//button[text()='Button'] ")).click();

//click on click to check the check box get the state of selected check box after its checked and print on console

        driver.findElement(By.xpath("//button[@id='checkbox_button'] ")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkbox']")));
        WebElement checked=driver.findElement(By.xpath("//input[@id='checkbox']"));
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));
        System.out.println(checked.isSelected());


    }
}
