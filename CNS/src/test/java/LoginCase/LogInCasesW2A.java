

package LoginCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HomePage.HomeElement_W2A;

public class LogInCasesW2A {
	
	WebDriver driver = new ChromeDriver();
	
	HomeElement_W2A.HomeElement_W2A w2aSite2 = new HomeElement_W2A(driver);
	
	@BeforeTest
	public void beforeTest(){
		driver.get("http://www.way2automation.com/protractor-angularjs-practice-website.html");
		}
	
	@Test
	public void loginTestW2A() throws InterruptedException{
		
		w2aSite2.Registration_form();
		w2aSite2.userName_Pstv();
		w2aSite2.pass_Pstv();
		w2aSite2.reUsernamePstv();
		w2aSite2.LogInButtonPstv();
	}
	
}
