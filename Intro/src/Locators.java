import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\91971\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://in.linkedin.com/");
		driver.findElement(By.id("session_key")).sendKeys("mail2sinirajan@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("Mine$188");
		driver.findElement(By.className("sign-in-form__submit-button")).click();
		//driver.findElement(By.cssSelector(input[placeholder='Sign In']))
	}

}
