package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testBase {
	
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	public testBase() {
		
		prop = new Properties();
		
			FileInputStream jahan;
			
try {
	jahan = new FileInputStream("C:\\Users\\sharm\\eclipse-workspace\\bdd\\src\\main\\java\\ConfigFile\\coofig.properties");
				
	prop.load(jahan);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
			
	}

   public  static void initialization() {
	 
	  String browsername = prop.getProperty("browser");
	  //String browsername = prop.getProperty("browser");
	  
	  if(browsername.equals("chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\auto\\chromedriver.exe\\");
		driver = new ChromeDriver();
	  }
	  else if(browsername.equals("FF")){
		  System.setProperty("webdriver.gecko.driver","C:\\auto\\chromedriver.exe\\");
		driver = new FirefoxDriver();
	  

}
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  
	  driver.get(prop.getProperty("url"));
	  
}
}

