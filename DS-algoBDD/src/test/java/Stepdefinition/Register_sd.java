package Stepdefinition;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class Register_sd {



	private ChromeDriver driver;

	  String baseURL = "https://dsportalapp.herokuapp.com/register";
	  By usernameField = By.xpath("//*[@id=\"id_username\"]");
      By PasswordField1 = By.xpath("//*[@id=\"id_password1\"]");
      By passwordconfirm = By.xpath("//*[@id=\"id_password2\"]");
      By registerButton = By.xpath("/html/body/div[2]/div/div[2]/form/input[5]");
      By Error      =By.xpath("/html/body/div[3]");
      By passwordconfirmError = By.xpath("//*[@id=\"id_password1\"]");
      By usernameError =By.xpath("//*[@id=\"id_username\"]");
      By invaliduserError = By.xpath("/html/body/div[3]");
      By passwordError = By.xpath("//*[@id=\"id_password1\"]");
      
	     String actualErrorMessage;
	     
	     @Before
	     public void setup(Scenario scenario) {
	    	 System.setProperty("webdriver.chrome.driver", "chromedriver");
	         driver = new ChromeDriver();
	     }
	
	    @Given("The user opens Register Page\"https:\\/\\/dsportalapp.herokuapp.com\\/register\"" )
	    public void the_user_opens_register_page_https_dsportalapp_herokuapp_com_register(){
		
        driver.get(baseURL);
	    } 
	    
	    @When("The user clicks {string} button with all fields empty")
	    public void the_user_clicks_button_with_all_fields_empty(String string) {
	    	driver.findElement(registerButton).click();
	    }

	    @Then("It should display an error {string} below Username textbox")
	    public void it_should_display_an_error_below_username_textbox(String string) {
	    	actualErrorMessage = driver.findElement(usernameError).getText();
	    	String expectedErrorMessage = "please fill out this field";
	    	String actualErrorMessage = "please fill out thid field";
	    	assertEquals("Expected and actual error messages are the same", expectedErrorMessage, actualErrorMessage);
           
           
	        
	    }
        @When("The user clicks {string} button after entering Username with other fields empty")
        public void the_user_clicks_button_after_entering_username_with_other_fields_empty(String string) {
        	driver.findElement(usernameField).sendKeys("manasa");
            driver.findElement(registerButton).click();
             }

        @Then("It should display an error {string} below Password textbox")
        public void it_should_display_an_error_below_password_textbox(String string) {
        	actualErrorMessage = driver.findElement(passwordError).getText();
        	String expectedErrorMessage = "please fill out this field";
	    	String actualErrorMessage = "please fill out thid field";
	    	assertEquals("Expected and actual error messages are the same", expectedErrorMessage, actualErrorMessage);
	    
	}
        @When("The user clicks {string} button after entering Username and password with Password Confirmation field empty")
        public void the_user_clicks_button_after_entering_username_and_password_with_password_confirmation_field_empty(String string) {
        	driver.findElement(usernameField).sendKeys("manasa");
        	driver.findElement(PasswordField1).sendKeys("venna");
            driver.findElement(registerButton).click();
        }

        @Then("It should display an error {string} below Password Confirmation textbox")
        public void it_should_display_an_error_below_password_confirmation_textbox(String string) {
        	actualErrorMessage = driver.findElement(passwordconfirmError).getText();
        	String expectedErrorMessage = "please fill out this field";
	    	String actualErrorMessage = "please fill out thid field";
	    	assertEquals("Expected and actual error messages are the same", expectedErrorMessage, actualErrorMessage);
           
        }
        
        @When("The user clicks {string} button after entering invalid username")
        public void the_user_clicks_button_after_entering_invalid_username(String string) {
        	driver.findElement(usernameField).sendKeys("8976");
    		driver.findElement(PasswordField1).sendKeys("Sahasra@123");
    		driver.findElement(passwordconfirm).sendKeys("Sahasra@123");
    		driver.findElement(registerButton).click();
           
        }

        @Then("It should display an error message {string}")
        public void it_should_display_an_error_message(String string) {
        	actualErrorMessage = driver.findElement(invaliduserError).getText();
        	String expectedErrorMessage = "invalid username";
	    	String actualErrorMessage = "";
	    	assertEquals("Expected and actual error messages are the same", expectedErrorMessage, actualErrorMessage);
           
            
        }
        @When("The user clicks {string} button after entering different passwords in Password and Password Confirmation fields")
        public void the_user_clicks_button_after_entering_different_passwords_in_password_and_password_confirmation_fields(String string) {
        	driver.findElement(usernameField).sendKeys("manasa");
    		driver.findElement(PasswordField1).sendKeys("Sahasra@123");
    		driver.findElement(passwordconfirm).sendKeys("venna");
    		driver.findElement(registerButton).click();
        }

        @Then("display an error message {string}")
        public void display_an_error_message(String string) {
        	actualErrorMessage = driver.findElement(invaliduserError).getText();
            assertEquals("Expected error message", "Actual error message", actualErrorMessage);
            
        }

        @When("The user clicks {string} button after entering valid Username and password with Password Confirmation")
        public void the_user_clicks_button_after_entering_valid_username_and_password_with_password_confirmation(String string) {
        	driver.findElement(usernameField).sendKeys("manasa");
    		driver.findElement(PasswordField1).sendKeys("Sahasra@123");
    		driver.findElement(passwordconfirm).sendKeys("Sahasra@123");
    		driver.findElement(registerButton).click();
        }

        @Then("but showing password mismatch msg although password fields are same.")
        public void but_showing_password_mismatch_msg_although_password_fields_are_same() {
        	actualErrorMessage = driver.findElement(invaliduserError).getText();
            assertEquals("Expected error message", "Actual error message", actualErrorMessage);
            
        }
        @When("The user enters a same Password in both password with all numeric more than {int}")
        public void the_user_enters_a_same_password_in_both_password_with_all_numeric_more_than(Integer int1) {
        	driver.findElement(usernameField).sendKeys("manasa");
    		driver.findElement(PasswordField1).sendKeys("12345678");
    		driver.findElement(passwordconfirm).sendKeys("12345678");
    		driver.findElement(registerButton).click();
        }

        @Then("password_mismatch")
        public void password_mismatch() {
        	actualErrorMessage = driver.findElement(invaliduserError).getText();
            assertEquals("Expected error message", "Actual error message", actualErrorMessage);
           
        }
        
        @After
        public void tearDown(Scenario scenario) {
            System.out.println("Ending scenario: " + scenario.getName());
            if (driver != null) {
                driver.quit();
            }
        }
        
        }



        
        
      





