import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://keralaayurveda.biz/account/login");
		
		driver.findElement(By.cssSelector("input[id=\"input-template--23629757514041__main--customeremail\"]")).sendKeys("harrshini.mn@gmail.com");
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("345678");
		driver.findElement(By.xpath("/html/body/main/section/div/div/div/account-login/div[1]/div/div/form/button")).click();
		

	}

}
