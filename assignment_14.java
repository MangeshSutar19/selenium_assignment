/*Assignment 14 :  Check Right click is disable in any banking application ex IDFC, ICICI etc and Insepct It*/

package basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();

	
		Actions act = new Actions(driver);
	
		WebElement e = driver.findElement(By.xpath("//*[@title='NRI']"));
		
		act.contextClick(e).perform();  //not allowing right click on banksite
		
		
		
		
	}

}
