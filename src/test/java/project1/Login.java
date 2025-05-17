package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import package2.standard1;

public class Login extends standard1{

	//WebDriver driver=new ChromeDriver();
	//public WebDriver driver;
	//public   WebElement userperu;
	@FindBy(id="userEmail")
	WebElement userperu;
	//public   WebElement userpswd;
	@FindBy(id="userPassword")
	WebElement userpswd;
	//public   WebElement loginBtn;
	@FindBy(id="login")
	WebElement loginBtn;

	public Login(WebDriver driverr) {
		this.driver=driverr;
		PageFactory.initElements(driver, this);
	// TODO Auto-generated constructor stub
}

	public  void firstpageLogIn(String name,String pwd) {
		
		
		//driver.get("https://rahulshettyacademy.com/client");
		//userperu=driver.findElement(By.id("userEmail"));
		//userpswd=driver.findElement(By.id("userPassword"));
		//loginBtn=driver.findElement(By.id("login"));
		userperu.sendKeys(name);
		userpswd.sendKeys(pwd);
		loginBtn.click();
		
	}
	
	
}
