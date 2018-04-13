package core;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	/********************* PROCURAR ********************/
		
 		public void acao(String xpath){
			Actions action = new Actions(DriverFactory.getDriver());
			WebElement we = DriverFactory.getDriver().findElement(By.xpath(xpath));
			action.moveToElement(we).moveToElement(DriverFactory.getDriver().findElement(By.xpath(xpath))).click().build().perform();
		} 

	
	
	public void abrirPage(String elemento) {
		DriverFactory.getDriver().get(elemento);
		
	}
	
	public void procurarElementoPorId(String elemento) {
		DriverFactory.getDriver().findElement(By.id(elemento));
	}

	public void procurarElementoPorClassName(String elemento) {
		DriverFactory.getDriver().findElement(By.className(elemento));
	}

	public void procurarElementoPorXpath(String elemento) {
		DriverFactory.getDriver().findElement(By.xpath(elemento));
	}

	public void procurarElementoPorName(String elemento) {
		DriverFactory.getDriver().findElement(By.name(elemento));
	}

	public void procurarElementoPorTagName(String elemento) {
		DriverFactory.getDriver().findElement(By.tagName(elemento));
	}

	public void procurarElementoPorCssSelector(String elemento) {
		DriverFactory.getDriver().findElement(By.cssSelector(elemento));
	}

	public void procurarElementoPorLinkText(String elemento) {
		DriverFactory.getDriver().findElement(By.linkText(elemento));
	}

	public void procurarElementoPorPartialLink(String elemento) {
		DriverFactory.getDriver().findElement(By.partialLinkText(elemento));
	}

	/********************* PROCURAR *********************/

	/********************* ESCREVER ********************/
	public void escreverPorId(String elemento, String elemento2) {
		DriverFactory.getDriver().findElement(By.id(elemento)).click();
		DriverFactory.getDriver().findElement(By.id(elemento)).clear();
		DriverFactory.getDriver().findElement(By.id(elemento)).sendKeys(elemento2);
	}

	public void escreverPorClassName(String elemento, String elemento2) {
		DriverFactory.getDriver().findElement(By.className(elemento)).clear();
		DriverFactory.getDriver().findElement(By.className(elemento)).sendKeys(elemento2);
	}

	public void escreverPorXpath(String elemento, String elemento2) {
		DriverFactory.getDriver().findElement(By.xpath(elemento)).clear();
		DriverFactory.getDriver().findElement(By.xpath(elemento)).sendKeys(elemento2);
	}

	public void escreverPorName(String elemento, String elemento2) {
		DriverFactory.getDriver().findElement(By.name(elemento)).clear();
		DriverFactory.getDriver().findElement(By.name(elemento)).sendKeys(elemento2);
	}

	public void escreverPorTagName(String elemento, String elemento2) {
		DriverFactory.getDriver().findElement(By.tagName(elemento)).clear();
		DriverFactory.getDriver().findElement(By.tagName(elemento)).sendKeys(elemento2);
	}

	public void escreverPorCssSelector(String elemento, String elemento2) {
		DriverFactory.getDriver().findElement(By.cssSelector(elemento)).clear();
		DriverFactory.getDriver().findElement(By.cssSelector(elemento)).sendKeys(elemento2);
	}

	public void escreverPorLinkText(String elemento, String elemento2) {
		DriverFactory.getDriver().findElement(By.linkText(elemento)).clear();
		DriverFactory.getDriver().findElement(By.linkText(elemento)).sendKeys(elemento2);
	}

	public void escreverPorPartialLink(String elemento, String elemento2) {
		DriverFactory.getDriver().findElement(By.partialLinkText(elemento)).clear();
		DriverFactory.getDriver().findElement(By.partialLinkText(elemento)).sendKeys(elemento2);
	}

	/********************* ESCREVER *********************/

	/********************* CLICAR *********************/
	public void clicarElementoPorId(String elemento) {
		DriverFactory.getDriver().findElement(By.id(elemento)).click();
	}

	public void clicarElementoPorClassName(String elemento) {
		DriverFactory.getDriver().findElement(By.className(elemento)).click();
	}

	public void clicarElementoPorCssSelector(String elemento) {
		DriverFactory.getDriver().findElement(By.cssSelector(elemento)).click();
	}

	public void clicarElementoPorLinkText(String elemento) {
		DriverFactory.getDriver().findElement(By.linkText(elemento)).click();
	}

	public void clicarElementoPorName(String elemento) {
		DriverFactory.getDriver().findElement(By.name(elemento)).click();
	}

	public void clicarElementoPorXpath(String elemento) {
		DriverFactory.getDriver().findElement(By.xpath(elemento)).click();
	}

	public void clicarElementoPorPatialLinkText(String elemento) {
		DriverFactory.getDriver().findElement(By.partialLinkText(elemento)).click();
	}

	public void clicarElementoPorTagName(String elemento) {
		DriverFactory.getDriver().findElement(By.tagName(elemento)).click();
	}

	/********************* CLICAR *********************/

	/********************* CHECK *********************/
	public boolean isRadioMarcadoPorId(String elemento) {
		return DriverFactory.getDriver().findElement(By.id(elemento)).isSelected();
	}

	public boolean isRadioMarcadoPorClassName(String elemento) {
		return DriverFactory.getDriver().findElement(By.className(elemento)).isSelected();
	}

	public boolean isRadioMarcadoPorCssSelector(String elemento) {
		return DriverFactory.getDriver().findElement(By.cssSelector(elemento)).isSelected();
	}

	public boolean isRadioMarcadoPorLinkText(String elemento) {
		return DriverFactory.getDriver().findElement(By.linkText(elemento)).isSelected();
	}

	public boolean isRadioMarcadoPorName(String elemento) {
		return DriverFactory.getDriver().findElement(By.name(elemento)).isSelected();
	}

	public boolean isRadioMarcadoPorXpath(String elemento) {
		return DriverFactory.getDriver().findElement(By.xpath(elemento)).isSelected();
	}

	public boolean isRadioMarcadoPorPartialLinkText(String elemento) {
		return DriverFactory.getDriver().findElement(By.partialLinkText(elemento)).isSelected();
	}

	public boolean isRadioMarcadoPorTagName(String elemento) {
		return DriverFactory.getDriver().findElement(By.tagName(elemento)).isSelected();
	}

	/***************************** Check ****************************/

	/***************************** OBTER TEXTO **********************/
	public String obterTextoPorId(String elemento) {
		return DriverFactory.getDriver().findElement(By.id(elemento)).getText();
	}

	public String obterTextoPorName(String elemento) {
		return DriverFactory.getDriver().findElement(By.name(elemento)).getText();
	}

	public String obterTextoPorClassName(String elemento) {
		return DriverFactory.getDriver().findElement(By.className(elemento)).getText();
	}

	public String obterTextoPorTagName(String elemento) {
		return DriverFactory.getDriver().findElement(By.tagName(elemento)).getText();
	}

	public String obterTextoPorLinktext(String elemento) {
		return DriverFactory.getDriver().findElement(By.linkText(elemento)).getText();
	}

	public String obterTextoPorPartialLinktext(String elemento) {
		return DriverFactory.getDriver().findElement(By.partialLinkText(elemento)).getText();
	}

	public String obterTextoPorCssSelector(String elemento) {
		return DriverFactory.getDriver().findElement(By.cssSelector(elemento)).getText();
	}

	public String obterTextoPorXpath(String elemento) {
		return DriverFactory.getDriver().findElement(By.xpath(elemento)).getText();
	}

	/********************* OBTER TEXTO *********************/

	/********************* SELECIONAR COMBO *********************/
	public boolean selecionarComboEverificarSeElementoExistePorId(String elemento, String elemento2) {
		WebElement webElement = DriverFactory.getDriver().findElement(By.id(elemento));
		Select combo = new Select(webElement);
		combo.selectByVisibleText(elemento2);

		if (!elemento2.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void selecionarComboPorId(String elemento, String elemento2) {
		WebElement webElement = DriverFactory.getDriver().findElement(By.id(elemento));
		Select combo = new Select(webElement);
		combo.selectByVisibleText(elemento2);
	}

	public void selecionarComboPorIdComFor(String elemento, String elemento2) {

		// 3 � tamanho
		for (int i = 0; i < 3; i++) {
			WebElement webElement = DriverFactory.getDriver().findElement(By.id(elemento));
			Select combo = new Select(webElement);
			combo.selectByVisibleText(elemento2);
			i++;
		}
	}

	public void selecionarComboPorName(String elemento, String elemento2) {
		WebElement webElement = DriverFactory.getDriver().findElement(By.name(elemento));
		Select combo = new Select(webElement);
		combo.selectByVisibleText(elemento2);
	}

	public void selecionarComboPorClassName(String elemento, String elemento2) {
		WebElement webElement = DriverFactory.getDriver().findElement(By.className(elemento));
		Select combo = new Select(webElement);
		combo.selectByVisibleText(elemento2);
	}

	public void selecionarComboPorTagName(String elemento, String elemento2) {
		WebElement webElement = DriverFactory.getDriver().findElement(By.tagName(elemento));
		Select combo = new Select(webElement);
		combo.selectByVisibleText(elemento2);
	}

	public void selecionarComboPorLinkText(String elemento, String elemento2) {
		WebElement webElement = DriverFactory.getDriver().findElement(By.linkText(elemento));
		Select combo = new Select(webElement);
		combo.selectByVisibleText(elemento2);
	}

	public void selecionarComboPorPartialLinkText(String elemento, String elemento2) {
		WebElement webElement = DriverFactory.getDriver().findElement(By.linkText(elemento));
		Select combo = new Select(webElement);
		combo.selectByVisibleText(elemento2);
	}

	public void selecionarComboPorCssSelector(String elemento, String elemento2) {
		WebElement webElement = DriverFactory.getDriver().findElement(By.cssSelector(elemento));
		Select combo = new Select(webElement);
		combo.selectByVisibleText(elemento2);
	}

	public void selecionarComboPorXpath(String elemento, String elemento2) {
		WebElement webElement = DriverFactory.getDriver().findElement(By.xpath(elemento));
		Select combo = new Select(webElement);
		combo.selectByVisibleText(elemento2);
	}

	/********************* SELECIONAR COMBO *********************/

	/********************* OBTER VALOR COMBO *********************/
	public String obterValorComboPorId(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.id(elemento));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	public String obterValorComboPorClassName(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.className(elemento));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	public String obterValorComboPorCssSelector(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.cssSelector(elemento));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	public String obterValorComboPorLinkText(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.linkText(elemento));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	public String obterValorComboPorName(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.name(elemento));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	public String obterValorComboPorXpath(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.xpath(elemento));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	public String obterValorComboPorPartialLinkText(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.partialLinkText(elemento));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	public String obterValorComboPorTagName(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.tagName(elemento));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	/********************* OBTER VALOR COMBO *********************/

	/********************* OBTER QUANTIDADE OP��ES COMBO *********************/
	public int obterQuantidadeOpcoesComboPorId(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.id(elemento));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		return options.size();
	}

	public int obterQuantidadeOpcoesComboPorClassName(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.className(elemento));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		return options.size();
	}

	public int obterQuantidadeOpcoesComboPorCssSelector(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.cssSelector(elemento));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		return options.size();
	}

	public int obterQuantidadeOpcoesComboPorLinkText(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.linkText(elemento));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		return options.size();
	}

	public int obterQuantidadeOpcoesComboPorName(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.name(elemento));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		return options.size();
	}

	public int obterQuantidadeOpcoesComboPorXpath(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.xpath(elemento));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		return options.size();
	}

	public int obterQuantidadeOpcoesComboPorPartialLinkText(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.linkText(elemento));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		return options.size();
	}

	public int obterQuantidadeOpcoesComboPorTagName(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.tagName(elemento));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		return options.size();
	}

	/********************* OBTER QUANTIDADE OP��ES COMBO *********************/

	/********************* VERIFICAR OP��O COMBO *********************/
	public boolean verificarOpcaoComboPorId(String elemento, String elemento2) {
		WebElement element = DriverFactory.getDriver().findElement(By.id(elemento));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		for (WebElement option : options) {
			if (option.getText().equals(elemento2)) {
				return true;
			}
		}
		return false;
	}

	public boolean verificarOpcaoComboPorClassName(String elemento, String elemento2) {
		WebElement element = DriverFactory.getDriver().findElement(By.className(elemento));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		for (WebElement option : options) {
			if (option.getText().equals(elemento2)) {
				return true;
			}
		}
		return false;
	}

	public boolean verificarOpcaoComboPorCssSelector(String elemento, String elemento2) {
		WebElement element = DriverFactory.getDriver().findElement(By.cssSelector(elemento));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		for (WebElement option : options) {
			if (option.getText().equals(elemento2)) {
				return true;
			}
		}
		return false;
	}

	public boolean verificarOpcaoComboPorLinkText(String elemento, String elemento2) {
		WebElement element = DriverFactory.getDriver().findElement(By.linkText(elemento));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		for (WebElement option : options) {
			if (option.getText().equals(elemento2)) {
				return true;
			}
		}
		return false;
	}

	public boolean verificarOpcaoComboPorName(String elemento, String elemento2) {
		WebElement element = DriverFactory.getDriver().findElement(By.name(elemento));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		for (WebElement option : options) {
			if (option.getText().equals(elemento2)) {
				return true;
			}
		}
		return false;
	}

	public boolean verificarOpcaoComboPorPartialLinkText(String elemento, String elemento2) {
		WebElement element = DriverFactory.getDriver().findElement(By.partialLinkText(elemento));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		for (WebElement option : options) {
			if (option.getText().equals(elemento2)) {
				return true;
			}
		}
		return false;
	}

	public boolean verificarOpcaoComboPorTagName(String elemento, String elemento2) {
		WebElement element = DriverFactory.getDriver().findElement(By.tagName(elemento));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		for (WebElement option : options) {
			if (option.getText().equals(elemento2)) {
				return true;
			}
		}
		return false;
	}

	public boolean verificarOpcaoComboPorXpath(String elemento, String elemento2) {
		WebElement element = DriverFactory.getDriver().findElement(By.xpath(elemento));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		for (WebElement option : options) {
			if (option.getText().equals(elemento2)) {
				return true;
			}
		}
		return false;
	}

	/********************* VERIFICAR OP��O COMBO *********************/

	/********************* DESELECIONAR COMBO *********************/
	public void deselecionarComboPorId(String elemento, String elemento2) {
		WebElement element = DriverFactory.getDriver().findElement(By.id(elemento));
		Select combo = new Select(element);
		combo.deselectByVisibleText(elemento2);
	}

	public void deselecionarComboPorClassName(String elemento, String elemento2) {
		WebElement element = DriverFactory.getDriver().findElement(By.id(elemento));
		Select combo = new Select(element);
		combo.deselectByVisibleText(elemento2);
	}

	public void deselecionarComboPorCssSelector(String elemento, String elemento2) {
		WebElement element = DriverFactory.getDriver().findElement(By.id(elemento));
		Select combo = new Select(element);
		combo.deselectByVisibleText(elemento2);
	}

	public void deselecionarComboPorLinkText(String elemento, String elemento2) {
		WebElement element = DriverFactory.getDriver().findElement(By.id(elemento));
		Select combo = new Select(element);
		combo.deselectByVisibleText(elemento2);
	}

	public void deselecionarComboPorName(String elemento, String elemento2) {
		WebElement element = DriverFactory.getDriver().findElement(By.id(elemento));
		Select combo = new Select(element);
		combo.deselectByVisibleText(elemento2);
	}

	public void deselecionarComboXpath(String elemento, String elemento2) {
		WebElement element = DriverFactory.getDriver().findElement(By.id(elemento));
		Select combo = new Select(element);
		combo.deselectByVisibleText(elemento2);
	}

	public void deselecionarComboPartialLinkText(String elemento, String elemento2) {
		WebElement element = DriverFactory.getDriver().findElement(By.id(elemento));
		Select combo = new Select(element);
		combo.deselectByVisibleText(elemento2);
	}

	public void deselecionarComboPorTagName(String elemento, String elemento2) {
		WebElement element = DriverFactory.getDriver().findElement(By.id(elemento));
		Select combo = new Select(element);
		combo.deselectByVisibleText(elemento2);
	}

	/********************* DESELECIONAR COMBO *********************/

	/********************* OBTER VALORES COMBO *********************/
	public List<String> obterValoresComboPorId(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.id(elemento));
		Select combo = new Select(element);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		List<String> valores = new ArrayList<String>();
		for (WebElement opcao : allSelectedOptions) {
			valores.add(opcao.getText());
		}
		return valores;
	}

	public List<String> obterValoresComboPorClassName(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.className(elemento));
		Select combo = new Select(element);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		List<String> valores = new ArrayList<String>();
		for (WebElement opcao : allSelectedOptions) {
			valores.add(opcao.getText());
		}
		return valores;
	}

	public List<String> obterValoresComboPorCssSelector(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.cssSelector(elemento));
		Select combo = new Select(element);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		List<String> valores = new ArrayList<String>();
		for (WebElement opcao : allSelectedOptions) {
			valores.add(opcao.getText());
		}
		return valores;
	}

	public List<String> obterValoresComboPorLinkText(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.linkText(elemento));
		Select combo = new Select(element);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		List<String> valores = new ArrayList<String>();
		for (WebElement opcao : allSelectedOptions) {
			valores.add(opcao.getText());
		}
		return valores;
	}

	public List<String> obterValoresComboPorName(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.name(elemento));
		Select combo = new Select(element);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		List<String> valores = new ArrayList<String>();
		for (WebElement opcao : allSelectedOptions) {
			valores.add(opcao.getText());
		}
		return valores;
	}

	public List<String> obterValoresComboPorXpath(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.xpath(elemento));
		Select combo = new Select(element);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		List<String> valores = new ArrayList<String>();
		for (WebElement opcao : allSelectedOptions) {
			valores.add(opcao.getText());
		}
		return valores;
	}

	public List<String> obterValoresComboPorPartialLinkText(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.partialLinkText(elemento));
		Select combo = new Select(element);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		List<String> valores = new ArrayList<String>();
		for (WebElement opcao : allSelectedOptions) {
			valores.add(opcao.getText());
		}
		return valores;
	}

	public List<String> obterValoresComboPorTagName(String elemento) {
		WebElement element = DriverFactory.getDriver().findElement(By.tagName(elemento));
		Select combo = new Select(element);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		List<String> valores = new ArrayList<String>();
		for (WebElement opcao : allSelectedOptions) {
			valores.add(opcao.getText());
		}
		return valores;
	}
	/********* OBTER VALORES COMBO ************/

	/********* FRAMES E JANELAS ************/
	public void entrarFrame(String elemento) {
		DriverFactory.getDriver().switchTo().frame(elemento);
	}

	public void sairFrame() {
		DriverFactory.getDriver().switchTo().defaultContent();
	}

	public void trocarJanela(String elemento) {
		DriverFactory.getDriver().switchTo().window(elemento);
	}
	/********************* FRAMES E JANELAS *********************/

	/********************* ALERTS *********************/
	public String alertaObterTexto() {
		Alert alert = DriverFactory.getDriver().switchTo().alert();
		return alert.getText();
	}

	public String alertaObterTextoEAceita() {
		Alert alert = DriverFactory.getDriver().switchTo().alert();
		String valor = alert.getText();
		alert.accept();
		return valor;
	}

	public String alertaObterTextoENega() {
		Alert alert = DriverFactory.getDriver().switchTo().alert();
		String valor = alert.getText();
		alert.dismiss();
		return valor;
	}

	public void alertaEscrever(String elemento) {
		Alert alert = DriverFactory.getDriver().switchTo().alert();
		alert.sendKeys(elemento);
		alert.accept();
	}



	
}