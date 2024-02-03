package Class10.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Month;
import java.util.List;

public class WebCalendar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");

       WebElement Calendar=driver.findElement(By.xpath("//input[@id='start_date']"));
       Calendar.click();
       
       boolean August=true;
       while(August){
       String Month= driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]")).getText();
       if(Month.equals("August 2024")) {
           August = false;
       }
       if(August) {
           WebElement next = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[3]"));
           next.click();
       }}
         /*WebElement date= driver.findElement(By.xpath("//table/tbody/tr[5]/td[7]"));
         date.click();
      /* }
       }
       List<WebElement>date=driver.findElements(By.xpath("//table/tbody/tr[5]/td[7]"));
       for(WebElement thirtyFirst: date) {
           thirtyFirst.click();

       }*/


        //select the date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));

//        iterate
        for(WebElement date:allDates){
            if(date.getText().equals("31") && date.getAttribute("class").equals("day")){
                date.click();

            }
}}}

