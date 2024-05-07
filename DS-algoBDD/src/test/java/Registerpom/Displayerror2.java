package Registerpom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayerror2 {
	
    public static WebDriver driver;
     String URL = "https://dsportalapp.herokuapp.com/register";
       By usernameField = By.xpath("//*[@id=\"id_username\"]");
       By PasswordField = By.xpath("//*[@id=\"id_password1\"]");
       By passwordconfirm = By.xpath("//*[@id=\"id_password2\"]");
       By registerButton = By.xpath("/html/body/div[2]/div/div[2]/form/input[5]");
       By Display = By.xpath("/html/body/div[3]");

  
    public String register() {
    	System.setProperty("Webdriver.Chrome.driver","/Users/rsirangu/eclipse-workspace-maven/DS-algoBDD/src/test/java/Registerpom/Dispalyerror2.java.exe");
    	
    	
		driver.get(URL);
		driver.findElement(usernameField).sendKeys("manasa");
		driver.findElement(PasswordField).sendKeys("12345678");
		driver.findElement(passwordconfirm).sendKeys("12345678");
		driver.findElement(registerButton).click();
		driver.findElement(Display);
		return ((WebElement) Display).getText();
    }
      
public static void main(String[] args) {
		
		Displayerror2 obj = new Displayerror2();
		 obj.register();
	}

	
}