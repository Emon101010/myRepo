package com.Mou.CNS;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowSize {
	private WebDriver driver;
	private JavascriptExecutor js;


	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

	public void testJavaScriptExecution() throws Exception {
		// Navigation
		js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice'");
		Thread.sleep(3000);
		
		// Size of window
		long height = (Long) js.executeScript("return window.innerHeight;");
		long width = (Long) js.executeScript("return window.innerWidth;");
		
		System.out.println("Height is: " + height);
		System.out.println("Width is: " + width);
	}
	
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
