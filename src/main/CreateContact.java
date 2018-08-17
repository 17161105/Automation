package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	WebDriver driver;
	WebDriverWait wait;
	
	public static void createContact(WebDriver driver, WebDriverWait wait) {
		  // ---------------------------Create Contact------------------------------		       
			//Click Quick Create button
	        WebElement btnQuickCreate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/a[1]")));
	        btnQuickCreate.click();
	       
	        //Click Create Contact Button
	        WebElement btnCreateContact = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]/span[1]")));
	        btnCreateContact.click();
	        
	        //Quick Create Contact form
	        String quickCreateContact = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/form[1]/div[1]/div[1]")).getText();
	        if (quickCreateContact.equals("Quick Create Contact")) {
				System.out.println("Quick Create Contact form found");
	        }else {
					System.out.println("Quick Create Contact form not found");
			};
			
			WebElement txtContactLastName = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]"));
			txtContactLastName.sendKeys("Arcolas");
			
			Select picklistContactLastName = new Select (driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]/select[1]")));
			picklistContactLastName.selectByVisibleText("Team Selling");
			
			WebElement btnContactSave = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/form[1]/div[3]/center[1]/button[2]"));
			btnContactSave.click();
			
			try{
				Thread.sleep(5000);
				}
				catch(InterruptedException ie){
				};
	}
}
