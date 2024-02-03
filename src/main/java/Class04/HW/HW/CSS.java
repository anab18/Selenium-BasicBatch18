package Class04.HW.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");
        WebElement feedback=driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedback.sendKeys("website is too slow");
        WebElement email=driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("syntax.Batch18@yahoo.com");}}

