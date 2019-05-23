package com.qa.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.jasper.tagplugins.jstl.core.Catch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.DeleteAllVisibleCookies;

public class TestBase {
	
	static WebDriver driver;
	 static Properties prop;
	 
	 
	 
	 
	public void TestBase() throws IOException {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}Catch(IOException e){
			e.printStackTrace
			
		}
		
		
		
	/* driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.getCurrentUrl();*/
		
		
		
		
		
		
		
		
		
		
		
		
	}
	


}
