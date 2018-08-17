package main;
import pageobject.*;


import java.util.concurrent.TimeUnit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//Check github version control


public class Main {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverWait wait ;



		System.setProperty("webdriver.ie.driver","D://Automation//Drivers//IEDriverServer32bit.exe");

        driver = new InternetExplorerDriver();
        wait = new WebDriverWait(driver, 30);
        driver.navigate().to("http://localhost/vtigercrm/");
        Actions action = new Actions(driver);
 
     
        SignIn.signIn(driver);
        NavigationMenu.navMenu(driver).click();
        action.moveToElement(NavigationMenu.navMenuSupport(driver)).build().perform();
        //NavigationMenu.navMenuSupport(driver).click();
        //CreateTicket.createTicket(driver, wait);
        //CreateContact.createContact(driver, wait);
        //SignOut.signOut(driver,wait);



       
	}

}
