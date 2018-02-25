package loginTestGIT;

import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGIT {
	public static void main(String[] args) throws ParseException {
    	WebDriver wd;
    	System.setProperty("webdriver.chrome.driver","C:\\selenium-java-3.8.1\\chromedriver.exe");
	  wd= new ChromeDriver();		//"wd" is "driverObject"
        wd.get("http://money.rediff.com/gainers/bsc/daily/groupa?");         
        //No.of Columns
        List<WebElement>  col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        //col is a list of columns by using "th" represent th[1], th[2], th[3],...
        
        System.out.println("No of cols are : " +col.size()); 
        //No.of rows 
        List<WebElement>  rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
        //rows is a list of rows by using "tr" rather than "tr[1]", which represent tr[1], tr[2], tr[3],...
        
        System.out.println("No of rows are : " + rows.size());
//        wd.close();
    }

}