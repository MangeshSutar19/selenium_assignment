//Assignment 19: Launch amazon, hover over account & list and click on sign in


package basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(e).perform();
		
		WebElement e1 = driver.findElement(By.className("nav-action-inner"));
		e1.click();
		
	}

}
