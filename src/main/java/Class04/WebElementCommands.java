package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementCommands {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
//
        driver.manage().window().maximize();

//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/selenium_commands_selector.php");

//        send keys after clearing hte text box
        WebElement textBox = driver.findElement(By.xpath("//input[@id='textInput']"));
//        clear the text from the element
        textBox.clear();
//        send keys
        textBox.sendKeys("welcome");

//        check if the option 1 is selected
//        if no then select it
        WebElement option1 = driver.findElement(By.xpath("//input[@name='radioDemo' and @value='option1']"));

//        check if the radio button is selected
        boolean stateofOp1 = option1.isSelected();
        if (!stateofOp1) {
            option1.click();
//to print down the state of option 1
            System.out.println("The state of radiobutton1 is  " + option1.isSelected() + ".");
            WebElement option2 = driver.findElement(By.xpath("//input[@value='option2']"));

            // to check if option 2 is enable or not enable
            boolean enableStateofOp2 = option2.isEnabled();
            if (enableStateofOp2) {
                System.out.println("Option is enable and can be selected.");
            } else {
                System.out.println("The option2 is not enabled and not clickable.");

                //check if the option 3 is displayed or not
                //and print the status on console
                WebElement option3 = driver.findElement(By.xpath("//input[@value='option3']"));
                 boolean isDisplayedOp3 = option3.isDisplayed();
                if (isDisplayedOp3) {
                    System.out.println("The radio button option3 is displayed.");
                } else {
                    System.out.println("The radio button option3 is not displayed.");

                    //get the text
                    WebElement textMsg = driver.findElement(By.xpath("//div[@id='textElement']"));
                    String text = textMsg.getText();
                    System.out.println(text);

                    //get the attribute value and print on screen
                    WebElement attribute = driver.findElement(By.xpath("//div[text()='inspect me to view my custom attribute!']"));
                    String value = attribute.getAttribute("id");
                    System.out.println(value);
                    //homework 3 spat
                    ////input[@id='favorite-book']/following-sibling::input[1]
                    ////input[@id='least-favorite']
                    ////input[@id='least-favorite']/preceding-sibling::input[1]
                    ////div[@id='familyTree']/child::input[1]

                }
            }


        }
    }}
