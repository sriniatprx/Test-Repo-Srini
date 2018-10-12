package basicJava;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Wait;

public class webDriverBrowserCommandPractice1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		File file = new File("C:\\Program Files (x86)\\Selenium\\WebDrivers\\IEDrivers\\3.8\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://store.demoqa.com/");
		
		//*[@id="account"]/a/span[1]
		//*[@id="account"]/a/text()


		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

//		WebElement WeMyAccount = driver.findElement(By.className("icon"));
//		Boolean bWebelementDisplayed = WeMyAccount.isDisplayed();
//
//		while (bWebelementDisplayed==true) {
//			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		}


		String strPageTitle = driver.getTitle();
		System.out.println("Page title is:"+strPageTitle);
		int iTitleLength = strPageTitle.length();
		System.out.println("Page title length is:"+ iTitleLength);
		String strExpectedURL = "http://store.demoqa.com/";
		String strActualURL = driver.getCurrentUrl();
		System.out.println("Actual url is:"+ strActualURL);
		if (strActualURL==strExpectedURL) {
			System.out.println("The opened Web Page is as expected");
		}
		else {
			System.out.println("In correct Web Page opened");
		}

		String strPageSource= driver.getPageSource();
		int iPageSourceLength = strPageSource.length();

		System.out.println("the Page source is:" + strPageSource);
		System.out.println("The length of the page source is:"+ iPageSourceLength);

//		driver.close();
	}

}
