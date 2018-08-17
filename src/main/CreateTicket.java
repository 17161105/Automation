package main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
public class CreateTicket {

	WebDriver driver;
	WebDriverWait wait;
	
	public static void createTicket(WebDriver driver, WebDriverWait wait) {
		
		WebElement btnQuickCreate, btnCreateTicket;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		
        /*---------------------------Create Ticket------------------------------*/
       //Click Quick Create button
       btnQuickCreate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menubar_quickCreate\"]")));
       btnQuickCreate.click();
       //Click Create Ticket Button
       btnCreateTicket = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/nav/div[1]/div/div[3]/ul/li[1]/div/ul/li[2]/div/div[1]/div[3]/a/span")));
       btnCreateTicket.click();
       //Quick Create Ticket form
       String quickCreateTicket = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/form[1]/div[1]/div[1]")).getText();
       if (quickCreateTicket.equals("Quick Create Ticket")) {
			System.out.println("Quick Create Ticket form found");
       }else {
				System.out.println("Quick Create Ticket form not found");
				driver.close();
		};
		
		WebElement txtTicketTitle = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		txtTicketTitle.sendKeys("Ticket " + dateFormat.format(date));
		
		Select txtTicketPriority = new Select (driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/select[1]")));
		txtTicketPriority.selectByVisibleText("Normal");

		Select picklistTicketStatus= new Select (driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/select[1]")));
		picklistTicketStatus.selectByVisibleText("Open");
		
		Select picklistTicketAssignedTo = new Select (driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/form/div[2]/div/div[1]/div/table/tbody/tr[1]/td[4]/select")));
		picklistTicketAssignedTo.selectByVisibleText("Marketing Group");
		
		WebElement btnTicketSave = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/form[1]/div[3]/center[1]/button[2]/strong[1]"));
		btnTicketSave.click();
		
		try{
			Thread.sleep(5000);
			}
			catch(InterruptedException ie){
			};

	}
}
