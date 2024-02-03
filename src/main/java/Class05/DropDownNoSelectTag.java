package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class DropDownNoSelectTag {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php");
        WebElement dd=driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));


        List<WebElement>options=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
        for(WebElement option:options){
            String optionText=option.getText();
            if (optionText.equals("japen")) {
                option.click();

            }
        }









    }
}