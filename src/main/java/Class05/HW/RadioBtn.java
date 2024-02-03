package Class05.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioBtn {
    public static void main(String[] args)  {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement enableButton = driver.findElement(By.xpath("//button[@id='enabledradio']"));
        enableButton.click();
        WebElement radioBtnMale= driver.findElement(By.xpath("//input[@value='gender-male' and @name='gender-identity' ]"));
       if(radioBtnMale.isEnabled()){
          radioBtnMale.click();

       }


    }
    }
