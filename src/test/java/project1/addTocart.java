package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import package2.standard1;

public class addTocart extends standard1 {
	
	
	@FindBy(xpath="(//div[@class='card-body'] )[1] //button[@class='btn w-10 rounded']")
	WebElement item;
	
	public addTocart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void cart() {
		//driver.findElement(By.xpath("(//div[@class='card-body'] )[1] //button[@class='btn w-10 rounded']")).click();
		item.click();
	}
	

}
