package com.Mou.CNS;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollData {

	private WebDriver driver;
	private JavascriptExecutor js;
	
	@Test
	public  void Scroll() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseURL = "http://118.67.220.50/unifiedeagro/user/list";	
		driver.get(baseURL);
		
		driver.findElement(By.name("userName")).sendKeys("gisb_sqa@grameen-intel.com");
		driver.findElement(By.name("password")).sendKeys("AusTin4#");
		
		driver.findElement(By.cssSelector("#frmUserLogin > div > div:nth-child(4) > button")).click();
		Thread.sleep(15000);
		
		js.executeScript("window.location = 'http://118.67.220.50/unifiedeagro/user/list'");
		Thread.sleep(2000);	//http://118.67.220.50/unifiedeagro/user/list
		
		js.executeScript("window.scrollBy(0,335.015625);");
		
		
		
	}

}
