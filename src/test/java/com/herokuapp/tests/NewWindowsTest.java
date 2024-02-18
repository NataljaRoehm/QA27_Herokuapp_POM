package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.NewWindowPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewWindowsTest extends TestBase {

  @BeforeMethod
  public void precondition() {
    new HomePage(driver).getMultiple();
  }

  @Test
  public void openNeuWindowTest() {
    new NewWindowPage(driver).clickHereLink();
  }
}
