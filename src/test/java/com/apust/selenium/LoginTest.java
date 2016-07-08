package com.apust.selenium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.apust.selenium.model.User;



public class LoginTest extends com.apust.selenium.pages.TestBase{
	
	@BeforeClass
	public void mayBeLogout() {
		if(app.getUserHelper().isNotLoggedIn()){
			return;
		}
		app.getUserHelper().logout();
	}
	
	@Test
	public void testLoginOK(){
		User user = new User().setLogin("admin").setPassword("admin");
	}
 
}