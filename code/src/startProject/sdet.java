package startProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class sdet {

	public static void main(String[] args) {
		
		// Initialize WebDriver
		WebDriver driver =new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
	    
		WebElement summaryElement = driver.findElement(By.xpath("//summary[text()='Table Data']"));
	    summaryElement.click();
		
	 // Locate the input text box and insert the provided data
	    WebElement inputTextBox = driver.findElement(By.xpath("//textarea[@id='jsondata']"));
	 // Clear the input text box
	    inputTextBox.clear();
	    inputTextBox.sendKeys("[{\"name\": \"Bob\", \"age\": 20, \"gender\": \"male\"}," +
                "{\"name\": \"George\", \"age\": 42, \"gender\": \"male\"}," +
                "{\"name\": \"Sara\", \"age\": 42, \"gender\": \"female\"}," +
                "{\"name\": \"Conor\", \"age\": 40, \"gender\": \"male\"}," +
                "{\"name\": \"Jennifer\", \"age\": 42, \"gender\": \"female\"}]");
	    

        // Locate and click the "Refresh Table" button
        WebElement refreshTableButton = driver.findElement(By.xpath("//button[@id='refreshtable']"));
        refreshTableButton.click();

        // Extract the table data
        WebElement table = driver.findElement(By.xpath("//table[@id='dynamictable']"));
        String tableData = table.getText();
        

        // Define the expected data
        String expectedData = "Dynamic Table\n" + 
                              "name age gender\n"+ 
        		              "Bob 20 male\n" +
                              "George 42 male\n" +
                              "Sara 42 female\n" +
                              "Conor 40 male\n" +
                              "Jennifer 42 female";

        // Assert that the data matches
        if (tableData.equals(expectedData)) {
            System.out.println("Data matches!");
        } else {
            System.out.println("Data does not match.");
        }

        //Close the browser window
        driver.close();
		

	}

}
