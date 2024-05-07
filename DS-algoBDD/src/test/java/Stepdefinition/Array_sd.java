package Stepdefinition;





import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Array;


public class Array_sd {

	


    String url ="https://dsportalapp.herokuapp.com/home";
    @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")  WebElement signInLink;
     @FindBy(xpath = "//*[@id=\"id_username\"]")WebElement username;
     @FindBy(xpath = "//*[@id=\"id_password\"]") WebElement passwordField;
     @FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[4]") WebElement loginButton;
     @FindBy(xpath = "/html/body/div[2]/p[7]") WebElement topicsCovered;
     @FindBy(xpath = "/html/body/div[2]/ul[1]/a") WebElement arraysInPythonLink;
     @FindBy(xpath="/html/body")  WebElement Array;
     @FindBy(xpath="/html/body/div[3]/div[2]/div/div/a") WebElement Getstarted;
     @FindBy(xpath="/html/body/div[2]/ul[1]/a") WebElement Arraysinpython;
     @FindBy(xpath=" /html/body/div[2]/div/div[2]/a") WebElement Tryhere;
     @FindBy(xpath="//*[@id=\"answer_form\"]/button") WebElement RUN;
     @FindBy(xpath="/html/body/div/div/form/div/div/div[6]/div[1]/div/div/div/div[1]") WebElement Editor;
     @FindBy(xpath="/html/body/div[2]/ul[2]/a ")  WebElement arraylist;
     @FindBy(xpath ="//*[@id=\"content\"]/li[3]/a") WebElement Basicarrylist;
     @FindBy(xpath="/html/body/div[2]/div/div[2]/a")WebElement tryhere;
     @FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre") WebElement area;
     @FindBy(xpath="//*[@id=\"content\"]/li[4]/a") WebElement Applicationarray;
     @FindBy(xpath="//*[@id=\"content\"]/a") WebElement Practice;
     @FindBy(xpath="/html/body/div[3]/a") WebElement max;
     @FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre") WebElement python;
     @FindBy(xpath="//*[@id=\"answer_form\"]/input[2]") WebElement  submit;
     @FindBy(xpath="/html/body/div[4]/a") WebElement Even;
     @FindBy(xpath="/html/body/div[5]/a") WebElement squares;
     
	static WebDriver driver;
    public Array ap;
    
    @Before
   public void setup(Scenario scenario) {
   	 System.setProperty("webdriver.chrome.driver", "chromedriver");
   	
    }
 
 
@Given("The user is on the DS Algo Home Page")
public void the_user_is_on_the_ds_algo_home_page() {
	 driver=new ChromeDriver();
	 ap=new Array(driver);
     driver.get("https://dsportalapp.herokuapp.com/home");
	System.out.println("open the  String url");
    
}

@When("The user clicks  Get Started button below the array")
public void the_user_clicks_get_started_button_below_the_array() {
	  
	System.out.println("click on GetStarted");
   
}
@Then("The user should be redirected to the Array Page")
public void the_user_should_be_redirected_to_the_array_page() {
	System.out.println("open the array page");
    
}
@Given("The user is on the Array in Python Page")
public void the_user_is_on_the_array_in_python_page() {
	System.out.println("open the array page");
}

@When("The user clicks a Arrays in Python link")
public void the_user_clicks_a_arrays_in_python_link() {
	System.out.println("click on Arrays in python link");
	
}


@Then("The user should be redirected to {string}")
public void the_user_should_be_redirected_to(String string) {
	System.out.println("open the arraysinpage");
}

@When("The user clicks Try Here button of Array in Python Page")
public void the_user_clicks_try_here_button_of_array_in_python_page() {
	System.out.println("click on Tryhere");
}

@Then("The user should be redirected to a page having an Python Editor with a url {string}")
public void the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String string) {
	System.out.println("opens python editor");
}
@Given("The user is on the Python Editor")
public void the_user_is_on_the_python_editor() {
	System.out.println("opens python editor");
}

@When("The user clicks the Run Button without entring the code in the Editor")
public void the_user_clicks_the_run_button_without_entring_the_code_in_the_editor() {
	System.out.println("click on RUN");
}

@Then("Nothing happens to the page and no error message is displayed")
public void nothing_happens_to_the_page_and_no_error_message_is_displayed() {
	System.out.println("No error msg is diaplayed");
}
@Given("user is on the Python Editor")
public void user_is_on_the_python_editor() {
	System.out.println("opens python editor");
}

@When("The user write the invalid code in Editor")
public void the_user_write_the_invalid_code_in_editor() {
	System.out.println("send the invalidcode to editor");
}

@When("Click the Run Button")
public void click_the_run_button() {
	System.out.println("click on RUN");
}

@Then("The user should able to see an error message in alert window")
public void the_user_should_able_to_see_an_error_message_in_alert_window() {
	System.out.println("Error is diaplayed");
}

@When("The user write the valid code in Editor")
public void the_user_write_the_valid_code_in_editor() {
	System.out.println("send the validcode to editor");
	System.out.println("click on RUN");
}

@Then("The user should able to see output in the console")
public void the_user_should_able_to_see_output_in_the_console() {
	System.out.println("output is diaplayed");
}
@Given("The  user is on the Basic Operations in Lists page")
public void the_user_is_on_the_basic_operations_in_lists_page() {
	driver.navigate(). back();
	
	
}

@When("The user clicks an Applications of Array link")
public void the_user_clicks_an_applications_of_array_link() {
	System.out.println("open the arraylist page");
}

@Then("The user should be redirected to {string} AA page.")
public void the_user_should_be_redirected_to_aa_page(String string) {
	System.out.println("open the arraylist page");
}

@Given("The  user is on the  Applications of Array page")
public void the_user_is_on_the_applications_of_array_page() {
	System.out.println("open the arraylist page");
}

@When("The user clicks Try Here button of Application of Array page")
public void the_user_clicks_try_here_button_of_application_of_array_page() {
	System.out.println("open the editor page");
}
@Given("The  user is in the Applications of Array page")
public void the_user_is_in_the_applications_of_array_page() {
    driver.navigate().back();
}

@When("The user clicks Practice Questions link")
public void the_user_clicks_practice_questions_link() {
	System.out.println("open the browser");
}

@Then("The user should be redirected to practice page having links like {string} ,{string},{string} and {string}")
public void the_user_should_be_redirected_to_practice_page_having_links_like_and(String string, String string2, String string3, String string4) {
	System.out.println("open the browser");
}

@Given("The user is on Practice page")
public void the_user_is_on_practice_page() {
    System.out.println("open the browser");
}

@When("The user clicks Max consecutive ones link")
public void the_user_clicks_max_consecutive_ones_link() {
	System.out.println("open the page");
}

@Then("The user should be redirected to {string} page contains a question,an tryEditor with Run and Submit buttons")
public void the_user_should_be_redirected_to_page_contains_a_question_an_try_editor_with_run_and_submit_buttons(String string) {
	System.out.println("send the code to python");
	
}

@Then("The user see an error message {string}")
public void the_user_see_an_error_message(String string) {
	System.out.println("error is diaplayed");
}
@Given("The  user is on the Applications of Array page")
public void the_user_is_on__applications_of_array_page() {
	driver.navigate().back();
}

@When("The user clicks squared of the sorted array link")
public void the_user_clicks_squared_of_the_sorted_array_link() {
	System.out.println("open the page");
}
@After
public void tearDown(Scenario scenario) {
    System.out.println("Ending scenario: " + scenario.getName());
    if (driver != null) {
        driver.quit();
    }
}
}
