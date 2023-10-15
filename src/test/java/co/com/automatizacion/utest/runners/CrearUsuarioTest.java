package co.com.automatizacion.utest.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/crear_usuario.feature",
        glue = {"co.com.utest.automatizacion.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@Negrita"
)
public class CrearUsuarioTest {

}
