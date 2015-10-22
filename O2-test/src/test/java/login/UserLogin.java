package login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by AjjuBujji on 22/10/2015.
 */
public class UserLogin {

    private static WebDriver driver;
    private static String base_url="http://www.o2.co.uk/";
    private String user_name="selenium";
    private String pswd="1234";
    private String error_message="The information you provided does not match our records";

//    Constants
    private static final String sign_link_css="a.signInLink";
    private static final String user_name_css="#username";
    private static final String password_css ="#password";
    private static final String sign_in_button_css="#signInButton";
    private static final String error_message_css="#accountsError";


    public UserLogin(){
        driver=new FirefoxDriver();
    }


    // open the browser, enter the url
    public static void getUrl(){
        driver.get(base_url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }


    //    waits for element to present
    public void waitForElement(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


    private void clickSignInLink(){
        waitForElement();
        driver.findElement(By.cssSelector(sign_link_css)).click();
        System.out.println("user clicks on sign in link");
    }

    public void enterUserCredentials(){
        waitForElement();
        driver.findElement(By.cssSelector(user_name_css)).clear();
        driver.findElement(By.cssSelector(user_name_css)).sendKeys(user_name);

        driver.findElement(By.cssSelector(password_css)).clear();
        driver.findElement(By.cssSelector(password_css)).sendKeys(pswd);
    }

    public void clickSignInButton(){
        driver.findElement(By.cssSelector(sign_in_button_css)).sendKeys(Keys.ENTER);
    }

    private void verifyErrorMessage(){
        waitForElement();
        String ERROR_MESSAGE=driver.findElement(By.cssSelector(error_message_css)).getText();
        System.out.println(ERROR_MESSAGE);
        ERROR_MESSAGE.contentEquals(error_message);
    }

    private static void closeDriver(){
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
        System.out.println("Instance is Closed Now");
    }

    public static void main(String args[]){
        UserLogin userLogin=new UserLogin();
        getUrl();
        userLogin.clickSignInLink();
        userLogin.enterUserCredentials();
        userLogin.clickSignInButton();
        userLogin.verifyErrorMessage();
        closeDriver();
    }
}
