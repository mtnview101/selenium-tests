package com.wikia.webdriver.pageobjectsfactory.pageobject.special;

import com.wikia.webdriver.common.logging.PageObjectLogging;
import com.wikia.webdriver.pageobjectsfactory.pageobject.BasePageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecialEditHubPageObject extends BasePageObject {

  @FindBy(css = "#date-picker .ui-datepicker")
  private WebElement edithubDashboardCalendar;

  public SpecialEditHubPageObject(WebDriver driver) {
    super();
  }

  public void verifyCalendarAppears() {
    wait.forElementVisible(edithubDashboardCalendar);
    PageObjectLogging.log("verifyCalendarAppears", "Curators calendar visible", true);
  }
}
