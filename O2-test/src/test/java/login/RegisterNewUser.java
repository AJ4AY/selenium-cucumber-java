package login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.security.Key;
import java.util.concurrent.TimeUnit;

/**
 * Created by ajayk on 21/10/2015.
 */
public class RegisterNewUser {

    public static WebDriver driver;
    public static String base_url="http://www.o2.co.uk/";
       private String code="123A";



//    Constructor-to create instance
    public RegisterNewUser(){
        driver=new FirefoxDriver();
    }

//    waits for element to present
    public void waitForElement(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

// open the browser, enter the url
      public static void getUrl(){
        driver.get(base_url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

//clicks on registed button to register user
    public void clickRegisterButton(){
        driver.navigate().refresh();
        waitForElement();
        driver.findElement(By.cssSelector("a.registerLink")).click();
    }

//    /enters mobile number in text area
    public void enterMobileNumber(){
      waitForElement();
        driver.findElement(By.cssSelector("#msisdn")).sendKeys("07965567654");
    }


    public void clickSendMeTheCodeButton(){
        driver.findElement(By.cssSelector("#sendOTAC")).click();
    }


    public void enterCode() {
        waitForElement();
        driver.findElement(By.cssSelector("#otac")).sendKeys(code);
    }

    public void clickContinue(){
        driver.findElement(By.cssSelector("#continue")).sendKeys(Keys.ENTER);
    }
//get the text from given web element and verify
    public void verifyErrorMessage(){
        System.out.println(driver.findElement(By.cssSelector("#accountsError")).getText());
        driver.findElement(By.cssSelector("#accountsError")).getText().contentEquals("The verification code entered wasn't correct");

    }


    // main method
    public static void main(String args[]) throws InterruptedException {
        RegisterNewUser registerNewUser= new RegisterNewUser();
            getUrl();
        registerNewUser.clickRegisterButton();
        registerNewUser.enterMobileNumber();
        registerNewUser.clickSendMeTheCodeButton();
        registerNewUser.enterCode();
        registerNewUser.clickContinue();
        registerNewUser.verifyErrorMessage();
    }




}
