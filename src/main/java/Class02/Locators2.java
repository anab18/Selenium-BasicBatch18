package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
//    enter user id
        WebElement name=driver.findElement(By.name("ctl00$MainContent$username"));
        name.sendKeys("Tester");

        //enter password( nu trebuie sa fie acceals din paranteza am addougat _
        WebElement pass=driver.findElement(By.id("ctl00_MainContent_password"));
        pass.sendKeys("test");
        //log in click

       WebElement loginBtn= driver.findElement(By.className("button"));
       loginBtn.click();

       //confir log this page
        WebElement massege=driver.findElement(By.className("login_info"));
       String text= massege.getText();
        System.out.println(text);
// confirmation
        //by using title
        String title=driver.getTitle();
        System.out.println(title);
        if(title.equals("Web Orders")) {
            System.out.println("you have logged in");
        }else{
            System.out.println("you have not logged in");
        }


    }
}
