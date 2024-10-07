
//Assignment 15: Launch amazon ,select a catagory as books,search a book called power of minds and press enter button*/
package basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment_15 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

        WebElement e = driver.findElement(By.id("searchDropdownBox"));
        e.click();
        
        Select s = new Select(e);
        
        s.selectByVisibleText("Books");
        
        WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
        e1.sendKeys("power of minds");
        
        WebElement e2 = driver.findElement(By.id("nav-search-submit-button"));
        e2.sendKeys(Keys.ENTER);
        
        
        
        
        
	}

}
