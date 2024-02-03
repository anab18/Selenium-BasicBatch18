package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class DynamicTable {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
//
        driver.manage().window().maximize();
//        goto hrms
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();

//click on PIm option
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        //        get the column with the ids
        List<WebElement> ids = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

//        iterate to find the row number
        for( int i=0 ;i<ids.size();i++){

            String id = ids.get(i).getText();

            if(id.equals("95843A")){
//                print the row number
                System.out.println(i+1);
                WebElement checkbox = driver.findElement(By.xpath("//table/tbody/tr[" + (i + 1) + "]/td[1]"));
                checkbox.click();
            }
        }
    }
}
