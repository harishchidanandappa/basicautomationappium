package testingapp;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.tapOptions;



public class UIautomator extends base {

        public static void main(String []args)throws MalformedURLException {

                AndroidDriver<AndroidElement> driver = capabilities();
                driver.manage().timeouts().implicitlyWait(10, null)

                driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

                driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();

                driver.findElementByXpath("//android.widget.TextView[@text="Views"]").click();

                //tapping

                TouchActions t = new TouchActions(driver);

                Web element expandList = driver.findElementByXPath("//android.widget.TextView[@text="Expandable"]").click();
                t.tap(tapOptions().withElement(element(expandList))).perform();

        }

}
