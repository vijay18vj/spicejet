package com.ui.step_definition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class HotelBookin_Stepdef {
	 
	static WebDriver driver=null; 
	 @Given("i am on the Adactin Hotel App! login page")
	 public void i_am_on_the_Adactin_Hotel_App_login_page() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get("https://www.bestbuy.com/") ;
		 Thread.sleep(2000);
	 }
    @Given("i enter username and pass word")
	 public void i_enter_username_and_pass_word() throws InterruptedException {
		 driver.findElement(By.id("username")).sendKeys("Maheshbhabu");
		  driver.findElement(By.name("password")).sendKeys("V99359");
		
	 }

	 @When("i cick the login button")
	 public void i_cick_the_login_button() {
	     
	 driver.findElement(By.id("login")).click();
	 }
	 @Then("I should be redirected to my The Adactin Hotel App! homepage")
	 public void i_should_be_redirected_to_my_The_Adactin_Hotel_App_homepage() {
		 
		 boolean status = driver.findElement(By.className("welcome_menu")).isDisplayed();
			if(status){
				System.out.println("i am in Home page");
			} else {
				System.out.println("error");
			}
	    
	 }
	 @Given("I enter location and hotel name")
		public void i_enter_location_and_hotel_name() throws InterruptedException {
		 Thread.sleep(2000);
			
			Select location = new Select(driver.findElement(By.id("location")));  
			location.selectByVisibleText("London");  
			
			Select hotel = new Select(driver.findElement(By.id("hotels")));  
			hotel.selectByVisibleText("Hotel Sunshine");  
		}

		@Given("i enter room type and no of rooms")
		public void i_enter_room_type_and_no_of_rooms() {
			Select roomtype = new Select(driver.findElement(By.id("room_type")));  
			roomtype.selectByVisibleText("Super Deluxe");  
			
			Select noofroom = new Select(driver.findElement(By.id("room_nos")));  
			noofroom.selectByIndex(5);  
		   
		}

		@When("i enter checkin and check out date")
		public void i_enter_checkin_and_check_out_date() {
			 WebElement checkin = driver.findElement(By.id("datepick_in"));
			 checkin.clear();
			 checkin.sendKeys("11/08/2023");
			 WebElement checkout= driver.findElement(By.name("datepick_out"));
		  checkout.clear();
		  checkout.sendKeys("15/08/2023");
		}

		@When("i enter Adults per Room	and Children per Room")
		public void i_enter_Adults_per_Room_and_Children_per_Room() {
			Select location = new Select(driver.findElement(By.id("adult_room")));  
			location.selectByIndex(2);;  
			
			Select hotel = new Select(driver.findElement(By.id("child_room")));  
			hotel.selectByIndex(0);
		}
		@When("i click search button")
		public void i_click_search_button() {
			 driver.findElement(By.id("Submit")).click();
		    
		}

		@Then("I should be redirected to my The Adactin Hotel App  select hotel page")
		public void i_should_be_redirected_to_my_The_Adactin_Hotel_App_select_hotel_page() {
		    boolean loin = driver.findElement(By.className("login_title")).isDisplayed();
				if(loin){
					System.out.println("i am in  hotelbooking page ");
				} else {
					System.out.println("error");
				}
		  
		}
		@Given("I select the hotel for the list")
		public void i_select_the_hotel_for_the_list() {
			 driver.findElement(By.id("radiobutton_0")).click();
		}

		@Given("i cick the continue button")
		public void i_cick_the_continue_button() {
			 driver.findElement(By.id("continue")).click();
		}

		@Then("I should be redirected to my The Adactin Hotel App! booking comfirm page")
		public void i_should_be_redirected_to_my_The_Adactin_Hotel_App_booking_comfirm_page() throws InterruptedException {
			Thread.sleep(2000);
			  boolean comfirm = driver.findElement(By.name("hotel_name_dis")).isDisplayed();
				if(comfirm){
					System.out.println("i am in select hotel page ");
				} else {
					System.out.println("error");
				}
		    
		}
		@Given("I enter first name and lastname")
		public void i_enter_first_name_and_lastname() {
			 driver.findElement(By.id("first_name")).sendKeys("sachin");
			  driver.findElement(By.name("last_name")).sendKeys("sri");
			
		   
		}

		@Given("i  enter address")
		public void i_enter_address() {
			driver.findElement(By.id("address")).sendKeys("chennai-60097");
		  
		}

		@When("I enter card number and card type")
		public void i_enter_card_number_and_card_type() {
			driver.findElement(By.id("address")).sendKeys("2345678987654765");
			
			Select cartype = new Select(driver.findElement(By.id("cc_type")));  
			cartype.selectByIndex(1);  
			
		}

		@When("i enter card Expiry Date and CVV Number")
		public void i_enter_card_Expiry_Date_and_CVV_Number() {
			Select expmonth = new Select(driver.findElement(By.id("cc_exp_month")));  
			expmonth.selectByIndex(4);  
			Select expyear = new Select(driver.findElement(By.id("cc_exp_year")));  
			expyear.selectByVisibleText("2026");
			driver.findElement(By.id("cc_cvv")).sendKeys("0770");
			
		}
		 
		@When("i click Book Now button")
		public void i_click_Book_Now_button() throws InterruptedException {
			driver.findElement(By.id("book_now")).click();
			Thread.sleep(3000);
		  
		}

		@Then("I should be redirected to  The Adactin Hotel App Booking Confirmation")
		public void i_should_be_redirected_to_The_Adactin_Hotel_App_Booking_Confirmation() throws InterruptedException {
			Thread.sleep(2000);
			  boolean comfirm = driver.findElement(By.className("login_title")).isDisplayed();
				if(comfirm){
					System.out.println("Booking Confirma");
				} else {
					System.out.println("error");
				}
		   
		}

		@Given("I click the my ltinerary botton")
		public void i_click_the_my_ltinerary_botton() {
			driver.findElement(By.id("my_itinerary")).click();
		}

		@Given("i cilck the hotel botton")
		public void i_cilck_the_hotel_botton() {
			driver.findElement(By.name("ids[]")).click();
		}

		@When("I click the cencel selected bottom")
		public void i_click_the_cencel_selected_bottom() {
			driver.findElement(By.name("cancelall")).click();
		}

		@When("i click the ok botton from popup bar")
		public void i_click_the_ok_botton_from_popup_bar() {
			driver.switchTo().alert().accept();
		}

		@When("i click the search botton")
		public void i_click_the_search_botton() {
			driver.findElement(By.xpath("//a[@href='SearchHotel.php']")).click();
		}

		@Then("I should be redirected again in to my The Adactin Hotel App homepage")
		public void i_should_be_redirected_again_in_to_my_The_Adactin_Hotel_App_homepage() {
			 boolean status = driver.findElement(By.className("welcome_menu")).isDisplayed();
				if(status){
					System.out.println("i am in Home page");
				} else {
					System.out.println("error");
				}
		  
		}

	}




