/*Assignment 13 : Launch Flipkart Application and click on Fashion.*/

package basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment_13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
				
		Thread.sleep(3000);

		WebElement e = driver.findElement(By.xpath("//*[@src='https://rukminim2.flixcart.com/fk-p-flap/64/64/image/0d75b34f7d8fbcb3.png?q=100']"));
		act.moveToElement(e).perform();
		
		
				
		Thread.sleep(3000);
		driver.close();


	}

}
