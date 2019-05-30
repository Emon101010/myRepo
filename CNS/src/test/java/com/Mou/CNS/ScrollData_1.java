package com.Mou.CNS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Locatable;

import org.openqa.selenium.interactions.internal.Coordinates;

public class ScrollData {
		
	@Test
	public  void Scroll() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseURL = "http://118.67.220.50/unifiedeagro/user/list";	
		driver.get(baseURL);
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
			
		driver.findElement(By.name("userName")).sendKeys("gisb_sqa@grameen-intel.com");
		driver.findElement(By.name("password")).sendKeys("AusTin4#");
		
		driver.findElement(By.cssSelector("#frmUserLogin > div > div:nth-child(4) > button")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//A[@class='create'][text()='Create']")).click();
		Thread.sleep(6000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	
		//WebElement elementForm = driver.findElement(By.id("frmCreate"));
		
		//	long height = (Long) js.executeScript("return window.innerHeight;");
		//	long width = (Long) js.executeScript("return window.innerWidth;");
		
		
		//System.out.println("Height is: " + height);
		//System.out.println("Width is: " + width);
		
		//js.executeScript("window.scrollBy(0,550);");
		//Thread.sleep(4000);
		
		//js.executeScript("window.scrollBy(0,-550);");
		WebElement element = driver.findElement(By.cssSelector("#module-panel > div > div.grid-contents.table-grid > table > tbody > tr:nth-child(18) > td.config-panel.last > div > a.view"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(5000); 
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	//page scroll
		Thread.sleep(3000);
		
		WebElement elementForm = driver.findElement(By.id("frmCreate"));
		Coordinates cor=((Locatable)elementForm).getCoordinates();
		cor.inViewPort();
		Thread.sleep(3000); 
	}

}
