import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\91971\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		System.setProperty("webdiver.gecko.driver", "C:\\Users\\91971\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver ();
		
		//opening  website in Chrome
		driver.get("https://in.linkedin.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();	
		
		// opening website in FF
		driver1.get("https://in.linkedin.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver1.close();		
	}

}
