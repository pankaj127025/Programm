package numeric;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class td {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
 				"C:\\Users\\Pankaj\\Downloads\\selenium 4.1.3\\chromedriver.exe");
 		
 		WebDriver driver =  new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://vctcpune.com/selenium/practice.html");
 	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 		
 	    //table columns
 	   List<WebElement> column = driver.findElements(By.xpath("//table//tbody//tr//th"));
	   System.out.println("number of columns-"+column.size());
        
	   for(int i=0; i<column.size(); i++)
	   {
		   System.out.println(column.get(i).getText());  
	   }

//	   //table data-cells wise
//	List<WebElement> cellData =  driver.findElements(By.xpath("//table//tbody//tr//td"));
// 	System.out.println("Total data cells-"+cellData.size()); 
// 	
// 	for(int i = 0; i<cellData.size(); i++)
// 	{
// 		System.out.println(cellData.get(i).getText());
// 	}

	}

}
