package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import drivers.DriverFactory;

public class MetodosDeTestes extends DriverFactory {
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}
	
	public void scroll(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+n1+","+n2+")");
	}
	
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

}
