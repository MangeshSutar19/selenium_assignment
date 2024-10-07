/*"Assignment7
WAP launch Amazon.in and click on Customer service with help of  PartialLinkText locator"*/

package basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

        WebElement e = driver.findElement(By.partialLinkText("Customer"));
        
        e.click();


	}

}
