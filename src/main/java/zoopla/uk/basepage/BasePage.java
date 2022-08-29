package zoopla.uk.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public static Logger logger;
	public static Properties prop;
	public static WebDriver driver;

	public BasePage() {
		logger = Logger.getLogger("QA Lead Faisal");
		PropertyConfigurator.configure("log4j.properties");

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("./src/main/java/config/Config.properties");
			// System.getProperty("user.dir") + "/src/main/java/config/Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void initializations() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	System.out.println(prop.getProperty("URL"));
	}
	
	
	

	public  void startAutomations() {
/*		String browserName = prop.getProperty("browser");	
		if (browserName.equalsIgnoreCase("chrome")) {*/
			logger.info("******** I am a chrome browser*********");
			//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();

/*		} else if (browserName.equalsIgnoreCase("edge")) {
			logger.info("******** I am a edge browser*********");
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			 driver = new EdgeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.geckodriver.driver", "/Drivers/geckodriver.exe");
			 driver = new FirefoxDriver();
		}*/

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //

	}

	}
