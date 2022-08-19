package steps;

import elementos.Elementos;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.MetodosDeTestes;
import runner.Executa;

public class TesteSiteDecolar {
	MetodosDeTestes metodos = new MetodosDeTestes();
	Elementos el = new Elementos();

	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();
	}

	@Given("que eu esteja no site")
	public void queEuEstejaNoSite() {
		metodos.clicar(el.cookies);
		metodos.clicar(el.soIda);
		metodos.escrever(el.origem, "São Paulo");
		metodos.escrever(el.destino, "Rio de Janeiro");
		metodos.clicar(el.data);
		metodos.clicar(el.dia);
	}

	@When("preencher os dados")
	public void preencherOsDados() {

	}

	@Then("valide a passagem")
	public void valideAPassagem() {

	}

}
