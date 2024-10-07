/*Assignment 18 : Drag n drop from GroTechMind site & select json to put it in empty box*/

package basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.id("drag11"));
		WebElement tareget = driver.findElement(By.id("div2"));

		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, tareget).perform();
		
		

		
	}

}
