package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {

  public AlertsPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//button[@onclick='jsConfirm()']")
  WebElement jsConfirm;
  @FindBy(xpath = "//button[@onclick='jsAlert()']")
  WebElement jsAlert;


  public AlertsPage acceptAlert() {
    click(jsConfirm);
    driver.switchTo().alert().accept();//при модальном окне мы перепрыгиваем в окно и нажим ок
    return this;
  }
  public AlertsPage acceptJsAlert(){
    click(jsAlert);
    driver.switchTo().alert().accept();
    return this;
  }
}
