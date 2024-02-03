package Class04.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebEle {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath.php");
        //3 favorite books
        WebElement firstFavoriteBook=driver.findElement(By.xpath("//input[@id='favourite-book']"));
        firstFavoriteBook.sendKeys("Never Quit");
        WebElement secondFavoriteBook=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        secondFavoriteBook.sendKeys("King of Green");
        WebElement thirdFavoriteBook=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[2]"));
        thirdFavoriteBook.sendKeys("True Love");
        //3  previous books
        WebElement pre1=driver.findElement(By.xpath("//input[@id='least-favorite']"));
       pre1.sendKeys("Remember me");
       WebElement pre2=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        pre2.sendKeys("Red Rose");
        WebElement pre3=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        pre3.sendKeys("Living your best life");
        //grandparent,parent,child
        WebElement grandParent=driver.findElement(By.xpath("//div[@id='familyTree']//child::input[1]"));
        grandParent.sendKeys("grandparent");
        WebElement parent=driver.findElement(By.xpath("//div[@id='familyTree']//child::input[2]"));
        parent.sendKeys("parent");
        WebElement child=driver.findElement(By.xpath("//div[@id='familyTree']//child::input[3]"));
        child.sendKeys("child");






    }
}
