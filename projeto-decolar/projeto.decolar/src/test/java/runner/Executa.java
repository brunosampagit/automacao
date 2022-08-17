package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "steps", tags = "@testepassagem", monochrome = true, dryRun = false, plugin = {
		"pretty", "html:target/cucumber-report.html" }, snippets = SnippetType.CAMELCASE)

public class Executa extends DriverFactory {

	public static void abrirNavegador() {
		String url = "https://www.decolar.com";
		boolean headless = false;

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		if (headless) {
			options.addArguments("--headless");
			options.addArguments("--disable-gpu");
			options.addArguments("--window-size=1400,800");
		}
		driver = new ChromeDriver(options);

		driver.get(url);
		driver.manage().window().maximize();

	}

	public static void fecharNavegador() {
		driver.quit();
	}

}
