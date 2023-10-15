package co.com.automatizacion.utest.stepdefinitions;

import co.com.utest.automatizacion.models.Utest_Datos;
import co.com.utest.automatizacion.tasks.IngresarDatos;
import co.com.utest.automatizacion.tasks.IngresarALaPagina;
import co.com.utest.automatizacion.models.Utest_Datos;
import co.com.utest.automatizacion.tasks.IngresarALaPagina;
import co.com.utest.automatizacion.tasks.IngresarDatos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class CrearUsuarioStepDefinitions {

    @Given("que una persona quiere ingresar a la pagina Utest")
    public void queUnaPersonaIngresarALaPagina() {

        theActorCalled("persona").wasAbleTo(IngresarALaPagina.requerida());
    }

    @When("completa todos los datos")
    public void completaTodosLosDatos(List<Utest_Datos> datos) {
    theActorInTheSpotlight().attemptsTo(
            IngresarDatos.personales(datos)

    );


    }
    @Then("debe ver su usuario creado de manera exitosa")
    public void debeVerSuUsuarioCreado() {
        theActorInTheSpotlight().attemptsTo();

    }
}



