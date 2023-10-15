package co.com.automatizacion.utest.interactions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.utest.automatizacion.user_interface.PaginaPrincipal.BUTTON_UNETE;


public class IngresarAlRegistro implements Interaction {


    public IngresarAlRegistro(){

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_UNETE));

    }

    public static IngresarAlRegistro guardada(){
        return Tasks.instrumented(IngresarAlRegistro.class);
    }
}


