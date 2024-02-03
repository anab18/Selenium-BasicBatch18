package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class MultipleElements {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        //get all the links from ebay.com
        List<WebElement>allLinks=driver.findElements(By.tagName("a"));
    for(WebElement link:allLinks){
        //extracts the text from webelement
        String text=link.getText();
        System.out.println(text);
        //extrat the link from webelement
        String linkAddress=link.getAttribute("href");
        System.out.println(linkAddress);
    }

    }
}
