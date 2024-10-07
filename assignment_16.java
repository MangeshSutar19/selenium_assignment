/*"Assignment 16 : In grotech application site,  go to register page
Write code for 3 drop downs"*/

package basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment_16 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();

		WebElement e = driver.findElement(By.id("Skills"));
		Select s = new Select(e);
		
		s.selectByIndex(1);
		
		Thread.sleep(3000);
		s.selectByValue("select1");
		Thread.sleep(3000);

		s.selectByVisibleText("Non-Technical Skills");


		
		
		
		WebElement e1 = driver.findElement(By.id("Country"));
		Select s1 = new Select(e1);
		
		s1.selectByIndex(3);
		
		Thread.sleep(3000);
		s1.selectByValue("Combodia");
		Thread.sleep(3000);

		s1.selectByVisibleText("Italy ");


		WebElement e2 = driver.findElement(By.id("Relegion"));
		Select s2 = new Select(e2);
		
		s2.selectByIndex(4);
		
		Thread.sleep(3000);
		s2.selectByValue("Jain");
		Thread.sleep(3000);

		s2.selectByVisibleText("Hindu");

		
		driver.close();
		
		
		
		

	}

}
