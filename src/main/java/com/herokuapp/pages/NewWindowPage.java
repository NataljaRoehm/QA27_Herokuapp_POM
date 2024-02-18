package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewWindowPage extends BasePage {

  public NewWindowPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(linkText = "Click Here")
  WebElement element;

  public NewWindowPage clickHereLink() {
    click(element);
    return this;
  }
}