package basicJava;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		File iEDriverFile = new File("C:\\Program Files (x86)\\Selenium\\WebDrivers\\IEDrivers\\3.8\\IEDriverServer.exe");

		System.setProperty("webdriver.ie.driver", iEDriverFile.getAbsolutePath());

		WebDriver driver = new InternetExplorerDriver();

		driver.get("https://www.google.be");

		System.out.println("Successfully opened google search page");

		Thread.sleep(5);

		driver.quit();



	}

}
