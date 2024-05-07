package Registerpom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R2 {
	
    private static final By usernameError = null;
	public static WebDriver driver;
     String URL = "https://dsportalapp.herokuapp.com/register";
      By usernameField = By.xpath("//*[@id=\"id_username\"]");
       By registerButton = By.xpath("/html/body/div[2]/div/div[2]/form/input[5]");
       By passwordError = By.xpath("//*[@id=\"id_password1\"]");

       public String register() {
       	System.setProperty("Webdriver.Chrome.driver","/Users/rsirangu/eclipse-workspace-maven/DS-algoBDD/src/test/java/Registerpom/R2.java.exe");
       	
       	
   		driver.get(URL);
   	    driver.findElement(usernameField).sendKeys("manasa");
        driver.findElement(registerButton).click();
        driver.findElement(passwordError);
   		return ((WebElement) passwordError).getText();
       }
      
public static void main(String[] args) {
		
		R2 obj = new R2();
		 obj.register();
	}

	
}

    


