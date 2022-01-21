package Essentials;


import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Hooks {

    private static boolean initialized = false;

    private WebDriver driver;


    @Before
    public   void driverInitialization(){
        if (!initialized) {
            WebDriverManager.operadriver().setup();
            driver= new OperaDriver();
            initialized = true;
        }

    }

    public  WebDriver getOperaDriver(){
        driverInitialization();
        return driver;
    }
    public   void driverQuit(){
        driver.quit();
    }



    }

