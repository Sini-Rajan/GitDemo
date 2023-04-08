import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GmailLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdiver.gecko.driver", "C:\\Users\\91971\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.google.com/mail/");
		driver.findElement(By.id("identifierId")).sendKeys("mail2sinirajan@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		
		
		
		
		
	}

}
