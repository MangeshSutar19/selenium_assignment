/*Assignemnt 17 : Select Amazon site, do Hoverover on language & select favourite language*/

package basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment_17 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement e  =driver.findElement(By.xpath("//div[text()='EN']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(e).perform();
		
		
		
		Thread.sleep(5000);
		//WebElement e1 = driver.findElement(By.xpath("//a[@lang='kn-IN']"));
	}

}
