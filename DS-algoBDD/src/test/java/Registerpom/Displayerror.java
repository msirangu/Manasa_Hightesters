package Registerpom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayerror {
	
    public static WebDriver driver;
     String URL = "https://dsportalapp.herokuapp.com/register";
       By usernameField = By.xpath("//*[@id=\"id_username\"]");
       By PasswordField = By.xpath("//*[@id=\"id_password1\"]");
       By passwordconfirm = By.xpath("//*[@id=\"id_password2\"]");
       By registerButton = By.xpath("/html/body/div[2]/div/div[2]/form/input[5]");
       By Displayerror = By.xpath("/html/body/div[3]");

  
    public String register() {
    	System.setProperty("Webdriver.Chrome.driver","/Users/rsirangu/eclipse-workspace-maven/DS-algoBDD/src/test/java/Registerpom/R2.java.exe");
    	
    	
		driver.get(URL);
		driver.findElement(usernameField).sendKeys("manasa");
		driver.findElement(PasswordField).sendKeys("Sahasra@123");
		driver.findElement(passwordconfirm).sendKeys("venna");
		driver.findElement(registerButton).click();
		driver.findElement(Displayerror);
		return ((WebElement) Displayerror).getText();
    }
      
public static void main(String[] args) {
		
		Displayerror obj = new Displayerror();
		 obj.register();
	}

	
}
