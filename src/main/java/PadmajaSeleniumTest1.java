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
        WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
        //type email-id
        element.sendKeys("123@test.com");
        //click submit button
        WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
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

        //Add New Customer



    }
}