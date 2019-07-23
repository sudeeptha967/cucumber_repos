package testme_package;

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
public class testme {
	WebDriver driver;
	@When("user opens login application")
	public void opening_the_sign_up_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\Selium 3.0\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
	}
	@When("entering username as {string}")
	public void entering_username_as(String un) {
		System.out.println("mercury");
	 driver.findElement(By.name("userName")).sendKeys(un);
	}
	/*@When("entering the firstname")
	public void entering_the_firstname() {
		  driver.findElement(By.id("firstName")).sendKeys("priyamani");
	}

	@And("entering the lastname")
	public void entering_the_lastname() {
		  driver.findElement(By.id("lastName")).sendKeys("s");
	}

	@And("enter the password")
	public void enter_the_password() {
		  driver.findElement(By.id("password")).sendKeys("123welcome");
	}

	@And("enter the confirm password")
	public void enter_the_confirm_password() {
		  driver.findElement(By.id("pass_confirmation")).sendKeys("123welcome");
	}

	@And("enter the gender")
	public void enter_the_gender() {
	    List <WebElement> d=driver.findElements(By.name("gender"));
	    d.get(0).click();
	}

	@And("enter the email")
	public void enter_the_email() {
		  driver.findElement(By.name("emailAddress")).sendKeys("wel@gmail.com");
	}

	@When("enter the mobile no")
	public void enter_the_mobile_no() {
		 driver.findElement(By.name("mobileNumber")).sendKeys("9867433456");
	}

	@And("enter	the date of birth")
	public void enter_the_date_of_birth() {
		 driver.findElement(By.name("dob")).sendKeys("04/29/1996");
	}

	@And("enter the address")
	public void enter_the_address() {
		driver.findElement(By.name("address")).sendKeys("1019,lakshmi nagar");
	}

	@And("enter the security question")
	public void enter_the_security_question() {
		WebElement dropdown=driver.findElement(By.name("securityQuestion"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("What is your Birth Place?");
	}

	@And("enter the answer")
	public void enter_the_answer() {
		driver.findElement(By.name("answer")).sendKeys("chennai");
	}

	@Then("click register")
	public void click_register() {
		driver.findElement(By.name("submit")).click();
	}

	@SuppressWarnings("deprecation")
	@And("validate the page")
	public void validate_the_page() {
	    Assert.assertTrue(driver.getTitle().contains("Sign In"));
	}*/
}
