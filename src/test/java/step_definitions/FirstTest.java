package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FirstTest {
    LoginPage loginpage=new LoginPage();
    @Given("user land on website")
    public void user_land_on_website() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


//        Assert.assertEquals(loginPage.authorizationText.getText(), "Authorization" ); // validate the Authorization text

//        Assert.assertTrue(loginPage.forgotPasswordLinkText.isDisplayed() );  // Verify forgot link text
//
//        loginPage.forgotPasswordLinkText.click();
//
//        Assert.assertTrue(loginPage.getPasswordText.isDisplayed() );

    }

    @When("user enter {string} and {string}")
    public void userEnterAnd(String username, String password) {
    loginpage.login(username,password);


    }

    @And("user click {string}")
    public void userClick(String value) {
    loginpage.click(value);

    }

    @Then("user validate {string}")
    public void userValidate(String warning) {
        Assert.assertEquals(warning,loginpage.warningMessage.getText());
    }
}
