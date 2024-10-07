/*"Assignment2
open Google and type INDIA 
"*/

package basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.id("APjFqb"));
		
		e.sendKeys("INDIA");

	}

}
