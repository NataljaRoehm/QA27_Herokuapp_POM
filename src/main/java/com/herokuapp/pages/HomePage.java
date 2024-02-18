package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

  public HomePage(WebDriver driver) {
    super(driver);
  }

  @FindBy(linkText = "JavaScript Alerts")
  WebElement alertsPage;

  public AlertsPage getAlerts() {
    click(alertsPage);
    return new AlertsPage(driver);
  }

  @FindBy(css = "div.row:nth-child(2) div.large-12.columns:nth-child(2) "
      + "ul:nth-child(4) li:nth-child(11) > a:nth-child(1)")
  WebElement selectAnOption;

  public DropdownListPage getDropdown() {
    click(selectAnOption);
    return new DropdownListPage(driver);
  }

  @FindBy(linkText = "Multiple Windows")
  WebElement clickMultiple;

  public NewWindowPage getMultiple() {
    click(clickMultiple);
    return new NewWindowPage(driver);
  }
}