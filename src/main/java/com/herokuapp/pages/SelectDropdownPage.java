package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownPage extends BasePage {

  public SelectDropdownPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(id = "dropdown")
  WebElement dropdownOption;

  public SelectDropdownPage selectAnOptionDropdown(String option) {
    Select select = new Select(dropdownOption);
    select.selectByVisibleText(option);
    return this;
  }
}