package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By cookies = By.xpath("//em[text()='Entendi']");
	public By origem = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/input");
	public By destino = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div/div[3]/div[1]/div[1]/div[1]/div/div[2]/div/div/input");
	public By data = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div/div[3]/div[1]/div[1]/div[2]/div/div[1]/div/div/div");
	public By soIda = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div/div[2]/div/div[2]/span/label/i");
//	public By dia = By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[1]/div[3]/div[22]");
	public By dia = By.cssSelector("div.sbox5-monthgrid-datenumber-number/22");
	
}
