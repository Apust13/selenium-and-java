package com.apust.selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Login extends com.apust.selenium.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Test
  public void testLogin() throws Exception {    
	webDriver.get(baseUrl + "/php4dvd/");
    webDriver.findElement(By.id("username")).clear();
    webDriver.findElement(By.id("username")).sendKeys("admin");
    webDriver.findElement(By.name("password")).clear();
    webDriver.findElement(By.name("password")).sendKeys("admin");
    webDriver.findElement(By.name("submit")).click();
    }

  private boolean isElementPresent(By by) {
    try {
      webDriver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = webDriver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}