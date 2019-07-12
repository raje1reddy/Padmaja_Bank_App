import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class PadmajaSeleniumTest1 {
    public static void main(String[] args){
        //System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver-v0.24.0-win64\\geckodriver.exe");
       // System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        //WebDriver driver=new FirefoxDriver();
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/");
//        WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
//        element.sendKeys("abc@gmail.com");
//        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
//        WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
//        button.click();
        //driver.findElement(By.xpath("//input[@name='emailid']"))
        //input[@name='emailid']
        ///Access details to demo site.
        //User ID :	mngr26593
        //driver.findElement(By.xpath("//td[contains(text(),'mngr209206')]"))
        //Password :	abc@123

        //Got to this page -> "http://demo.guru99.com/"
        // Clink on the bank project link
        WebElement bankButton = driver.findElement(By.xpath("//a[contains(text(),'Bank Project')]"));
        bankButton.click();
        // Enter User id
        WebElement userid = driver.findElement(By.xpath("//input[@name='uid']"));
        userid.sendKeys("mngr26593");
        // Enter Password
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("abc@123");
        // Click Entere to inside bank app
        WebElement loginButtons = driver.findElement(By.xpath("//input[@name='btnLogin']"));
        loginButtons.click();
        //driver.close();

        //Add New Customer



    }
}