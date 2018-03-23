package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Linear {

	public static void main(String[] args) throws Throwable {
		// open the browse
		System.setProperty("webdriver.chrome.driver","D:\\Selenium C07 sai\\Browser driver\\Google chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open application
		driver.get("http://adactin.com/HotelAppBuild2/");
		
		// User login
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("hemanth123");
		//Thread.sleep(10000);
		
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("hemanth123");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[6]/td[2]/input")).click();
		Thread.sleep(5000);
		
		// enter details to search hotel
		
		String x = driver.findElement(By.xpath("html/body/table[2]/tbody/tr[1]/td[2]/input")).getAttribute("value");
		System.out.println(x);
		Thread.sleep(5000);
		
		new Select(driver.findElement(By.id("location"))).selectByIndex(6);
		new Select(driver.findElement(By.id("hotels"))).selectByIndex(4);
		new Select(driver.findElement(By.id("room_type"))).selectByIndex(2);
		new Select(driver.findElement(By.id("room_nos"))).selectByIndex(2);
		
		driver.findElement(By.id("datepick_in")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("datepick_in")).sendKeys("16/03/2018");
		
		driver.findElement(By.id("datepick_out")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("datepick_out")).sendKeys("18/03/2018");
		
		new Select(driver.findElement(By.id("adult_room"))).selectByIndex(4);
		new Select(driver.findElement(By.id("child_room"))).selectByIndex(2);
		Thread.sleep(3000);

		driver.findElement(By.id("Submit")).click();
		
		driver.findElement(By.id("radiobutton_0")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("first_name")).sendKeys("Artham");
		driver.findElement(By.id("last_name")).sendKeys("SAInath");
		String y = driver.findElement(By.id("last_name")).getAttribute("value");
		System.out.println(y);
		driver.findElement(By.id("address")).sendKeys("Hyderabad");
		String z = driver.findElement(By.id("address")).getAttribute("value");
		System.out.println(z);
		driver.findElement(By.id("cc_num")).sendKeys("4688172013002589");
		new Select(driver.findElement(By.id("cc_type"))).selectByIndex(2);
		new Select(driver.findElement(By.id("cc_exp_month"))).selectByIndex(3);
		new Select(driver.findElement(By.id("cc_exp_year"))).selectByIndex(12);
		driver.findElement(By.id("cc_cvv")).sendKeys("567");
		Thread.sleep(5000);
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(10000);
		
		//print orderid
		String a = driver.findElement(By.id("order_no")).getAttribute("value");
		System.out.println("Order id is "+a);
		
		//log out
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();
		Thread.sleep(5000);
		
		//quit browser
		Thread.sleep(10000);
		driver.close();

	}

}
