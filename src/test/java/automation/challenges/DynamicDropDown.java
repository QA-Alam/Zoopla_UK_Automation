package automation.challenges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");

		Actions act = new Actions(driver);

		WebElement drop = driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));

		act.moveToElement(drop).build().perform();

		//WebElement clickSignInBTN = driver.findElement(By.cssSelector("span.nav-action-inner"));
		// clickSignInBTN.click();
		//act.click(clickSignInBTN).build().perform();

	}
}
