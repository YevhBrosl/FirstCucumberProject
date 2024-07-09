package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.AddCarPage;
import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class AddCarPageSteps {

    @And("User clicks on the Let the car work link")
    public void click_on_Let_the_car_work_link() {
        new HomePage(driver).clickOnLetTheCarWorkLink();
    }

    @And("User selects the location")
    public void select_location() {
        new AddCarPage(driver).selectLocation();
    }

    @And("User fills out the car details form with valid data")
    public void enter_valid_carData() {
        new AddCarPage(driver).enterCarData("VW", "Passat", "2010",
                "5", "C", "98765", "100").selectFuel("Petrol");
    }

    @And("User clicks on the submit button")
    public void click_on_submit_button() {
        new AddCarPage(driver).clickOnSubmitButton();
    }

    @Then("User verifies Add Car Message is displayed")
    public void verify_Add_Car_Message() {
        new AddCarPage(driver).isMessageTextPresent("Car added");
    }
}
