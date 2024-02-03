package Class07.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits.php");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //click on button 2 select male
        driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']")).click();

        WebElement selectMale=driver.findElement(By.xpath("//input[@type='radio' and @value='Male']"));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='radio' and @value='Male']")));
        selectMale.click();

        //click on button3 select option1
        driver.findElement(By.xpath("//button[@id='show_text_synchronize_03']")).click();
        WebElement option1=driver.findElement(By.xpath("//input[@value='Option-1']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Option-1']")));
        option1.click();
    }
}


