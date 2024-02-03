package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        //go to syntax projects.com
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        //find the drop down
        WebElement dd = driver.findElement(By.xpath("//select[@id='select-demo']"));

//        use select class
        Select sel=new Select(dd);

        sel.selectByIndex(2);
        Thread.sleep(2000);
        sel.selectByValue("Sunday");
        Thread.sleep(2000);
        sel.selectByVisibleText("Saturday");
        



    }
}
