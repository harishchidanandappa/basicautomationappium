package testingapp;
import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

        public static           AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
        //chrome
                //app(apk), device 4723,
                //commands
                //Android driver

                AndroidDriver<AndroidElement> driver;

                DesiredCapabilities cap = new DesiredCapabilities();

                File appDir = new File("src");
                File app = new File(appDir, "ApiDemos-debug.apk");


                cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Harish_device");

                cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step
            capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");

                cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
                driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

                return driver;


        }

}
