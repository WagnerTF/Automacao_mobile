package br.steps;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import page.CalculadoraPage;

public class CalculadoraSteps {

	static AppiumDriver<MobileElement> appiumDriver;
	private CalculadoraPage page;

	// ********realizar soma*********//
	@Dado("que o usuario opte por fazer uma soma")
	public void queOUsuarioOptePorFazerUmaSoma() {

		try {
			openCalculadora();

		} catch (Exception exp) {
			exp.getCause();
			exp.getMessage();
			exp.printStackTrace();
		}
	}

	public void openCalculadora() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "Nexus_5X_API_24");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("automationName", "uiautomator2");
		cap.setCapability("appPackage", "com.example.leonardomenezes.simplecalculatorandroid");
		cap.setCapability("appActivity", "com.example.leonardomenezes.simplecalculatorandroid.MainActivity");
		cap.setCapability("browser_name", "chrome");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		appiumDriver = new AppiumDriver<MobileElement>(url, cap);
		page = new CalculadoraPage(appiumDriver);
		System.out.println("Applica etart...");

		page.titulo();

	}

	@Quando("digitar os numeros")
	public void digitarOsNumeros() {
		page.setValorCampo1("2");
		page.setValorCampo2("2");
	}

	@Quando("clicar no botao soma")
	public void clicarNoBotaoSoma() {
		page.setClicarBotãoSoma();
	}

	@Entao("deve apesenta o resutado da soma")
	public void deveApesentaOResutadoDaSoma() {
		page.resultadoSoma();

	}

	// ********realizar subitração*********//
	@Dado("que o usuario opte por fazer uma subtracao")
	public void queOUsuarioOptePorFazerUmaSubtracao() {
		try {
			openCalculadora();

		} catch (Exception exp) {
			exp.getCause();
			exp.getMessage();
			exp.printStackTrace();
		}
	}

	public void openSubitracao() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "Nexus_5X_API_24");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("automationName", "uiautomator2");
		cap.setCapability("appPackage", "com.example.leonardomenezes.simplecalculatorandroid");
		cap.setCapability("appActivity", "com.example.leonardomenezes.simplecalculatorandroid.MainActivity");
		cap.setCapability("browser_name", "chrome");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		appiumDriver = new AppiumDriver<MobileElement>(url, cap);
		page = new CalculadoraPage(appiumDriver);
		System.out.println("Applica etart...");
		appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		page.titulo();

	}

	@Quando("digitar os numeros para subtracao")
	public void digitarOsNumerosParaSubtracao() {
		page.setValorCampo1("10");
		page.setValorCampo2("2");
	}

	@Quando("clicar no botao subtracao")
	public void clicarNoBotaoSubtracao() {
		page.setClicarBotãoSubtração();
		;
	}

	@Entao("deve apesenta o resutado da subtracao")
	public void deveApesentaOResutadoDaSubtracao() {
		page.resultadoSubtração();

	}

	// ********realizar multiplicação*********//
	@Dado("que o usuario opte por fazer uma multiplicacao")
	public void queOUsuarioOptePorFazerUmaMultiplicacao() {
		try {
			openCalculadora();

		} catch (Exception exp) {
			exp.getCause();
			exp.getMessage();
			exp.printStackTrace();
		}
	}

	public void openMultiplicacao() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "Nexus_5X_API_24");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("automationName", "uiautomator2");
		cap.setCapability("appPackage", "com.example.leonardomenezes.simplecalculatorandroid");
		cap.setCapability("appActivity", "com.example.leonardomenezes.simplecalculatorandroid.MainActivity");
		cap.setCapability("browser_name", "chrome");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		appiumDriver = new AppiumDriver<MobileElement>(url, cap);
		page = new CalculadoraPage(appiumDriver);
		System.out.println("Applica etart...");
		appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		page.titulo();

	}

	@Quando("digitar os numeros para a multiplicacao")
	public void digitarOsNumerosParaAMultiplicacao() {
		page.setValorCampo1("2");
		page.setValorCampo2("2");
	}

	@Quando("clicar no botao multiplicacao")
	public void clicarNoBotaoMultiplicacao() {
		page.setClicarBotãoMultiplicação();
	}

	@Entao("deve apesenta o resutado da multiplicacao")
	public void deveApesentaOResutadoDaMultiplicacao() {
		page.resultadoMultiplicação();

	}

	// ********realizar divisão*********//
	@Dado("que o usuario opte por fazer uma divisao")
	public void queOUsuarioOptePorFazerUmaDivisao() {
		try {
			openCalculadora();

		} catch (Exception exp) {
			exp.getCause();
			exp.getMessage();
			exp.printStackTrace();
		}
	}

	public void openDivisão() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "Nexus_5X_API_24");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("automationName", "uiautomator2");
		cap.setCapability("appPackage", "com.example.leonardomenezes.simplecalculatorandroid");
		cap.setCapability("appActivity", "com.example.leonardomenezes.simplecalculatorandroid.MainActivity");
		cap.setCapability("browser_name", "chrome");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		appiumDriver = new AppiumDriver<MobileElement>(url, cap);
		page = new CalculadoraPage(appiumDriver);
		System.out.println("Applica etart...");
		appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		page.titulo();

	}

	@Quando("digitar os numeros no app")
	public void digitarOsNumerosNoApp() {
		page.setValorCampo1("4");
		page.setValorCampo2("2");
	}

	@Quando("clicar no botao divisao")
	public void clicarNoBotaoDivisao() {
		page.setClicarBotãoDivisão();

	}

	@Entao("deve apesenta o resutado da divisao")
	public void deveApesentaOResutadoDaDivisao() {
		page.resultadoDivisão();
	}
}
