package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {

	WebDriver driver;
	
	
	public static void signIn(WebDriver driver) {
       /*---------------------------SIGNIN------------------------------------*/
		WebElement username, password, btnSignIn;
		
        //username
        username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        username.sendKeys("admin");
        
        //password
        password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("12345");	
        
        //signin
        btnSignIn = driver.findElement(By.xpath("//*[@id=\"loginFormDiv\"]/form/div[3]/button"));
        btnSignIn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
		try{
			Thread.sleep(5000);
			}
			catch(InterruptedException ie){
			};
        
        boolean logoLoggedIn = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/img[1]")).isDisplayed();
        
        //Check if login is successful
        if (logoLoggedIn)   {
			System.out.println("Test Case \"Sign in\"  Passed");
		} else {
			System.out.println("Test Case \"Sign in\" Failed");
			driver.close();
		};
		
	}
}
