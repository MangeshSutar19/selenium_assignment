/*"Assignment 11
WAP launch Amazon.in
try to search something 
using search field 
using relative Xpath"*/

package basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		e.sendKeys("TShirt");
		
		WebElement e1 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		e1.click();
 		
		Thread.sleep(3000);
		driver.close();

	}

}
