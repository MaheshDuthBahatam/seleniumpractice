package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class standard1 {
	public WebDriver driver;
	
	
	
	public WebDriver goTo(){
		 driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		return driver;
	}
	

}
