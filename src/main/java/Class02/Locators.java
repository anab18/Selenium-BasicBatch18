package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //fined the webelement and send ur email
        WebElement email=driver.findElement(By.id("email"));
       email.sendKeys("myFacebook@gmail.com");
// find element passord and send
        WebElement password=driver.findElement(By.name("pass"));
    password.sendKeys("Fb12345");
//find the elemen log in botton
        WebElement login= driver.findElement(By.name("login"));
       // login.click();



        //goto the botton to creat a account
        //WebElement createAccount=driver.findElement(By.findElement("Create new account"));
       WebElement createAccount=driver.findElement(By.partialLinkText("new account"));
       createAccount.click();






    }
}
