package myAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class startingAutomation {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(4000, TimeUnit.SECONDS);

driver.get("https://google.com");

try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.close();

//eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NDM3NDc5YTY1Y2E0YzAwMTM5YjkzMDEiLCJpYXQiOjE2ODM0OTUyNDh9.TtbOgfum5pUKR9h1nRWRvahTlb3RnVfu57a2uz94hS0

 
	}

}
