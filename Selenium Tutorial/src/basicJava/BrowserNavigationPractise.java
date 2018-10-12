package basicJava;

import java.io.File;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNavigationPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C:\\Program Files (x86)\\Selenium\\WebDrivers\\ChromeDrivers\\2.35\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
	    WebDriver driver = new ChromeDriver(options);


		driver.get("https://intra.web.bc/IPTS/Pages_Request/Request.aspx");

		WebElement weReleaseDropdownButton = driver.findElement(By.id("ctl00_ContentPlaceHolder1_DropDownReleaseList_DropDownReleaseList_Button"));
		weReleaseDropdownButton.click();

		WebElement weuserlist = driver.findElement(By.id("ctl00_ContentPlaceHolder1_DropDownReleaseList_DropDownReleaseList_OptionList"));
	    java.util.List<WebElement> liReleases = weuserlist.findElements(By.tagName("li"));
	    Iterator<WebElement> itReleases = liReleases.iterator();
	    while (itReleases.hasNext()) {
			WebElement weRelease = itReleases.next();
			String strCurrentRelease = weRelease.getText();
			if (strCurrentRelease.equalsIgnoreCase("MONTHLY FLEX (22-MAR-2018)")) {
				weRelease.click();
				break;
			}

		}

	    WebElement weRadiobtn = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadioButtonRapid"));

	    driver.quit();




}
}