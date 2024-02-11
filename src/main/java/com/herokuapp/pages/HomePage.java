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
}
