package com.test.stepdefinition;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	WebDriver driver;// = new ChromeDriver();

	@Given("^I have URL$")
	public void i_have_URL() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMRITA\\eclipse-workspace\\TestCase\\EggTimerTestCase\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@When("^Enter URL on browser$")
	public void enter_URL_on_browser() throws Exception {

		driver.get("http://e.ggtimer.com/");

	}

	@Then("^Default value on select box is displayed$")
	public void default_value_on_select_box_is_displayed() throws Exception {

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		WebElement element = driver.findElement(By.id("start_a_timer"));
		String elementval = element.getAttribute("value");
		// driver.
		if (elementval.equalsIgnoreCase("5 minutes")) {
			System.out.println("Page is loaded completely");
		}
		driver.close();

	}

	@Given("^Enter URL$")
	public void enter_URL() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AMRITA\\eclipse-workspace\\TestCase\\EggTimerTestCase\\src\\test\\resources\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://e.ggtimer.com/");

	}

	@When("^Remove default value and When enter (\\d+) second and click go$")
	public void remove_default_value_and_When_enter_second_and_click_go(int arg1) throws Exception {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement SelectBox = driver.findElement(By.id("start_a_timer"));
		SelectBox.clear();
		SelectBox.sendKeys("25 seconds");
		WebElement Button = driver.findElement(By.id("timergo"));
		Button.click();

	}

	@Then("^Timer start with decrement$")
	public void timer_start_with_decrement() throws Exception {
		WebElement listOfOptions = driver.findElement(By.xpath(".//*[@id='progressText']"));
		Set<Integer> decreArr = new TreeSet();
		Boolean loopFlag = Boolean.TRUE;
		while (loopFlag) {

			String str = listOfOptions.getText();
			decreArr.add(Integer.valueOf(str.split(" ")[0]));
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			if (str.equals("1 second"))
				loopFlag = false;
		}
		
		System.out.println(decreArr);
		driver.close();

	}
}