package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.NewMultipleWindowPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewMultipleWindowsTest extends TestBase {
  HomePage homePage;

  @BeforeMethod
  public void precondition() {
    homePage = new HomePage(driver);
    homePage.getMultiple();
  }

  @Test
  public void openNeuWindowTest() {
    new NewMultipleWindowPage(driver).switchToNextTab(1).verifyTextFromNewTab("New Window");
  }
  }