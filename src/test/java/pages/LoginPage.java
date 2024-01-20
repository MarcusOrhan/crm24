package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
  
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public WebElement button(String buttonText){
        return Driver.getDriver().findElement(By.xpath(""));
    }

    @FindBy(id = "")
    public WebElement outPut;
 }
