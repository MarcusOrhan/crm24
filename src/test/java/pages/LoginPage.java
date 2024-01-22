package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement username;
    @FindBy(name = "USER_PASSWORD")
    public WebElement password;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;
    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement warningMessage;

    public void login() {
        this.username.sendKeys(ConfigurationReader.getProperty("username"));
        this.password.sendKeys(ConfigurationReader.getProperty("password"));
        //this.loginButton.click();
    }

    // Mustafa
    @FindBy(css = "input[placeholder='Login']")
    public WebElement loginName;


//Forgat password active and ve yazisi
    @FindBy(css = ".log-popup-header")
    public WebElement authorizationText;

    @FindBy(xpath = "//a[@class='login-link-forgot-pass']")
    public WebElement forgotPasswordLinkText;


    @FindBy(css = "div[class='log-popup-header']")
    public WebElement getPasswordText;
    @FindBy(id = "USER_REMEMBER")
    public WebElement checkBox;

    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }

    public void click(String value) {
        switch (value) {
            //comparing value of variable against each case
            case "Login":
                loginButton.click();
                break;
            case "Forgot Password":
                forgotPasswordLinkText.click();
                break;
            case "Authorization":

                break;
            case "checkBox":
                checkBox.click();
                break;
            //optional
            default:
                System.out.println("Invalid Input!");
        }
    }
}