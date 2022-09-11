package automation.challenges;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.wikipedia.org/");
		
		//DropDown.getSelectTheValue("العربية");
		//DropDown.getSelectTheValue("Polski");
		//Select select = new Select (driver.findElement(By.xpath("//*[@id='searchLanguage']")));	
		//select.selectByIndex(2);
	    //select.selectByValue("ar");
 	    // select.selectByVisibleText("العربية");
		
	}
 	     
 	     public static void getSelectTheValue(String text) throws InterruptedException {
 	     List <WebElement> elem = driver.findElements(By.xpath("//*[@id='searchLanguage']/option"));
 	  
 	     
		for (WebElement value : elem ) {
			System.out.println(value.getSize());
			
			if(text.equals(value.getText())) {
				value.click();
				break;
			}
			
			
		}
		
		
	}

}
