package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");
WebElement inputBox=driver.findElement(By.cssSelector("input[id='profileID']"));
inputBox.sendKeys("hello");
WebElement priffileBox=driver.findElement(By.cssSelector("input#profileBox"));
priffileBox.sendKeys("ghsgdb");
WebElement feedbackBox=driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
feedbackBox.sendKeys("to slow");
        WebElement courseTopic = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopic.sendKeys("selenium");
        WebElement intro =driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        intro.sendKeys("easy");
        WebElement conclusion = driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("welldone");

       // HomeWork

        WebElement feedback=driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedback.sendKeys("website is too slow");
        WebElement email=driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("syntax.Batch18@yahoo.com");







    }
}
