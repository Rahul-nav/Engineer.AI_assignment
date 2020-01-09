import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://staging.engineer.ai/home");
		driver.findElement(By.xpath("//div[@class='currencySelBox']/div[7]")).click();
		driver.findElement(By.xpath("//button[Contains(Text(), ' Sign In ')]"));
		//driver.findElement(By.xpath("//strong[Contains(Text(), ' Register ')]"));
		driver.findElement(By.xpath("//div[@class='user-txt'][contains(text(),' Don’t have an account? ']")).click();

		driver.findElement(By.name("signup_email")).sendKeys("abc@yopmail.com");
		driver.findElement(By.xpath("//button[contains(text(), 'Next']")).click();

		driver.findElement(By.name("firstlastname")).sendKeys("gfdghhfg");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("324243435");

		driver.findElement(By.name("organisationName")).sendKeys("Navyug");
		driver.findElement(By.name("signup_password")).sendKeys("New1life");

		driver.findElement(By.xpath("@id='businesspurposes')/label")).click();
		driver.findElement(By.className("submitButton")).click();

		driver.findElement(By.className("doneButton")).click();
		String username=driver.findElement(By.xpath("//div[@class='userPanel']/h3/strong")).getText();
		
		
		
	}
}
