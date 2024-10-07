package basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_03_amazonlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();

		
		//mobile number or email id -webelement
		
		WebElement e1 = driver.findElement(By.id("ap_email"));
		e1.sendKeys("test@test.com");
		
		//Enter password element
		WebElement e2 = driver.findElement(By.name("password"));
		e2.sendKeys("test@133");
		
		//click on login button
		
		WebElement e3 = driver.findElement(By.id("signInSubmit"));
		
		e3.click();
		
		
		
		

	}

}
