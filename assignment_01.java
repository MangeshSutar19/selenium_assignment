/*"Selenium  Assignment1
WAP for launch multiple empty browser like 
Chrome,Firefox,Edge,safari"*/

package basicsSelenium;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter 1 to open chrome browser");

		System.out.println("Enter 2 to open firefox browser");

		System.out.println("Enter 3 to open sagari browser");

		System.out.println("Enter 4 to open Edge browser");
		
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		
		switch(num)
		{

		case 1  : ChromeDriver driver = new ChromeDriver();
		break ;

		case 2  : //FirefoxDriver driver1 = new FirefoxDriver();
		break ;

		case 3  : //EdgeDriver driver2 = new EdgeDriver();
		break ;

		case 4  :// SafariDriver driver3 = new safari();
		break ;
		
		}
		
	}

}
