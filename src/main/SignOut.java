package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignOut {
	
	WebDriver driver;
	WebDriverWait wait ;
	
	public static void signOut(WebDriver driver,WebDriverWait wait) {
		WebElement btnProfile, btnSignOut, btnSignIn;

        //---------------------------SIGNOUT------------------------------------
		driver.navigate().refresh();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        btnProfile = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/nav/div[1]/div/div[3]/ul/li[5]/div/a/span[1]")));
        btnProfile.click();
        btnSignOut = driver.findElement(By.xpath("//*[@id=\"menubar_item_right_LBL_SIGN_OUT\"]"));
        btnSignOut.click();
        
        boolean logoHome = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/img[1]")).isDisplayed();
        if (logoHome) {
			System.out.println("Test Case \"Sign out\" Passed");
        }else {
				System.out.println("Test Case \"Sign out\" Failed");
		};
		
	}
	

}
