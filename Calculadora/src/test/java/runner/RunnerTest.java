package runner;

import org.junit.runner.RunWith;

import br.steps.CalculadoraSteps;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/calculadora.feature", glue = "br.steps", tags = {
		"~@ignore" }, plugin = "pretty", monochrome = false, snippets = SnippetType.CAMELCASE, dryRun = false, strict = false)

public class RunnerTest extends CalculadoraSteps {

}
