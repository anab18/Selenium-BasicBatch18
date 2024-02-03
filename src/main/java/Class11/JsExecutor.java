package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JsExecutor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/simple_context_menu.php");
        //        to draw a boundary around the WebElement
        WebElement hoverBtn = driver.findElement(By.xpath("//button[text()='Hover me!']"));

//        using java script executor
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0]. setAttribute('style', 'background: pink; border: 2px solid red;');",hoverBtn);
        //scroll down
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
//        scroll up
        js.executeScript("window.scrollBy(0,-1000)");
        //        get the click button
        WebElement clickBtn = driver.findElement(By.xpath("//button[text()='Right Click!']"));
        js.executeScript("arguments[0]. click();",clickBtn);




    }
}
