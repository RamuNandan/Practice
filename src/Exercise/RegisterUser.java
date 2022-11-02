package Exercise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RegisterUser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramun\\Selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoga.com/register"); 
		Thread.sleep(5000);
      
		Alert user=driver.switchTo().alert();
		user.sendKeys("ramunandan0426@gmail.com ");
		user.accept();
	}

}
