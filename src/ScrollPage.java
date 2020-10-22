import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollPage {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		 
    WebDriver driver=new ChromeDriver();
	driver.get("https://formy-project.herokuapp.com/scroll");
	
	WebElement name= driver.findElement(By.id("name"));
	Actions actions=new Actions(driver);
    actions.moveToElement(name);
    name.sendKeys("Sai");
    System.out.println("First Test passed");
    WebElement date=driver.findElement(By.id("date"));
    date.sendKeys("22/10/2020");

    System.out.println("Second Test passed");
		driver.close();

	}

}
