package Class09.HW.Birthday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Birthday {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.xpath("//b[text()='Leave']")).click();
        driver.findElement(By.xpath("//input[@id='calFromDate']")).click();

      WebElement month= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
       Select sel = new Select(month);
        sel.selectByVisibleText("Jul");

        WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select sel1 = new Select(year);
        sel1.selectByVisibleText("2000");

        List<WebElement> date = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar'] /tbody/tr/td"));
        for(WebElement d:date){
            if(d.getText().equals("29")){
                d.click();

            }
        }


    }
}
