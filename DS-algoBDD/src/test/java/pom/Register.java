package pom;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Register {
	static WebDriver driver;
    String url ="https://dsportalapp.herokuapp.com/register";
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[5]")  WebElement registerButton;
    //@FindBy(xpath = "//*[@id=\\\"id_username\\\"]")  WebElement usernameError;
   @FindBy(xpath = "//*[@id=\\\"id_password1\\")  WebElement passwordError;
    @FindBy(id = "id_username")  WebElement username; 
    //@FindBy(id = "id_password2")  WebElement passwordconfirmerror; 
    @FindBy(id = "id_password1")  WebElement password; 
    @FindBy(id = "id_password2")  WebElement passwordconfirm;
    public Register(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
	public static void main(String[] args) {
		driver = new ChromeDriver();
		Register R=new Register(driver);
		R.page();
		Register B=new Register(driver);
		B.password();
		Register c=new Register(driver);
		c.passwordcon();
		Register D=new Register(driver);
		D.invalid();
		Register E=new Register(driver);
		E.home();
		Register F=new Register(driver);
		F.invalidpasswordsfields();
		Register G=new Register(driver);
		G.passwordsmismatch();
	}
	
	public  void page() {
		
	   driver.get(url);
	   registerButton.click();
	   System.out.println("usernameerror is displayed");
	}
	
	public void password() {
	     username.sendKeys("manasa");
	     registerButton.click();
	     System.out.println("passworderror is diaplayed");
	}
	public void passwordcon() {
		username.clear();
		username.sendKeys("manasa");
		password.sendKeys("Sahasra@123");
		registerButton.click();
		System.out.println("passwordconfirm error is diaplayed");
	}
	public  void  invalid() {
		username.clear();
		username.sendKeys("m123");
		password.clear();
		password.sendKeys("Sahasra@123");
		passwordconfirm.sendKeys("Sahasra@123");
		registerButton.click();
		System.out.println("invalidusername error is diaplayed");
	}
	public void home() {
		username.sendKeys("manasa");
		password.sendKeys("Sahasra@123");
		passwordconfirm.sendKeys("Sahasra@123");
		registerButton.click();
		System.out.println(" error is diaplayed");
		}
	public void invalidpasswordsfields() {
		username.sendKeys("manasa");
		password.sendKeys("12345");
		passwordconfirm.sendKeys("12345");
		registerButton.click();
		System.out.println(" error is diaplayed");
	}
	public void passwordsmismatch() {
		username.sendKeys("manasa");
		password.sendKeys("Sahasra@123");
		passwordconfirm.sendKeys("12345");
		registerButton.click();
		System.out.println(" error is diaplayed");
	}
	
}
