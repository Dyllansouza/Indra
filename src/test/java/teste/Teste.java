package teste;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import core.BasePage;
import core.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Teste {
	BasePage bp = new BasePage();

	@Given("^testeRipley - Acessar a tela inicial$")
	public void acessarPaginaInicial() {
		bp.abrirPage("https://www.bancoripley.com.pe/");

	}

	@When("^TesteRipley - Clicar no link A$")
	public void realizarBusca() throws InterruptedException {

		WebElement we = DriverFactory.getDriver().findElement(By.id("m_creditos"));
		WebElement wd = DriverFactory.getDriver().findElement(By.id("MMMenu0805194703_0_Item_0"));

		String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);}else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		Thread.sleep(2000);
		((JavascriptExecutor) DriverFactory.getDriver()).executeScript(mouseOverScript, we);
		Thread.sleep(1000);
		((JavascriptExecutor) DriverFactory.getDriver()).executeScript(mouseOverScript, wd);
		Thread.sleep(1000);
		((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();", we);

	}

	@When("^testeRipley - Clicar no link B$")
	public void escolherCarro() throws InterruptedException {
	}

	@When("^testeRipley - Clicar no link C$")
	public void escolherSeguroDeCarro() throws InterruptedException {
	}

	@When("testeRipley - Clicar no link D$")
	public void escolherMarca() throws InterruptedException {
	}

	@When("^testeRipley - Clicar no link E$")
	public void escolherModelo() {

	}

	@When("^testeRipley - Clicar no link F$")
	public void escolherModelo2() {

	}

}
