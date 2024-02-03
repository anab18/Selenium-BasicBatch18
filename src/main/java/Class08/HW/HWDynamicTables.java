package Class08.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HWDynamicTables {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        List<WebElement>list=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        int count=1;
        for(WebElement webElement: list){
          if( webElement.getText().equals("95935A")){
              System.out.println(count);
            WebElement checkBox= driver.findElement(By.xpath("//table/tbody/tr[" + count + "]/td[1]"));
            checkBox.click();
              break;
        }
             count=count+1;
        }
    }
}
