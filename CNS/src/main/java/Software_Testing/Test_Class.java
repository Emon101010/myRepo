package Software_Testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Test_Class {
WebDriver driver = new ChromeDriver();
Page_Class one = new Page_Class(driver);
@BeforeTest
public void beforeTest() {
driver.get("http://www.way2automation.com/angularjs-protractor/calc/");
}
@Test
public void Test_Positive() throws InterruptedException {
String a[]= {"plus","minus","product","mod","divide"};
for(int i=0;i<5;i++) {
one.provide_FirstDigit("5");
one.selectochange(a[i]);
one.provide_SecondDigit("6");
one.Click_Go_Button();
Thread.sleep(5000);
switch (i) {
case 0:
if(one.ShowOutput().equalsIgnoreCase("11"))
System.out.println("true");
break;
case 1:
if(one.ShowOutput().equalsIgnoreCase("-1"))
System.out.println("true");
break;
case 2:
if(one.ShowOutput().equalsIgnoreCase("30"))
System.out.println("true");
break;
case 3:
if(one.ShowOutput().equalsIgnoreCase("5"))
System.out.println("true");
break;
case 4:
if(one.ShowOutput().equalsIgnoreCase("0.8333333333333334"))
System.out.println("true");
break;
}
}
}
@Test
public void Test_Negative() throws InterruptedException {
String a[]= {"plus","minus","product","mod","divide"};
//first digit null
for(int i=0;i<5;i++) {
one.provide_FirstDigit("");
one.selectochange(a[i]);
one.provide_SecondDigit("6");
one.Click_Go_Button();
Thread.sleep(5000);
switch (i) {
case 0:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 1:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 2:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 3:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 4:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
}
}
//second digit null
for(int i=0;i<5;i++) {
one.provide_FirstDigit("5");
one.selectochange(a[i]);
one.provide_SecondDigit("");
one.Click_Go_Button();
Thread.sleep(5000);
switch (i) {
case 0:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 1:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 2:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 3:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 4:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
}
}
//both digit null
for(int i=0;i<5;i++) {
one.provide_FirstDigit("");
one.selectochange(a[i]);
one.provide_SecondDigit("");
one.Click_Go_Button();
Thread.sleep(5000);
switch (i) {
case 0:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 1:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 2:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 3:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 4:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
}
}
//both digit is character
for(int i=0;i<5;i++) {
one.provide_FirstDigit("a");
one.selectochange(a[i]);
one.provide_SecondDigit("b");
one.Click_Go_Button();
Thread.sleep(5000);
switch (i) {
case 0:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 1:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 2:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 3:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 4:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
}
}
//first digit numeric, last digit character
for(int i=0;i<5;i++) {
one.provide_FirstDigit("5");
one.selectochange(a[i]);
one.provide_SecondDigit("=");
one.Click_Go_Button();
Thread.sleep(5000);
switch (i) {
case 0:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 1:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 2:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 3:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
case 4:
if(one.ShowOutput().equalsIgnoreCase("NaN"))
System.out.println("true");
break;
}
}
}
@AfterTest
public void afterTest() throws InterruptedException {
Thread.sleep(5000);
driver.close();
}
}