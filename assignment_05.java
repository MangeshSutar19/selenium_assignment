/*"Assignment5
WAP :on Youtube Search Grotechminds with help of ID locator "*/

package basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_05 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		
		
		
		WebElement e = driver.findElement(By.name("search_query"));  //for id locator , its not working 
		e.sendKeys("Grotechminds");
		
		WebElement e1 = driver.findElement(By.id("search-icon-legacy"));
		e1.click();
		
		Thread.sleep(3000);
		driver.close();


	}

}
