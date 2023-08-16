package com.inetbanking.testCases;
import com.inetbanking.uilities.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	public String bURL = readconfig.getApplicationURL();
	public String UName = readconfig.getUserName();
	public String password = readconfig.getUserPasseord();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browsers")
	@BeforeClass
	public void setUp(String br) throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		
		
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			ChromeOptions opt = new ChromeOptions();
			opt.addExtensions(new File("./extentions/adblock.crx"));
			
			driver = new ChromeDriver(opt);
			Thread.sleep(5000);
			
			String originalTabHandle = driver.getWindowHandle();
			Set<String> windowHandles = driver.getWindowHandles();
			for (String handle : windowHandles) {
	            if (!handle.equals(originalTabHandle)) {
	                driver.switchTo().window(handle);
	                break;
	            }
	        }

			
		}
		else if(br.equals("ed"))
		{
			System.setProperty("webdriver.edge.driver", readconfig.getIEPath());
			driver = new EdgeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
		}
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(bURL);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	public String randomString()
	{
		String generateString=RandomStringUtils.randomAlphabetic(8);
		return (generateString);
	}
	public static String randomNumber()
	{
		String generateString2=RandomStringUtils.randomNumeric(4);
		return (generateString2);
	}

}
