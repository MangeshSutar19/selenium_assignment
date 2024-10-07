/*"Assignment6
WAP launch Amazon.in try to click mobile with help of Linktest Locator "*/

package basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

        WebElement e = driver.findElement(By.linkText("Mobiles"));
        
        e.click();
        

	}

}
