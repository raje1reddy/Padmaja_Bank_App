import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import static java.lang.Thread.sleep;
import java.util.concurrent.TimeUnit;

public class PadmajaSeleniumTest1 {
    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        // System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        //WebDriver driver=new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/");
        WebElement element = driver.findElement(By.xpath("//input[@name='emailid']"));
        //type email-id
        element.sendKeys("123@test.com");
        //click submit button
        WebElement button = driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();

        //Read Used ID : creted
        String user_id = driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[4]/td[2]")).getText();
        //Read Password Created
        String password = driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[5]/td[2]")).getText();


        // Clink on the bank project link
        WebElement bankButton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[5]/a[1]"));
        bankButton.click();

        // Enter User id
        WebElement userid = driver.findElement(By.xpath("//input[@name='uid']"));
        userid.sendKeys(user_id);
        // Enter Password
        WebElement pass_word = driver.findElement(By.xpath("//input[@name='password']"));
        pass_word.sendKeys(password);
        // Click Entere to inside bank app
        WebElement loginButtons = driver.findElement(By.xpath("//input[@name='btnLogin']"));
        loginButtons.click();
        //driver.close();

        //Select  New Customer option
        WebElement newCustomer = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/ul[1]/li[2]/a[1]"));
        newCustomer.click();

        //Add New Customer - Name

        WebElement elementName = driver.findElement(By.xpath("//input[@name='name']"));
        //type customer name
        elementName.sendKeys("Padmaja");
        WebElement femaleRadioBtn = driver.findElement(By.xpath("//tr[5]//td[2]//input[2]"));
        femaleRadioBtn.click();
        //driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[2]/input[1]"))


        //select date of birth ---------------------------------------------------
        WebElement dateSelection = driver.findElement(By.xpath("//input[@id='dob']"));
        dateSelection.click();
        dateSelection.sendKeys("1981");
        //Actions action = new Actions(driver);

         //Enter the Address
        WebElement addressName = driver.findElement(By.xpath("//textarea[@name='addr']"));

        //driver.findElement(By.xpath("//textarea[@name='addr']"))
        //addressName.click();
        addressName.sendKeys("No.4 ,DagnallPark");

        //Enter the city
        WebElement cityName = driver.findElement(By.xpath("//input[@name='city']"));
        cityName.sendKeys("London");

        //Enter the state
        WebElement stateName =driver.findElement(By.xpath("//input[@name='state']"));
        stateName.sendKeys("UnitedKingdom");

        //Enter the pincode
        WebElement pinCode = driver.findElement(By.xpath("//input[@name='pinno']"));
        pinCode.sendKeys("517002");

        //Enter the Telephone No.
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='telephoneno']"));
        phoneNumber.sendKeys("9717493546");

        //Enter the email id
        WebElement emailID = driver.findElement(By.xpath("//input[@name='emailid']"));
        emailID.sendKeys("askforpadmaja@gmail.com");

        //Select submit button
        WebElement submitButton = driver.findElement(By.xpath("//input[@name='sub']"));
        submitButton.click();

        WebElement daySelection = driver.findElement(By.xpath("//input[@id='dob']"));
        //Select submit button
        WebElement submittButton = driver.findElement(By.xpath("//input[@name='sub']"));
        submittButton.click();
        Actions action = new Actions(driver);
        WebElement monthSelection = driver.findElement(By.xpath("//input[@id='dob']"));
        //monthSelection.click();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
       // monthSelection.sendKeys("14");
        action.sendKeys(Keys.ARROW_RIGHT).build().perform();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 10000000);
       // Thread.sleep(5000);
        //Actions action = new Actions(driver);
        //action.sendKeys(Keys.ARROW_RIGHT).build().perform();

        WebElement dayySelection = driver.findElement(By.xpath("//input[@id='dob']"));
     //   //daySelection.click();
     daySelection.sendKeys("08")
;        //Select submit button
        WebElement submitttButton = driver.findElement(By.xpath("//input[@name='sub']"));
        submitttButton.click();

        WebDriverWait waitt = new WebDriverWait(driver, 10000000);

    }
}