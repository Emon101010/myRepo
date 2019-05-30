package com.Mou.CNS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.internal.*;

public class TestCaseCustomerAdd {
	
	
	@Test
	public void AddnewCustomer(){
	try{
			
		
		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new ChromeDriver();
		
		//Login Process
		LoginProcess.loginMethod(driver);
		Thread.sleep(3000);
		
	//Customer Registration Starts
	driver.get("http://118.67.220.50/unifiedeagro/user/list");
	Thread.sleep(3000);
	System.out.println("User list page");
	
	//popup Create user page
	driver.findElement(By.cssSelector("#body-container > div.common-radius > div.toolPanel.button-toolbar > div > div > a")).click();
	Thread.sleep(3000);
	System.out.println("Create user page loaded");
	
	//add customer/user (popup form)
	driver.findElement(By.cssSelector("#w2l-sbox-11 > div.w2l-sbox-comboPanel > div.w2l-sbox-comboPanelHandler.w2l-sbox-inb")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#w2l-sbox-11 > div.w2l-sbox-itemContainer > div > div:nth-child(3)")).click();
	Thread.sleep(3000);
	
	
	//Select basic info /
	
	driver.findElement(By.name("firstName")).sendKeys(StaticVariable.customerFirstName);  
	
	driver.findElement(By.name("email")).sendKeys(StaticVariable.custEmail);
	driver.findElement(By.name("userName")).sendKeys(StaticVariable.custEmail);	// Customer id from Static Variable
	driver.findElement(By.name("password")).sendKeys(StaticVariable.custPassword);
	driver.findElement(By.name("rePassword")).sendKeys(StaticVariable.custPassword);
	
	driver.findElement(By.name("phone")).sendKeys(StaticVariable.custPhoneNo);
	driver.findElement(By.name("address1")).sendKeys("address for selenium"); 
	
	//Scrolling down the page
	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	//page scroll
		Thread.sleep(3000);


		WebElement elementForm = driver.findElement(By.id("frmCreate"));	//form scroll

		Coordinates cor=((Locatable)elementForm).getCoordinates();
		cor.inViewPort();
		Thread.sleep(3000);
		///Scroll done/Finished
	
	
	
	//Country Selection
	driver.findElement(By.cssSelector("#w2l-sbox-8 > div.w2l-sbox-comboPanel > div.w2l-sbox-input.w2l-sbox-inb")).click();
	//
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("div[title='Bangladesh']")).click();
	Thread.sleep(3000);
	
	//region Selection
	driver.findElement(By.cssSelector(".w2l-box-active > div:nth-child(1) > div:nth-child(1)")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("div[title='Abhaynagar']")).click();
	Thread.sleep(3000);
	
	
	
	//currency Selection
	
		driver.findElement(By.cssSelector("#w2l-sbox-6 > div.w2l-sbox-comboPanel > div.w2l-sbox-input.w2l-sbox-inb")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[title='Rupee']")).click();
		Thread.sleep(3000);
	
		//Theme Selection
		driver.findElement(By.cssSelector("#w2l-sbox-6 > div.w2l-sbox-comboPanel > div.w2l-sbox-input.w2l-sbox-inb")).click();
				
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[title='Rupee']")).click();
		Thread.sleep(3000);
		
			
		
			
			//Photo upload
			
			driver.findElement(By.name("userPhoto")).sendKeys("C:\\Users\\Shahidul Karim\\Desktop\\java003.jpg");
			Thread.sleep(2000);
		
		//Save customer
			driver.findElement(By.className("btnSaveClose")).click();
		
	
	}catch (Exception e){
		e.printStackTrace();
	}

}
}
