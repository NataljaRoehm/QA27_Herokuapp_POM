package com.herokuapp.tests;

import com.herokuapp.pages.DropdownListPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownListTest extends TestBase {

  @BeforeMethod
  public void precondition() {
    new HomePage(driver).getDropdown();
  }

  @Test
  public void dropdownTest() {
    new DropdownListPage(driver).selectAnOptionDropdown("Option 2");
  }
}
