package basicJava;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class webDriverBrowserCommandPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File chromedriver = new File("C:\\Program Files (x86)\\Selenium\\WebDrivers\\IEDrivers\\3.8\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", chromedriver.getAbsolutePath());
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://store.demoqa.com/");
		driver.manage().window().maximize();
		driver.close();
	}

}
