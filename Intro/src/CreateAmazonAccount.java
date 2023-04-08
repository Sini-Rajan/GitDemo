import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAmazonAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdiver.chrome.driver", "C:\\Users\\91971\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("nav-link-accountList")).click();
	System.out.println(driver.getTitle());
	//System.out.println(driver.findElement(By.cssSelector("ap_email")).getText());	
	driver.findElement(By.id("createAccountSubmit")).click();
	driver.findElement(By.id("ap_customer_name")).sendKeys("Sini Rajan");
	driver.findElement(By.id("ap_phone_number")).sendKeys("9711669303");
	driver.findElement(By.id("ap_email")).sendKeys("sini456@gmail.com");
	driver.findElement(By.id("ap_password")).sendKeys("Sini@1234");
	driver.findElement(By.className("a-button-input")).click();
	}

}
