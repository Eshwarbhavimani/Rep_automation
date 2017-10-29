package com.appeium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Sampleprogram {
	static AndroidDriver  driver;
	public static void main(String args[]) throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("deviceName", "Redmi");
	//	capabilities.setCapability("appPackage", "com.xiaomi.providers.appindex");  //
		capabilities.setCapability("appPackage","com.android.camera");
		capabilities.setCapability("appActivity", "com.android.camera.Camera");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		Thread.sleep(4000);
		driver.findElement(By.id("com.android.camera:id/v6_shutter_button_internal")).click();
		
		driver.quit();
		
		
		
	}

}
