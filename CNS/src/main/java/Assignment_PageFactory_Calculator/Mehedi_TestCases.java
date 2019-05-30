package Assignment_PageFactory_Calculator;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Assignment_PageFactory_Calculator.Mehedi_Elements;

public class Mehedi_TestCases {
	
	public WebDriver driver = new ChromeDriver();
	Mehedi_Elements elementPage = new Mehedi_Elements(driver);
	
	@BeforeTest
	public void beforeTest() {
		driver.get("http://www.way2automation.com/angularjs-protractor/calc");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test
	public void addition() throws InterruptedException {
		String expectedResult = "14";
		elementPage.provide_number_on_first_input("10");
		elementPage.provide_number_on_second_input("4");
		elementPage.select_the_operation_addition();
		elementPage.execute_the_calculation();
		Thread.sleep(5000);
		assertEquals(elementPage.getResult123(), expectedResult);
	}
	@Test
	public void subtraction() throws InterruptedException {
		String expectedResult = "6";
		elementPage.provide_number_on_first_input("10");
		elementPage.provide_number_on_second_input("4");
		elementPage.select_the_operation_subtraction();
		elementPage.execute_the_calculation();
		Thread.sleep(5000);
		assertEquals(elementPage.getResult123(), expectedResult);
	}
	
	@Test
	public void multiplication() throws InterruptedException {
		String expectedResult = "40";
		elementPage.provide_number_on_first_input("10");
		elementPage.provide_number_on_second_input("4");
		elementPage.select_the_operation_multiplication();
		elementPage.execute_the_calculation();
		Thread.sleep(5000);
		assertEquals(elementPage.getResult123(), expectedResult);
	}
	
	@Test
	public void division() throws InterruptedException {
		String expectedResult = "2.5" ;
		elementPage.provide_number_on_first_input("10");
		elementPage.provide_number_on_second_input("4");
		elementPage.select_the_operation_division();
		elementPage.execute_the_calculation();
		Thread.sleep(5000);
		assertEquals(elementPage.getResult123(), expectedResult);
	}
	@Test
	public void mod() throws InterruptedException {
		String expectedResult = "2";
		elementPage.provide_number_on_first_input("10");
		elementPage.provide_number_on_second_input("4");
		elementPage.select_the_operation_mod();
		elementPage.execute_the_calculation();
		Thread.sleep(5000);
		assertEquals(elementPage.getResult123(), expectedResult);
	}
	@AfterMethod
	public void aftermethod() throws InterruptedException {
		Thread.sleep(4000);
	}
	@AfterTest
	public void afterCompletingTest() {
		driver.close();
	}
}