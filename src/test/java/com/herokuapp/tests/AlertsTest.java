package com.herokuapp.tests;

import com.herokuapp.pages.AlertsPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTest extends TestBase {

  @BeforeMethod
  public void precondition() {
    new HomePage(driver).getAlerts();
  }

  @Test
  public void acceptAlertTest() {
    new AlertsPage(driver).acceptAlert();
  }

  @Test
  public void acceptJsAlert() {
    new AlertsPage(driver).acceptJsAlert();
  }
}