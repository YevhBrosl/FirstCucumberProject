package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
}
