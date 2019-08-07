package com.factory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pageobjects.ShoppingListPage;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    public static AppiumDriver driver;

    public ShoppingListPage shoppingListPage;

    public void createDriver(){
        try {

            String APP = "/Users/ikatta/Documents/Framework/ZRBSTEST/shoppinglist-master/ShoppingList/build/outputs/apk/play/debug/org.openintents.shopping-2.2.0-play-debug.apk";

            //Constants.Report_File_Name = this.getClass().getSimpleName();
            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion","9.0");
            caps.setCapability("deviceName", "Android Emulator");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("app", APP);
            caps.setCapability("avd","Pixel_2_API_28");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);


            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
