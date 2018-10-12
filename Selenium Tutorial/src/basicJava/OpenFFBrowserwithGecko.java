package basicJava;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFFBrowserwithGecko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File geckodriver = new File("C:\\\\Users\\id844074\\OneDrive - Proximus\\srini\\generals\\Learns\\Selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", geckodriver.getAbsolutePath());
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");

	}

}
