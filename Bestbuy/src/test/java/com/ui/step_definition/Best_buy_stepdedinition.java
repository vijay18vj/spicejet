package com.ui.step_definition;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Best_buy_stepdedinition {
	static WebDriver driver=null; 
	@Given("I open the Best Buy homepage")
	public void i_open_the_Best_Buy_homepage() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			 driver.manage().window().maximize();
			driver.get("https://www.bestbuy.com/") ;
		 Thread.sleep(2000);
	    
	}

    @Then("The URL should be {string}")
    public void the_url_should_be(String expectedUrl) {
        
        String currentUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, currentUrl);
        System.out.println("i am in Home page");
 }

    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() throws InterruptedException {
         driver.findElement(By.className("v-p-top-xxs")).click();
    	 Thread.sleep(500);
    	 driver.findElement(By.className("c-button c-button-secondary c-button-sm rounded-full basis-1/2")).click();
    	 Thread.sleep(2000);
    }

    @When("I enter email {string} and password {string}")
    public void i_enter_email_and_password(String string, String string2) {
    	 driver.findElement(By.id("fld-e")).sendKeys("validuser@test.com");
		  driver.findElement(By.name("fld-p1")).sendKeys("validuser@1 ");
        
    }

    @When("I click the submit button")
    public void i_click_the_submit_button() throws InterruptedException {
        
    	 driver.findElement(By.className("c-button c-button-secondary c-button-lg c-button-block c-button-icon c-button-icon-leading cia-form__controls__submit" )).click();
    	 Thread.sleep(3000);
    }
    @Then("I should see {string}")
    public void i_should_see(String string) {
    	 boolean status = driver.findElement(By.className("v-p-right-xxs line-clamp")).isDisplayed();
			if(status){
				System.out.println("successfull");
			} else {
				System.out.println("error");
			}
		 }
    @Given("I am on the Best Buy homepage")
    public void i_am_on_the_Best_Buy_homepage() {
    	 boolean status = driver.findElement(By.className("v-p-right-xxs line-clamp")).isDisplayed();
			if(status){
				System.out.println("i am in Home page");
			} else {
				System.out.println("error");
			}
    }
 @When("I click  main menu item")
    public void i_click_each_main_menu_item() {
	 driver.findElement(By.id("gpt-shop-pushdown-ad-53586401")).click();
    }
    @Then("Each page should display relevant content")
    public void each_page_should_display_relevant_content() {
    	  List <WebElement> mainMenuItems = driver.findElements(By.cssSelector("ul.main-menu > li"));
          for (WebElement menuItem : mainMenuItems) {
              String menuName = menuItem.getText();
              menuItem.click();
              WebElement pageHeading = driver.findElement(By.cssSelector("h1, h2")); 
              assertTrue(pageHeading.isDisplayed() && pageHeading.getText().contains(menuName));
              driver.navigate().back();
          }
      }
    @Given("I am on the Best Buy homepage")
    public void i_am_on_the_Best_Buy_homepage1() {
    	 boolean status = driver.findElement(By.className("v-p-right-xxs line-clamp")).isDisplayed();
			if(status){
				System.out.println("i am in Home page");
			} else {
				System.out.println("error");
			}
    	
    }

    @When("I search for {string}")
    public void i_search_for(String string) throws InterruptedException {
    	 driver.findElement(By.id("gh-search-input")).sendKeys("iphone16");
    	 driver.findElement(By.className("w-300 h-300 inline-align-middle")).click(); 
    	 Thread.sleep(3000);
    }

    @When("I add the first search result to the shopping cart")
    public void i_add_the_first_search_result_to_the_shopping_cart() throws InterruptedException {
    	 WebElement firstAddToCartButton = driver.findElement(By.cssSelector(".add-to-cart-button")); 
         firstAddToCartButton.click(); 
         WebElement cartButton = driver.findElement(By.cssSelector(".cart-link")); 
         cartButton.click(); 
         Thread.sleep(3000); 
    }

    @Then("I should see the item in my shopping cart")
    public void i_should_see_the_item_in_my_shopping_cart() {
    	  WebElement cartItems = driver.findElement(By.cssSelector(".cart-items")); 
          if (cartItems.isDisplayed()) {
              System.out.println("Item was successfully added to the cart!");
          } else {
              System.out.println("Item was not found in the cart.");}
      
    }

    @When("I navigate to {string}")
    public void i_navigate_to(String section) {
		if (section.equals("Shop by Department")) {
            WebElement departmentMenu = driver.findElement(By.cssSelector("#menu-departments")); 
            departmentMenu.click();
        } else if (section.equals("Brands")) {
            WebElement brandsMenu = driver.findElement(By.cssSelector("#menu-brands")); 
            brandsMenu.click();
        }
       
    }

    @When("I select an item from the department")
    public void i_select_an_item_from_the_department() throws InterruptedException {
    	  Thread.sleep(2000); // Wait for department items to load
          WebElement firstDepartmentItem = driver.findElement(By.cssSelector(".department-item")); 
          firstDepartmentItem.click();
          
    }

    @When("I add the item to the shopping cart")
    public void i_add_the_item_to_the_shopping_cart() {
    	  WebElement addToCartButton = driver.findElement(By.cssSelector(".add-to-cart-button"));
          addToCartButton.click(); 
    }

    @When("I navigate to {string}")
    public void i_navigate_to1(String section) {
        if (section.equals("Brands")) {
            try {
                Thread.sleep(2000);
                WebElement brandsMenu = driver.findElement(By.linkText("Brands"));
                brandsMenu.click();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @When("I select {string} from the brands")
    public void i_select_from_the_brands(String brand) {
        try {
            Thread.sleep(2000);
            WebElement brandLink = driver.findElement(By.linkText(brand));
            brandLink.click();
            Thread.sleep(2000); 
            WebElement firstProduct = driver.findElement(By.cssSelector(".sku-item .add-to-cart-button"));
            firstProduct.click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I should see the item in my shopping cart")
    public void i_should_see_the_item_in_my_shopping_cart1() {
        try {
            Thread.sleep(2000);
            WebElement cartButton = driver.findElement(By.cssSelector(".cart-link"));
            cartButton.click(); 
            Thread.sleep(2000);
            WebElement cartItems = driver.findElement(By.cssSelector(".cart-items"));
            if (cartItems.isDisplayed()) {
                System.out.println("The item was successfully added to the cart!");
            } else {
                System.out.println("The item was not added to the cart.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
    }

    @Given("I am on my cart page")
    public void i_am_on_my_cart_page() {
        driver.get("https://www.bestbuy.com/cart");
      
    }

    @When("I proceed to the checkout page")
    public void i_proceed_to_the_checkout_page() {
        WebElement checkoutButton = driver.findElement(By.id("checkout-button"));
        checkoutButton.click();
    }

    @When("I fill out the form with dummy payment information")
    public void i_fill_out_the_form_with_dummy_payment_information() {
        driver.findElement(By.id("creditCardInputName")).sendKeys("vj");
        driver.findElement(By.id("creditCardInputNumber")).sendKeys("4111111111111111"); 
        driver.findElement(By.id("creditCardInputExpirationMonth")).sendKeys("12");
        driver.findElement(By.id("creditCardInputExpirationYear")).sendKeys("2025");
        driver.findElement(By.id("creditCardInputCVV")).sendKeys("123");
    }

    @When("I can place an order successfully and see a confirmation")
    public void i_can_place_an_order_successfully_and_see_a_confirmation() {
        driver.findElement(By.id("placeOrderButton")).click();
        String confirmationMessage = driver.findElement(By.xpath("//div[contains(text(), 'Thank you for your purchase')]")).getText();
        if (confirmationMessage.contains("Thank you for your purchase")) {
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Order failed!");
        }
    }

    @Then("I close the web browser")
    public void i_close_the_web_browser() {
        driver.quit();
    }
    }

    
       
    

	


