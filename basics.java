package testingapp;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.*;

public class basics extends base {
        public static void main(String []args)throws MalformedURLException {
                //autogenerate method stub
                AndroidDriver <AndroidElement> driver = capabilities();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                //xpath(//tagname([@attribute="value"]), id classname, androidUIautomator


                driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
                driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
                driver.findElementByXPath("//android.widget.TextView[@text='Accessibility']").click();
                driver.findElementByXPath("//android.widget.TextView[@text='App']").click();
                driver.findElementByXPath("//android.widget.TextView[@text='Animation']").click();
                driver.findElementByXPath("//android.widget.TextView[@text='Graphics']").click();
                driver.findElementById("android:id/checkbox").click();
                driver.findElementByXPath("//android.widget.RelativeLayout)[2]").click();
                driver.findElementByClassName("android.widget.EditText").sendKeys("wifi-password");
                driver.findElementsByClassName("android.widget.Button").get(2).click();




        }

        }
