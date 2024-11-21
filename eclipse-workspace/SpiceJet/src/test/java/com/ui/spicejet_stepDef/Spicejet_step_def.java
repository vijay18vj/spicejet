package com.ui.spicejet_stepDef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejet_step_def {
	static WebDriver driver=null; 
	@Given("I open the SpiceJet website")
	public void i_open_the_SpiceJet_website() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			 driver.manage().window().maximize();
			driver.get("www.spicejet.com") ;
		 Thread.sleep(2000);
	}
	@Given("I open the Sign-Up page")
	public void i_open_the_Sign_Up_page() throws InterruptedException {
		 driver.findElement(By.id("signUpLink")).click();
		 Thread.sleep(2000);
	}
	@When("I fill in mandatory and non-mandatory fields")
	public void i_fill_in_mandatory_and_non_mandatory_fields() throws InterruptedException {
		 WebElement titleDropdown = driver.findElement(By.id("title"));
	        titleDropdown.click();
	        titleDropdown.findElement(By.xpath("//option[contains(text(),'Mr')]")).click();
		    driver.findElement(By.id("firstName")).sendKeys("vijay");
	        driver.findElement(By.id("lastName")).sendKeys("kumar");
	        WebElement countryDropdown = driver.findElement(By.name("country"));
	        countryDropdown.click();
	        countryDropdown.findElement(By.xpath("//option[contains(text(),'India')]")).click();
	        driver.findElement(By.name("dob")).sendKeys("01/01/1990");
	        driver.findElement(By.id("phoneNumber")).sendKeys("9876543210");
	        driver.findElement(By.id("email")).sendKeys("vjkumr@123gmail.com");
	        driver.findElement(By.id("password")).sendKeys("Vj@1234");
	        driver.findElement(By.name("confirmPassword")).sendKeys("vjkumr@123gmail.com");
	        driver.findElement(By.id("termsCheck")).click();
	        driver.findElement(By.id("submitButton")).click();
	        Thread.sleep(2000);
	}
	@Then("I should see the sign-up success message")
	public void i_should_see_the_sign_up_success_message() {
		 WebElement confirmationMessage = driver.findElement(By.xpath("//div[contains(text(), 'successfully')]"));
	        if (confirmationMessage.isDisplayed()) {
	            System.out.println("Registration was successful!");
	        } else {
	            System.out.println("Registration failed!");
	        }
	   	}
	@Given("I am on the SpiceJet homepage")
	public void i_am_on_the_SpiceJet_homepage() throws InterruptedException {
		  driver.get("https://www.spicejet.com/");
		  Thread.sleep(2000);
	}
	@When("I click the login button and enter dummy credentials")
	public void i_click_the_login_button_and_enter_dummy_credentials() throws InterruptedException {
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("email")).sendKeys("vjkumr@123gmail.com");
	        driver.findElement(By.id("password")).sendKeys("Vj@123");
	        driver.findElement(By.id("loginSubmitButton")).click();
	}
	@Then("I should see a login success or failure message")
	public void i_should_see_a_login_success_or_failure_message() {
		  try {
	            WebElement successMessage = driver.findElement(By.xpath("//div[contains(text(), 'Welcome')]"));
	            System.out.println("Login was successful!");
	        } catch (Exception e) {
	            System.out.println("Login failed!");
	        }
	}
	@When("I search for a one-way flight from {string} to {string}")
	public void i_search_for_a_one_way_flight_from_to(String string, String string2) throws InterruptedException {
		 driver.findElement(By.id("oneWayRadio")).click();
	        driver.findElement(By.id("originInput")).sendKeys("chennai");
	        driver.findElement(By.id("destinationInput")).sendKeys("uk");
	        driver.findElement(By.id("searchFlightsButton")).click();
	        Thread.sleep(2000);
	   	}
	@Then("I should see the search results for available flights")
	public void i_should_see_the_search_results_for_available_flights() {
		 WebElement searchResults = driver.findElement(By.id("searchResultsContainer"));
	        if (searchResults.isDisplayed()) {
	            System.out.println("Search results are displayed!");
	        } else {
	            System.out.println("No search results found!");
	        }
	}
	@Given("I have selected a flight")
	public void i_have_selected_a_flight() {
		 driver.findElement(By.xpath("//button[contains(text(),'Select Flight')]")).click();
	}
	@When("I proceed to the booking page")
	public void i_proceed_to_the_booking_page() {
		  driver.findElement(By.id("proceedToBookingButton")).click();
		  }
	@When("I fill in the passenger and payment information")
	public void i_fill_in_the_passenger_and_payment_information() throws InterruptedException {
		 driver.findElement(By.name("passengerName")).sendKeys("vijay kumar");
	        driver.findElement(By.name("passengerAge")).sendKeys("27");
	        driver.findElement(By.name("cardNumber")).sendKeys("4111111111111111");
	        driver.findElement(By.name("expiryDate")).sendKeys("02/28");
	        driver.findElement(By.name("cvv")).sendKeys("123");
	        driver.findElement(By.id("confirmBookingButton")).click();
	        Thread.sleep(2000);
	}
	@Then("I should see the booking confirmation message")
	public void i_should_see_the_booking_confirmation_message() {
		   WebElement confirmationMessage = driver.findElement(By.xpath("//div[contains(text(), 'Booking Confirmed')]"));
	        if (confirmationMessage.isDisplayed()) {
	            System.out.println("Booking was successful!");
	        } else {
	            System.out.println("Booking failed!");
	        }
	        // Close the browser
	        driver.quit();
	}
}
