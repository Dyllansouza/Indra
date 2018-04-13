package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import core.Propriedades.Browsers;

public class DriverFactory {

	public static WebDriver driver;

	private DriverFactory() {
	}

	public static void navegador(Browsers param) {
		Propriedades.browser = Browsers.CHROME;
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			switch (Propriedades.browser) {
			case FIREFOX:
				driver = new FirefoxDriver();
				break;
			case CHROME:
				System.setProperty("webdriver.chrome.driver", "C:/Browser/Chrome/chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case EXPLORER:
				driver = new EdgeDriver();
				break;
			case SAFARI:
				driver = new SafariDriver();
				break;
			default:
				break;
			}
			driver.manage().window().maximize();
			return driver;
		}
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}