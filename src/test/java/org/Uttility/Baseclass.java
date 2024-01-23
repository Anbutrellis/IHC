package org.Uttility;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;

	public static void Browerlauch(String browsername) {
		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			EdgeOptions e = new EdgeOptions();
			e.setAcceptInsecureCerts(true);
			driver = new EdgeDriver(e);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			break;
		}
	}

	public static void sendkeys(WebElement e, String data) {

		try {
			e.sendKeys(data);

		} catch (Exception e2) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value',' " + data + " ')", e);
			e2.printStackTrace();
		}

	}

	public static void click(WebElement e) {
		try {
			e.click();

		} catch (Exception e2) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", e);
			
		}

	}

	public static void Screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Screenshots\\" + name + ".png");
		FileUtils.copyFile(screenshotAs, f);
	}

	public static void windowshandle(int windowcount) {
		Set<String> Allid = driver.getWindowHandles();
		int count = 1;
		for (String Eachid : Allid) {
			if (count == windowcount) {
				driver.switchTo().window(Eachid);
			}
			count++;
		}
	}

	public static void selectption(String options, WebElement element, Object values) {
		Select s = new Select(element);
		switch (options) {
		case "byvalue":
			s.selectByValue((String) values);

			break;
		case "byindex":
			s.selectByIndex((int) values);

			break;
		case "bytext":
			s.selectByVisibleText((String) values);

			break;
		}
	}

	public static void gettext(WebElement e) {
		String text = e.getText();

	}

	public static void url(String Url) {
		driver.get(Url);

	}

	public static void BrowersQuit() {
		driver.quit();

	}

	public static void refresh() {
		driver.navigate().refresh();

	}

	public static void forward() {
		driver.navigate().forward();

	}

	public static void backward() {
		driver.navigate().back();

	}
	public static String geturl() {
		return driver.getTitle();

	}

}
