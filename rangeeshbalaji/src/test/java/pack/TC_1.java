package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_1 {
 WebDriver driver; 
	@Test
 public void f() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\RANGEESH BALAJI\\OneDrive\\Desktop\\Driver folders\\chromedriver.exe");
driver = new ChromeDriver(); 
driver.manage().window().maximize();
driver.get("http://tutorialsninja.com/demo/");
driver.quit();
	   
	    
	      
  
  
  
  }
}
