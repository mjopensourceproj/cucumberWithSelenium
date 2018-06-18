package org.cucumberselenium.cucumberSelenium.gluecode;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {

	public static WebDriver driver;

	@Given("^User navigates to selenium hq page$")
	public void user_navigates_to_selenium_hq_page() throws Throwable {

		File directory = new File("");
		System.out.println("relative path: " + directory.getAbsolutePath() + File.separator + "chromedriver_win32");
		String chromeDirectory = directory.getAbsolutePath() + File.separator + "chromedriver_win32" + File.separator
				+ "chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", chromeDirectory);

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");

		Thread.sleep(3000);

	}

	@When("^User click on Download page$")
	public void user_click_on_Download_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement downloadButton = driver.findElement(By.xpath("//li[@id='menu_download']//a[@href='/download/']"));
		downloadButton.click();
		Thread.sleep(5000);
	}

	@When("^User navigates to Download page$")
	public void user_navigates_to_Download_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement downloadText = driver.findElement(By.xpath("//h2[contains(.,'Downloads')]"));
		downloadText.isDisplayed();
	}

	@When("^User navigates to Projects page$")
	public void user_navigates_to_Projects_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement projectText = driver.findElement(By.xpath("//h2[contains(.,'Projects')]"));
		projectText.isDisplayed();
	}

	@Then("^User verifies Download version$")
	public void user_verifies_Download_version() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement downloadVersion = driver.findElement(By.xpath("//p[contains(.,'Download version ')]"));
		downloadVersion.isDisplayed();

		driver.close();
		driver.quit();
	}

}
