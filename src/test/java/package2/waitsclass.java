package package2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitsclass {
	public WebDriver driver;
	public WebDriverWait w;
	public waitsclass(WebDriver driverr) {
		this.driver=driverr;
		
	}
	
	
	public void explicitwaits() {
		
		w=new WebDriverWait(driver,Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		//Thread.sleep(1000);
		
	}
	public void implicitwait(){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	public void explicitInvisible() {
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.id("toast-container")));
	}
	
}
