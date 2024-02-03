package Class02.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class faceBook {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement createAccount=driver.findElement(By.partialLinkText("new account"));
        createAccount.click();
        Thread.sleep(6000);
        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("Leonardo");
        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("DiCaprio");
        WebElement phoneNrOrEmail= driver.findElement(By.name("reg_email__"));
        phoneNrOrEmail.sendKeys("syntax@gmail.com");
        WebElement reEnterPhoneOrEmail=driver.findElement(By.name("reg_email_confirmation__"));
        reEnterPhoneOrEmail.sendKeys("syntax@gmail.com");
        WebElement passWord=driver.findElement(By.name("reg_passwd__"));
        passWord.sendKeys("SyntaxBatch18");
        Thread.sleep(6000);
        driver.quit();

    }
}
