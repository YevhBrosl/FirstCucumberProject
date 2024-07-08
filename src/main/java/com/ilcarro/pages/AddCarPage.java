package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddCarPage extends BasePage{
    public AddCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "pickUpPlace")
    WebElement location;

    public AddCarPage selectLocation() {
        click(location);
        location.sendKeys("Haif");
        location.sendKeys(Keys.DOWN, Keys.ENTER);
        return this;
    }

    @FindBy(id = "make")
    WebElement carMake;

    @FindBy(id = "model")
    WebElement carModel;

    @FindBy(id = "year")
    WebElement productionYear;

    @FindBy(id = "seats")
    WebElement numberOfSeats;

    @FindBy(id = "class")
    WebElement classOfCar;

    @FindBy(id = "serialNumber")
    WebElement serialNumber;

    @FindBy(id = "price")
    WebElement priceOfCar;
    
    public AddCarPage enterCarData(String manufacture, String model,
                                   String year, String seats, String carClass, String carNumber, String price) {
        type(carMake, manufacture);
        type(carModel, model);
        type(productionYear, year);
        type(numberOfSeats, seats);
        type(classOfCar, carClass);
        type(serialNumber, carNumber);
        type(priceOfCar, price);
        return this;
    }

    @FindBy(id = "fuel")
    WebElement fuelMenu;

    public AddCarPage selectFuel(String fuel) {
        Select select = new Select(fuelMenu);
        select.selectByVisibleText(fuel);
        return this;
    }

    @FindBy(xpath = "//button[.='Submit']")
    WebElement submitButton;

    public AddCarPage clickOnSubmitButton() {
        click(submitButton);
        return this;
    }

    @FindBy(css = ".dialog-container>h1")
    WebElement addCarMessage;

    public void isMessageTextPresent(String message) {
        assert addCarMessage.getText().equals(message);
    }
}
