package com.herokuapp.tests;

import com.herokuapp.pages.SelectDropdownPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectDropdownTest extends TestBase {

  @BeforeMethod
  public void precondition() {
    new HomePage(driver).getSelectDropdown();
  }

  @Test
  public void dropdownTest() {
    new SelectDropdownPage(driver).selectAnOptionDropdown("Option 2");
  }
}
