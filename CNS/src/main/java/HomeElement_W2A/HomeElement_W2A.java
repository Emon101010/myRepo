package HomeElement_W2A;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomeElement_W2A {

WebDriver driver;


	@FindBy(xpath="//INPUT[@ng-model='first']")
	WebElement Value1;
	
	@FindBy((Select Operator = new Select (driver.findElement(By.xpath("//SELECT[@ng-model='operator']")));)
	Operator.selectByValue("ADDITION");
	WebElement Operator;
	
	@FindBy(xpath="//INPUT[@id='password']")
	WebElement Pass;
	
	@FindBy(xpath="//INPUT[@id='formly_1_input_username_0']")
	WebElement ReenterUserName;
	
	@FindBy(xpath="//BUTTON[@class='btn btn-danger'][text()='Login']")
	WebElement LogInButton;
	
	
	
	
	
	public  HomeElement_W2A(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	public void Registration_form() throws InterruptedException {
		Registration.click();
		Thread.sleep(2000);
	}
	
	public void userName_Pstv(){
		UserName.sendKeys("angular");
	}
	
	public void pass_Pstv(){
		Pass.sendKeys("password");
	}
	
	public void reUsernamePstv(){
		ReenterUserName.sendKeys("angular");
	}
	
	public void LogInButtonPstv(){
		LogInButton.click();
	}
	
	
}
