import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
	driver.get("https://formy-project.herokuapp.com/autocomplete");
	
	WebElement  autocomplete= driver.findElement(By.id("autocomplete"));
	autocomplete.sendKeys("Sai");
	System.out.println("Test passed");
		driver.close();

	}

}
