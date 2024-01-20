package step_definitions;

import io.cucumber.java.en.Given;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FirstTest {
    @Given("user land on website")
    public void user_land_on_website() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

}
