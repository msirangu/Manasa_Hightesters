package Registerpom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Username {
	
    public static WebDriver driver;
     String URL = "https://dsportalapp.herokuapp.com/register";
       By registerButton = By.xpath("/html/body/div[2]/div/div[2]/form/input[5]");
       By usernameError = By.xpath("//*[@id=\"id_username\"]");

  
    public String register() {
    	System.setProperty("Webdriver.Chrome.driver","/Users/rsirangu/eclipse-workspace-maven/DS-algoBDD/src/test/java/Registerpom/Username.java.exe");
    	
    	driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(registerButton).click();
		String str = driver.findElement(usernameError).toString();
		
		return str;
    }
      
public static void main(String[] args) {
		
		Username obj = new Username();
		 String strmessage = obj.register();
		 System.out.println(strmessage);
		
		 driver.close();driver.quit();
	}

	
}
