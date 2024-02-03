package Class05.ReviewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        //        get the create new account
        WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();
//        find the drop dwon
        WebElement DD = driver.findElement(By.xpath("//select[@id='day']"));
        Select sel= new Select(DD);
        sel.selectByVisibleText("12");

        System.out.println(sel.isMultiple());

    }
}