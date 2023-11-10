package startProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sellintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoking browser
		
		//ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/");
		System.out.println("Title ="+ driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit();

	}

}
