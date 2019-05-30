package Assignment_PageFactory_Calculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Mehedi_Elements {
	
	WebDriver driver;
	
	@FindBy(xpath="//INPUT[@ng-model='first']")
	WebElement firstInput;
	
	@FindBy(xpath="//INPUT[@ng-model='second']")
	WebElement secondInput;
	
	@FindBy(xpath="//BUTTON[@id='gobutton']")
	WebElement submitButton;
	
	@FindBy(xpath="//SELECT[@ng-model='operator']")
	WebElement selectOperation;
	
	@FindBy(css = "body > div.container.ng-scope > div > form > h2")
	WebElement getResult;
	
	public Mehedi_Elements(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void provide_number_on_first_input(String string) {
	firstInput.sendKeys(string);
		
	}

	public void provide_number_on_second_input(String string) {
		
		secondInput.sendKeys(string);
	}

	public void select_the_operation_addition() {
		Select selectOperationbutton = new Select(selectOperation);
		selectOperationbutton.selectByValue("ADDITION");
	}

	public void execute_the_calculation() {
		submitButton.click();
	}

	public void select_the_operation_subtraction() {
		Select selectOperationbutton = new Select(selectOperation);
		selectOperationbutton.selectByValue("SUBTRACTION");
	}

	public void select_the_operation_multiplication() {
		Select selectOperationbutton = new Select(selectOperation);
		selectOperationbutton.selectByValue("MULTIPLICATION");
	}

	public void select_the_operation_division() {
		Select selectOperationbutton = new Select(selectOperation);
		selectOperationbutton.selectByValue("DIVISION");
	}

	public void select_the_operation_mod() {
		Select selectOperationbutton = new Select(selectOperation);
		selectOperationbutton.selectByValue("MODULO");
	}
	
	public String getResult123() {
		String abcd= getResult.getText();
		return abcd;
		
	}

}
