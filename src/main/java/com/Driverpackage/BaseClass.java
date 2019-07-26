package com.Driverpackage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
    public static String path;
    
    public static Properties prop;
    
    public BaseClass()
    {
    	try{
    		
    		FileInputStream ip= new FileInputStream("G:\\javademo\\com.pomexample\\src\\main\\java\\PropertiesPackage\\Configration.properties");
    		prop=new Properties();
    		prop.load(ip);
    		
    		
    	}
    	catch(Exception e)
    	{
    		System.out.print(e.getMessage());
    		
    	}
    }
    
    public static void initialize()
    {
    	String browsername=prop.getProperty("browser");
    	if(browsername.equalsIgnoreCase("chrome"))
    	{
    		System.setProperty(prop.getProperty("systemproperty_1"),prop.getProperty("driverpath"));
    		driver = new ChromeDriver();
    		
    	}
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
    	driver.get(prop.getProperty("Url"));
    	
    	
    }
    

}
