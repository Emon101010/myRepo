package Software_Testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class Page_Class {
WebDriver driver;
@FindBy(xpath="//INPUT[@ng-model='first']")
WebElement first_number;
@FindBy(xpath="//INPUT[@ng-model='second']")
WebElement second_number;
@FindBy(css="body > div.container.ng-scope > div > form > h2")
WebElement output;
@FindBy(xpath="//BUTTON[@id='gobutton']")
WebElement go_button;
@FindBy(xpath="//SELECT[@ng-model='operator']")
WebElement selector;
public void provide_FirstDigit(String a) {
first_number.sendKeys(a);
}
public void provide_SecondDigit(String b) {
second_number.sendKeys(b);
}
public void selectochange(String c) {
Select s=new Select(selector);
if(c.equalsIgnoreCase("Plus"))
s.selectByValue("ADDITION");
else if(c.equalsIgnoreCase("DIVIDE"))
s.selectByValue("DIVISION");
else if(c.equalsIgnoreCase("mod"))
s.selectByValue("MODULO");
else if(c.equalsIgnoreCase("product"))
s.selectByValue("MULTIPLICATION");
else if(c.equalsIgnoreCase("minus"))
s.selectByValue("SUBTRACTION");;
}
public Page_Class(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}
public void Click_Go_Button() {
go_button.click();
}
public String ShowOutput() {
String o=output.getText();
return o;
}
}