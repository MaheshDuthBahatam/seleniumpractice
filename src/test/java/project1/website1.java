package project1;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import package2.standard1;
import package2.waitsclass;

public class website1 extends standard1 {
	

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver=new ChromeDriver();
		website1 wb1=new website1();
		WebDriver driver=wb1.goTo();
		waitsclass wc=new waitsclass(driver);
		
		wc.implicitwait();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https://rahulshettyacademy.com/client");
		//LogIN
		Login lg1=new Login(driver);
		lg1.firstpageLogIn("ch1@gmail.com","Chennai@1");
		
		
		//driver.findElement(By.id("userEmail")).sendKeys("ch1@gmail.com");
		//driver.findElement(By.id("userPassword")).sendKeys("Chennai@1");
		//driver.findElement(By.id("login")).click();
		//Product1 --->Add to cart 
		//driver.findElement(By.xpath("(//div[@class='card-body'] )[1] //button[@class='btn w-10 rounded']")).click();
		addTocart atc=new addTocart(driver);
		atc.cart();
		
		
		
		wc.explicitwaits();
		wc.explicitInvisible();
		//WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(20));
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
//		//Thread.sleep(1000);
//		w.until(ExpectedConditions.invisibilityOfElementLocated(By.id("toast-container")));
		
		
		
		//Click on cart
		driver.findElement(By.xpath("(//li/button[@class='btn btn-custom'])[3]")).click();
		//checkOut button click
		driver.findElement(By.xpath("(//ul)[3] //button[@class='btn btn-primary']")).click();
		//payment page
		driver.findElement(By.cssSelector("input[placeholder='Select Country']")).sendKeys("India");
		List<WebElement> country= driver.findElements(By.cssSelector("span[class='ng-star-inserted']"));
		
		
		for(WebElement con: country) {
			if (con.getText().equalsIgnoreCase("India")) {
				con.click();
				break;
			}
			else continue;	
		}
		//place order button
		driver.findElement(By.cssSelector("a[class*='action__submit']")).click();
		
		wc.explicitwaits();
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
	//w.until(ExpectedConditions.invisibilityOfElementLocated(By.id("toast-container")));
		
		
		//Final Page
		Assert.assertEquals(driver.findElement(By.cssSelector("tbody h1")).getText(), "THANKYOU FOR THE ORDER.");
		//SignOut button
		driver.findElement(By.xpath("(//li/button[contains(@class,'btn-custom')]) [4]")).click();
		
		wc.explicitInvisible();
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		//driver.close();
	}

}
