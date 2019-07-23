package cucumber_testme_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class cucumber_testme {
WebDriver driver;
@When("open home page")
public void open_home_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\Selium 3.0\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
}

@When("enter the username")
public void enter_the_username() {
	driver.findElement(By.name("userName")).sendKeys("merrr");
}
@When("enter the firstName")
public void enter_the_firstname() {
	driver.findElement(By.name("firstName")).sendKeys("mercury");
}
@When("enter the lastname")
public void enter_the_lastname() {
	driver.findElement(By.name("lastName")).sendKeys("mercur");
}
@When("enter the password")
public void enter_the_password() {
	  driver.findElement(By.id("password")).sendKeys("123welcome");
}
@When("enter the confirm password")
public void enter_the_confirm_password() {
	  driver.findElement(By.id("pass_confirmation")).sendKeys("123welcome");
}
@When("enter the gender")
public void enter_the_gender() {
    List <WebElement> d=driver.findElements(By.name("gender"));
    d.get(0).click();
}
@When("enter the email")
public void enter_the_email() {
	  driver.findElement(By.name("emailAddress")).sendKeys("wel@gmail.com");
}

@When("enter the mobile no")
public void enter_the_mobile_no() {
	 driver.findElement(By.name("mobileNumber")).sendKeys("9867433456");
}

@When("enter	the date of birth")
public void enter_the_date_of_birth() {
	 driver.findElement(By.name("dob")).sendKeys("04/29/1996");
}

@When("enter the address")
public void enter_the_address() {
	driver.findElement(By.name("address")).sendKeys("1019,lakshmi nagar");
}

@When("enter the security question")
public void enter_the_security_question() {
	WebElement dropdown=driver.findElement(By.name("securityQuestion"));
	Select s=new Select(dropdown);
	s.selectByVisibleText("What is your Birth Place?");
}

@When("enter the answer")
public void enter_the_answer() {
	driver.findElement(By.name("answer")).sendKeys("chennai");
}
@Then("click register")
public void click_register() {
	driver.findElement(By.name("Submit")).click();
}
@SuppressWarnings("deprecation")
@And("validate the page")
public void validate_the_page() {
    Assert.assertTrue(driver.getTitle().contains("Login"));
}
@When("enter the name")
public void uname()
{
	driver.findElement(By.name("userName")).sendKeys("mercuryyy");
}
}