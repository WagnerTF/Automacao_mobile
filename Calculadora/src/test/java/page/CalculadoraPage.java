package page;

import org.junit.Assert;
import org.openqa.selenium.By;

import br.steps.CalculadoraSteps;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculadoraPage extends CalculadoraSteps {

	private static AppiumDriver<MobileElement> driver;

	public CalculadoraPage(AppiumDriver<MobileElement> driver) {

		super();
		this.driver = driver;

	}

	public void titulo() {

		String resultado = driver.findElement(By.className("android.widget.TextView")).getText();
		Assert.assertEquals("Simple Calculator Android", resultado);

	}

	public void setValorCampo1(String campo1) {
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys(campo1);

	}

	public void setValorCampo2(String campo2) {
		driver.findElement(By.id("com.example.leonardomenezes.simplecalculatorandroid:id/android_field_second_number"))
				.sendKeys(campo2);

	}

	public void setClicarBot�oSoma() {
		driver.findElement(By.id("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_sum")).click();

	}

	public void resultadoSoma() {

		String resultado = driver
				.findElement(By.id("com.example.leonardomenezes.simplecalculatorandroid:id/android_result_text"))
				.getText();
		Assert.assertEquals("4", resultado);

	}

	public void setClicarBot�oSubtra��o() {
		driver.findElement(By.id("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_sub")).click();

	}

	public void resultadoSubtra��o() {

		String resultado = driver
				.findElement(By.id("com.example.leonardomenezes.simplecalculatorandroid:id/android_result_text"))
				.getText();
		Assert.assertEquals("8", resultado);

	}

	public void setClicarBot�oMultiplica��o() {
		driver.findElement(By.id("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_mult")).click();

	}

	public void resultadoMultiplica��o() {

		String resultado = driver
				.findElement(By.id("com.example.leonardomenezes.simplecalculatorandroid:id/android_result_text"))
				.getText();
		Assert.assertEquals("4", resultado);

	}

	public void setClicarBot�oDivis�o() {
		driver.findElement(By.id("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_div")).click();

	}

	public void resultadoDivis�o() {

		String resultado = driver
				.findElement(By.id("com.example.leonardomenezes.simplecalculatorandroid:id/android_result_text"))
				.getText();
		Assert.assertEquals("2", resultado);

	}

}