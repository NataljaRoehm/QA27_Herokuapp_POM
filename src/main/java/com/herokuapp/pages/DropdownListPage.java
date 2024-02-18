package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownListPage extends BasePage {

  public DropdownListPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//option[contains(text(),'Option 2')]")
  WebElement dropdownOption;

  public DropdownListPage selectAnOptionDropdown(String text) {
    click(dropdownOption);
    return this;
  }
}