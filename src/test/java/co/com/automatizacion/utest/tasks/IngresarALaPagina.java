package co.com.automatizacion.utest.tasks;


import co.com.utest.automatizacion.interactions.IngresarAlRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarALaPagina implements Task {


    public IngresarALaPagina() {

    }

    public static Performable requerida() {
        return instrumented(IngresarALaPagina.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("https://www.utest.com/"));
        actor.attemptsTo(IngresarAlRegistro.guardada());



        }


}
