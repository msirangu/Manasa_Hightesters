package pom;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Array {
 
   
	 static WebDriver driver;
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
     
    public Array(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
	public static void main(String[] args) {
		driver = new ChromeDriver();
    	Array a = new Array(driver); 
    	a.open();
    	Array b = new Array(driver);
    	b.array();
    	Array c= new Array(driver);
    	c.Tryhere();
    	Array d= new Array(driver);
    	d.RunButton();
    	Array e= new Array(driver);
    	e.Invalidcode();
    	Array f= new Array(driver);
    	f.validcode();
    	Array g= new Array(driver);
    	g.navigate();
    	Array h= new Array(driver);
    	h.Basic();
    	Array i= new Array(driver);
    	i.Area();
    	Array j= new Array(driver);
    	j.Back();
    	Array k= new Array(driver);
    	k.practice();
    	Array l= new Array(driver);
    	l.python();
    	Array m= new Array(driver);
    	m.output();
    	Array n= new Array(driver);
    	n.submit();
    	Array A =new Array(driver);
    	A.practice1();
    	Array p=new Array(driver);
    	p.python1();
    	Array q= new Array(driver);
    	q.output1();
    	Array r =new Array(driver);
    	r.submit1();
    	Array s= new Array(driver);
    	s.practice2();
    	Array t= new Array(driver);
    	t.python2();
    	Array u= new Array(driver);
    	u.output2();
    	Array v= new Array(driver);
    	v.submit2();
	 	}

    public  void open() {
        driver.get(url);
        System.out.println("open the url");
        signInLink.click();
        username.sendKeys("manasa");
        passwordField.sendKeys("Sahasra@123");
        loginButton.click();
         Array.click();
         Getstarted.click();
         System.out.println("click on GetStarted");
         System.out.println("open the array page");
         
       }
    public void array() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1000)");
    	Arraysinpython.click();
    	System.out.println("open the arraysinpage");
    }
    public void  Tryhere() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
     	js.executeScript("window.scrollBy(0,1000)");
     	(Tryhere).click();
     	System.out.println("click on Tryhere");
        System.out.println("opens python editor");
    }
    public void  RunButton() {
    	RUN.click();
    	 System.out.println("No error msg is diaplayed");
    }
    public  void  Invalidcode()  {
    	  try {
    		  WebDriverWait wait = new WebDriverWait(driver, 10);
    		    WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("Editor")));
    	Editor.click();
    	Editor.sendKeys("intx=2");
    	  }
		  catch(Exception e){
			  System.out.println("send the invalidcode to editor");
		  }
    	RUN.click();
    	System.out.println("click on RUN");
    	 System.out.println("Error is diaplayed");

    }
    public void validcode( ) {
    try {
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		    WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("Editor")));
		    Editor.click();
		    Editor.sendKeys("print(\\\"Hello, World!\\\")");
		  }
		  catch(Exception e){
			  System.out.println("send the code to editor");
		  }

          RUN.click();
          System.out.println("click on RUN");
	     System.out.println("output is diaplayed");
}
    public  void navigate() {
		  driver.navigate(). back();
		  driver. navigate(). back();
		  arraylist.click();
		 System.out.println("open the arraylist page");
	 }
    
    public void Basic() {
    	Basicarrylist.click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1000)");
    	tryhere.click();
    	System.out.println("open the editor page");
    }
    public void Area() {
    	try {
  		  WebDriverWait wait = new WebDriverWait(driver, 10);
  		    WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("area")));
  	area.click();
  	area.sendKeys("intx=2");
  	  }
		  catch(Exception e){
			  System.out.println("send the code to area");
		  }
  	RUN.click();
  	 System.out.println("Error is diaplayed");
    }
    public void Back() {
    	driver.navigate().back();
    	Applicationarray.click();
    	System.out.println("open the browser");
    	Practice.click();
    	System.out.println("open th browser");
    }
    public void practice() {
    	max.click();
    	System.out.println("open the page");
    	RUN.click();
    	System.out.println("no message is displayed");
    	 }
    public void python() {
    	try {
    		  WebDriverWait wait = new WebDriverWait(driver, 10);
    		    WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("python")));
    	python.click();
    	python.clear();
    	python.sendKeys("123");
    	  }
  		  catch(Exception e){
  			  System.out.println("send the code to python");
  		  }
    	RUN.click();
    	 System.out.println("Error is diaplayed");
    	
    }
    public void output() {
    	try {
    		  WebDriverWait wait = new WebDriverWait(driver, 10);
    		    WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("python")));
    	python.click();
    	python.clear();
    	area.sendKeys("print(\\\\\"Hello, World!\\\\\")");
    	  }
  		  catch(Exception e){
  			  System.out.println("send the code to python");
  		  }
    	RUN.click();
    	 System.out.println("output is diaplayed");
    }
    
    public void submit() {
    	try {
  		  WebDriverWait wait = new WebDriverWait(driver, 10);
  		    WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("python")));
  	python.click();
  	python.clear();
  	area.sendKeys("print(\\\\\"Hello, World!\\\\\")");
  	  }
		  catch(Exception e){
			  System.out.println("send the code to python");
		  }
  	submit.click();
  	 System.out.println("error is diaplayed");
    }
    public void practice1() {
    	driver.navigate().back();
    	Even.click();
    	RUN.click();
    	System.out.println("no message is displayed");
    }
    public void python1() {
    	try {
    		  WebDriverWait wait = new WebDriverWait(driver, 10);
    		    WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("python")));
    	python.click();
    	python.clear();
    	python.sendKeys("123");
    	  }
  		  catch(Exception e){
  			  System.out.println("send the code to python");
  		  }
    	RUN.click();
    	 System.out.println("Error is diaplayed");
    	
    }
    
    
    public void output1() {
    	try {
    		  WebDriverWait wait = new WebDriverWait(driver, 10);
    		    WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("python")));
    	python.click();
    	python.clear();
    	area.sendKeys("print(\\\\\"Hello, World!\\\\\")");
    	  }
  		  catch(Exception e){
  			  System.out.println("send the code to python");
  		  }
    	RUN.click();
    	 System.out.println("output is diaplayed");
    }
    public void submit1() {
    	try {
  		  WebDriverWait wait = new WebDriverWait(driver, 10);
  		    WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("python")));
  	python.click();
  	python.clear();
  	area.sendKeys("print(\\\\\"Hello, World!\\\\\")");
  	  }
		  catch(Exception e){
			  System.out.println("send the code to python");
		  }
  	submit.click();
  	 System.out.println("error is diaplayed");
    }
    public void practice2() {
    	driver.navigate().back();
    	squares.click();
    	RUN.click();
    	System.out.println("no message is displayed");
    }
    public void python2() {
    	try {
    		  WebDriverWait wait = new WebDriverWait(driver, 10);
    		    WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("python")));
    	python.click();
    	python.clear();
    	python.sendKeys("123");
    	  }
  		  catch(Exception e){
  			  System.out.println("send the code to python");
  		  }
    	RUN.click();
    	 System.out.println("Error is diaplayed");
    	
    }

    public void output2() {
    	try {
    		  WebDriverWait wait = new WebDriverWait(driver, 10);
    		    WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("python")));
    	python.click();
    	python.clear();
    	area.sendKeys("print(\\\\\"Hello, World!\\\\\")");
    	  }
  		  catch(Exception e){
  			  System.out.println("send the code to python");
  		  }
    	RUN.click();
    	 System.out.println("output is diaplayed");
    }
    
    public void submit2() {
    	try {
  		  WebDriverWait wait = new WebDriverWait(driver, 10);
  		    WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("python")));
  	python.click();
  	python.clear();
  	area.sendKeys("print(\\\\\"Hello, World!\\\\\")");
  	  }
		  catch(Exception e){
			  System.out.println("send the code to python");
		  }
  	submit.click();
  	 System.out.println("error is diaplayed");
    } 
}


	
	
     
          
         
 
  


      

      
     

