
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class base2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/sksulia/Downloads//programs/chromedriver");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		
		//Test case 4. Verify that you can find computer by using filter


		//Open the sample application
		
		driver.get("http://computer-database.herokuapp.com/computers");
		
		//Search for the certain name of computers
		
		WebElement Searchbox;
		Searchbox = driver.findElement(By.id("searchbox"));
		Searchbox.sendKeys("Newtest");
		
		//Filter by name
		
		WebElement Filter;
		Filter = driver.findElement(By.id("searchsubmit"));
		Filter.click();
		
		//Verify that there is result on a page
		
		WebElement Results;

		Results = driver.findElement(By.xpath("//section[@id='main']/h1"));

		String Result = Results.getText();

		System.out.println(Result);
		
		//Test case 10. Verify that you can delete computer 
		
		//Pick one of computers from the filter result
		
		WebElement lastResult;
		lastResult = driver.findElement(By.xpath("//section[@id='main']/table/tbody/tr[3]/td[1]/a"));
		lastResult.click();
		
		//Delete this computer
		
		WebElement SubmitDelete;
		SubmitDelete = driver.findElement(By.xpath("//input[@class='btn danger']"));
		SubmitDelete.click();
		
		//Verify that computer was deleted and there is message presented
		
		
		

	}

}
