package com.inetbanking.uilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./configuration/config.properties");
		
		try 
		{
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("bURL");
		return url;
	}
	public String getUserName()
	{
		String username=pro.getProperty("UName");
		return username;
	}
	public String getUserPasseord()
	{
		String password=pro.getProperty("password");
		return password;
	}
	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getIEPath()
	{
		String iepath=pro.getProperty("edpath");
		return iepath;
	}
	public String getFirefoxPath()
	{
		String geckopath=pro.getProperty("geckopath");
		return geckopath;
	}
}
