package Class06.Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Syntax {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement logIn=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        logIn.sendKeys("admin");
        WebElement passWord=driver.findElement(By.xpath("//input[@name='txtPassword']"));
        passWord.sendKeys("Hum@nhrm123");
        Thread.sleep(2000);
        WebElement click=driver.findElement(By.xpath("//input[@value='LOGIN']"));
        click.click();
        Thread.sleep(2000);
        WebElement pim=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pim.click();
        Thread.sleep(12000);
        WebElement EmployeeName=driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']"));
        EmployeeName.sendKeys("Anna");
        WebElement Id=driver.findElement(By.xpath("//input[@name='empsearch[id]']"));
        Id.sendKeys("123456");
        WebElement EmployeeStatus=driver.findElement(By.xpath("//select[@id='empsearch_employee_status']"));
        Select sel=new Select(EmployeeStatus);
        sel.selectByIndex(1);
        WebElement include=driver.findElement(By.xpath("//select[@id='empsearch_termination']"));
        Select sel1=new Select(include);
        sel1.selectByIndex(0);
        WebElement title=driver.findElement((By.xpath("//select[@id='empsearch_job_title']")));
        Select sel2=new Select(title);
        sel2.selectByIndex(1);


    }
}
