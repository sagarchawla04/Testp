import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoLogin {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.gecko.driver", "F:/FACS/Automation/geckodriver-v0.16.1-win64/geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://login.salesforce.com");
	System.out.println("Test Passed");
}
}