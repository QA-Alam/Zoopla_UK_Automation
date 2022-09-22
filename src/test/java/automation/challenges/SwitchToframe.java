package automation.challenges;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToframe {
	public static void main(String[] args) throws NoSuchElementException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();

		// int size = driver.findElements(By.tagName("iframe")).size();
		/*
		 * for(int i=0; i<=size; i++){ driver.switchTo().frame(i); int
		 * total=driver.findElements(By.xpath("html/body/a/img")).size();
		 * System.out.println(total); driver.switchTo().defaultContent(); //switching
		 * back from the iframe }
		 */
		// Commented the code for finding the index of the element
		driver.switchTo().frame(0); // Switching to the frame
		System.out.println("********We are switched to the iframe*******");
		driver.findElement(By.xpath("html/body/a/img")).click();
		// Clicking the element in line with Advertisement
		System.out.println("*********We are done***************");
	}
}