# basicautomationappium
# API demos - Automation project
## Tech stack:
- Java 8 ([Install docs](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html))
- Maven ([Install docs](http://maven.apache.org/install.html))
- Appium ([Install docs](https://appium.io/docs/en/about-appium/intro/#appium-concepts))
- download Node(https://nodejs.org/en/download/)
- JUnit (Will be installed automatically)
- Android studio(https://developer.android.com/studio?)

## Features (Important)
- Tests for Native Android API mobile application are written in Java using Appium.
- Notice that all features shown in the app are basic functionalities and it's stock app on Android OS versions from 8.0 and above.
- Tests could be run on emulators (Android SDK, Genymotion) or real devices.
- By default, tests Run on default host ```http://127.0.0.1:472(1-9)```. Tests also could be run on remote/local host by passing parameters ```host``` and ```port```

## Additional info
- To run tests with History on Android OS versions above 8.0, you could install the API-demos app version manually.
- after installing android studiio, through android-->tools-->bins-->SDK--> UIautomator to access UIautomator which helps in identifying the elements of the application easily.
- the emulator should be running and the appium client server should be running always before the launch of the test.
- the screenshot can be captured on UIautomator of the screen that is open in emulator inorder to get information about the elements of the application.



## How to set environment for running tests
Before executing tests there should be set next software:
- Android SDK and tools ([Install docs](https://developer.android.com/studio/index.html))
- install eclipse editor*(maven repository)
- Node.js with NPM ([Install docs](https://nodejs.org/en/download/))
- Appium server ([Install docs](https://appium.io/docs/en/about-appium/intro/#appium-concepts))



**[Important]**

All the paths for libraries should be added to ```PATH``` system environment variable and to ```~/.bash_profile``` (for Unix systems):
- ANDROID_HOME
- APPIUM_HOME
- NODE_HOME


#### Tests parameters

- ```host``` - optional parameter. By default, appium server will automatically start on ```http://127.0.0.1``` host. 
By passing value for this parameter host for tests could be changed.

- ```port``` - optional parameter. By default, appium server will automatically start on any available port in range (4721-4730). 
By passing value for this parameter port for tests could be changed.




```
Open terminal (Unix) or CMD prompt (MS Windows) and run following commands:
```bash
cd CLONED_PROJECT_DIR
git pull
```


## Run tests


```
mvn clean test
```
, if default ```id``` value is set in ```config.properties``` file
