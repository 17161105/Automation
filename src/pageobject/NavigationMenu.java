package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationMenu {
	
	static WebElement navElement;
	static WebDriver driver;
	static WebDriverWait wait;
	
	//Hamburger Icon
	public static WebElement navMenu(WebDriver driver) {
		navElement = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]"));
		return navElement;	
	}
	
	public static WebElement navMenuSupport(WebDriver driver) {
		navElement = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[1]/div[2]/div[5]/div[1]"));
		return navElement;
		
	}
	

}
