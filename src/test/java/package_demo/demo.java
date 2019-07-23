package package_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
@SuppressWarnings("deprecation")
public class demo {
		WebDriver driver;
		
		@Given("application displaying welcome message")
		public void application_displaying_welcome_message() {
		   System.out.println("Welcome to this Page!!");
		}

		@When("user opens login application")
		public void user_opens_login_application() {
			System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\Selium 3.0\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://newtours.demoaut.com");
		}

		@When("entering username as {string}")
		public void entering_username_as(String un) {
		 driver.findElement(By.name("userName")).sendKeys(un);
		}

		@When("entering password as {string}")
		public void entering_password_as(String psd) {
		  driver.findElement(By.name("password")).sendKeys(psd);
		}

		@Then("click Submit")
		public void click_Submit() {
			driver.findElement(By.name("login")).click();
		}

		@Then("Validate login success")
		public void validate_login_success() {
		   Assert.assertTrue(driver.getTitle().contains("Flight"));
		}

		@When("user entering search product as {string}")
		public void user_entering_search_product_as(String product) {
			System.out.println("user is searching - "+product);
		}

		@Then("application display search related items")
		public void application_display_search_related_items() {
		   System.out.println("application displays search related items");
		}

		@When("user click on Add to cart")
		public void user_click_on_Add_to_cart() {
		System.out.println("clicks on add to cart");
		}

		@When("The product should added to cart item")
		public void the_product_should_added_to_cart_item() {
		System.out.println("product added to cart");
		}

		@When("user performs payment through netbanking")
		public void user_performs_payment_through_netbanking() {
		    System.out.println("performs payment through netbanking");
		}

		@Then("close application")
		public void close_application() {
		 System.out.println("payment and closing....");
		}

}
