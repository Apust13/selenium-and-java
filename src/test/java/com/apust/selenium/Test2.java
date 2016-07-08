package com.apust.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test2 extends com.apust.selenium.pages.TestBase {
	 private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Test
	  public void testLogin() throws Exception {    
		webDriver.get("https://jobs.tut.by/");
		
		WebElement email = webDriver.findElement(By.xpath("html/body/div[4]/div/div[3]/div/div/div[2]/form/label[1]/span[2]/input"));
		email.click();
		email.sendKeys("job@yandex.ru");
		email.sendKeys(Keys.HOME);
		Thread.currentThread().sleep(1000);
		
		email.sendKeys("nikk-");
		Thread.currentThread().sleep(1000);
		
		email.click();
		email.sendKeys(Keys.END);
		
		
		
		
		
		for(int i = 0; i < 4; i++){
			email.sendKeys(Keys.BACK_SPACE);
			Thread.currentThread().sleep(100);
		}
		Actions actions = new Actions(webDriver);
		
		actions.keyDown(Keys.SHIFT).clickAndHold()
		.moveByOffset(-100, 0)
		.release()
		.keyUp(Keys.SHIFT)
		.perform();
		Thread.currentThread().sleep(1500);
		
		email.sendKeys(Keys.CONTROL + "c");
		
		WebElement passField = webDriver.findElement(By.xpath("html/body/div[4]/div/div[3]/div/div/div[2]/form/label[2]/span[2]/input"));
		
		passField.click();
		passField.sendKeys(Keys.CONTROL + "v");
		
		String attribute = email.getAttribute("value");
		String windowHandle = webDriver.getWindowHandle();
		System.out.println(attribute);
		System.out.println(windowHandle);
		
		
		
		
		//email.sendKeys(Keys.DELETE);
		Thread.currentThread().sleep(2500);
		
		
//		WebDriverWait wait = new WebDriverWait(webDriver, 20);
//		wait.until(ExpectedConditions.alertIsPresent());
//		
		
		
		
		
		
		
		
//		
//		webDriver.findElement(By.xpath("html/body/div[6]/div/div[1]/div[1]/div[1]/div/div[2]/div/div[2]/ul/li[1]/div/span[1]/a")).click();
//		boolean img = webDriver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/div[2]/div/div[1]/img")).isDisplayed();
//		String str = webDriver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/div[2]/div/div[1]/img")).getTagName();
//		By xpath = By.xpath("html/body/div[4]/div[2]/div[1]/div[2]/div/div[1]/img");
//		By xpath2 = By.xpath("html/body/div[4]/div[2]/div[1]/div[2]/div/div[1234]/img");
//		Dimension size =webDriver.findElement(xpath).getSize();
//		webDriver.findElement(xpath).
//		
//		boolean elementPresent = isElementPresent(xpath2);
//		
//		int height = size.getHeight();
//		int width = size.getWidth();
//		
//		
//		System.out.println(img);
//		System.out.println(str);
//		System.out.println(height);
//		System.out.println(width);
//		System.out.println(elementPresent);
		
	
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
