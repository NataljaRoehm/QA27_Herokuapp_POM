package com.herokuapp.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class NewMultipleWindowPage extends BasePage {

  public NewMultipleWindowPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(linkText = "Click Here")
  WebElement element;

  public NewMultipleWindowPage switchToNextTab(int index) {
    click(element);
    List<String> tabs = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(index));
    return this;
  }

  @FindBy(xpath = "/html[1]/body[1]/div[1]/h3[1]")
  WebElement newWindow;

  public NewMultipleWindowPage verifyTextFromNewTab(String text) {
    Assert.assertTrue(shouldHaveText(newWindow, text, 10));
    return this;
  }

}