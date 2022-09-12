package genericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
public WebDriver driver;
public PropertFile pdata=new PropertFile();
public WebDriverUtilites Utilities=new WebDriverUtilites();

@BeforeMethod
public void openApp() throws IOException
{
	WebDriverManager.chromedriver().setup();
     driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get(pdata.getPropertdata("url"));
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@AfterMethod
public void closeApp(ITestResult res) throws IOException
{
	int status=res.getStatus();
	String name=res.getName();
	if(status==2)
	{
		Photo p=new Photo();
		p.getPhoto(driver, name);
	}
	
	driver.quit();
}
}


