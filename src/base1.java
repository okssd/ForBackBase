
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class base1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/sksulia/Downloads//programs/chromedriver");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		
		//Test case 2. Verify that you can add new computer 


		//Open the sample application
		
		driver.get("http://computer-database.herokuapp.com/computers");
		
		//adding new computer 
		
		WebElement NewComputer;
		NewComputer=driver.findElement(By.id("add"));
		NewComputer.click();
		
		//fill out some fields (add computer name)
		
		// Computer name
		WebElement ComputerName;
		ComputerName = driver.findElement(By.id("name"));
		ComputerName.sendKeys("NewTest");
		
		//Company name
		WebElement CompanyName;
		CompanyName = driver.findElement(By.xpath("//select[@id ='company']/option[15]"));
		CompanyName.click();
		
		//Submit
		
		WebElement SubmitButton;
		SubmitButton = driver.findElement(By.xpath("//input[@type ='submit']"));
		SubmitButton.click();
		
		//Verify if there is Done message displayed
		
		WebElement AlertMessage;
		AlertMessage = driver.findElement(By.xpath("//div[@class='alert-message warning']"));
		
		String AlertmessageWorning = AlertMessage.getText();

		if (AlertMessage.isDisplayed() == true) {
			System.out.println("message is displayed");
			System.out.println("the message is: " + AlertmessageWorning);
		} else
			System.out.println("message is not displayed");



	}

}
