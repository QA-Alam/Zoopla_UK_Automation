package automation.challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Iterator;
import java.util.Set;

public class multipleWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");

		driver.findElement(By.id("windowButton")).click();
		// How to handle multiple windows?

		// I take control of main window with getwindowhandle method, store in string
		// variable
		String mainwindow = driver.getWindowHandle();
		// with the Set interface create object, then we take control of child window
		// with get
		// windowhandles method
		Set<String> s1 = driver.getWindowHandles();
		// take control of window one by one with iterator
		Iterator<String> i1 = s1.iterator();
		// First I create while loop and inside i have to call the object and hasnext
		// method
		// then I have to ignore the main window
		while (i1.hasNext()) {
			// then count the number of window
			String ChildWindow = i1.next();
			// then I put the condition main window not equal, take the control of child
			// window
			if (!mainwindow.equalsIgnoreCase(ChildWindow)) {
				// then I have to switch to child window with driver.switchto method
				driver.switchTo().window(ChildWindow);
				// WebElement text = driver.findElement(By.id("sampleHeading"));
				// System.out.println("Heading of child window is " + text.getText());

				// Then I close the child window
				driver.close();
				System.out.println("Child window closed");
			}
		}
		// Switch back to the main window which is the parent window.
		driver.switchTo().window(mainwindow);
		// driver.quit();

	}
}