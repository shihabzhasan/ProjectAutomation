import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Daya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\shihab.hasan\\Downloads\\Compressed\\New folder (4)\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();


driver.get("http://192.168.20.127/UltimusFinSolutionTest/UFS.Web/");
System.out.println(driver.getTitle());

System.out.println(driver.getCurrentUrl());
driver.findElement(By.id("UserId")).sendKeys("M1");

driver.findElement(By.id("PasswordString")).sendKeys("1");

driver.findElement(By.id("btnlogin")).click();

driver.findElement(By.id("imgLogOut")).click();
driver.findElement(By.xpath("span[normalize-space()='Yes']")).click();


		
		
	}

}
