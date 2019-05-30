package com.Mou.CNS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginProcess {
	
	static void loginMethod(WebDriver driverX){
		driverX.get(StaticVariable.baseURL);
		driverX.findElement(By.name("userName")).sendKeys(StaticVariable.adminID);
		driverX.findElement(By.name("password")).sendKeys(StaticVariable.adminPWD);
		
		driverX.findElement(By.cssSelector(StaticVariable.loginButton)).click();
		
	}

}
