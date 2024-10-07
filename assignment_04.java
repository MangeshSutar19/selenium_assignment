/*"Assignment4
With help of ID Locator  search something on Amazon "*/

package basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement e = driver.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys("TShirt");
		
		Thread.sleep(3000);
		driver.close();

		
		
	}

}
