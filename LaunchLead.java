package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchLead {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/control/main");
String pageTitle = driver.getTitle();
System.out.println("Title is" + pageTitle); 
WebElement userName = driver.findElement(By.id("username"));
userName.sendKeys("demosalesmanager");
WebElement password = driver.findElement(By.id("password"));
password.sendKeys("crmsfa");
WebElement login = driver.findElement(By.className("decorativeSubmit"));
login.click();
WebElement crmSfa = driver.findElement(By.linkText("CRM/SFA"));
crmSfa.click();
WebElement clickLeads = driver.findElement(By.linkText("Leads"));
clickLeads.click();
WebElement createLeads = driver.findElement(By.linkText("Create Lead"));
createLeads.click();
WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
companyName.sendKeys("IBM India Pvt ltd");
WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
firstName.sendKeys("Jennifer");
WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
lastName.sendKeys("Aniston");
WebElement firstLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
firstLocal.sendKeys("Jenni");
WebElement lastLocal = driver.findElement(By.id("createLeadForm_lastNameLocal"));
lastLocal.sendKeys("Aniston");
WebElement salutation = driver.findElement(By.id("createLeadForm_personalTitle"));
salutation.sendKeys("Miss");
WebElement birthDate = driver.findElement(By.id("createLeadForm_birthDate"));
birthDate.sendKeys("9/1/97");
driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("64");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("3000000");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jenniferaniston@gmail.com");
WebElement createLead = driver.findElement(By.className("smallSubmit"));

createLead.click();
}
	
}
