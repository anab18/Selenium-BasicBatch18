package Class05.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class checkBox {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        WebElement enableCheckBox = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enableCheckBox.click();

        List<WebElement> options = driver.findElements(By.xpath("//input[@class='checkbox-field']"));
       for(WebElement option:options){
           String optionVal = option.getAttribute("value");
           if(optionVal.equals("Checkbox-1")||optionVal.equals("Checkbox-4")) {
               option.click();
             
       }
            }
        }}
