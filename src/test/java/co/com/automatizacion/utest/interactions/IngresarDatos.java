package co.com.automatizacion.utest.interactions;

import co.com.utest.automatizacion.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.utest.automatizacion.user_interface.IngresarDatos.*;


public class IngresarDatos implements Interaction {
    private final Constantes constantes;



    public IngresarDatos(Constantes constantes){
        this.constantes=constantes;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(INPUT_NOMBRE));
        actor.attemptsTo(Enter.theValue(constantes.getConstante()).into(INPUT_NOMBRE));
        actor.attemptsTo(Click.on(INPUT_APELLIDO));
        actor.attemptsTo(Enter.theValue(constantes.getConstante()).into(INPUT_APELLIDO));
        actor.attemptsTo(Click.on(INPUT_CORREO));
        actor.attemptsTo(Enter.theValue(constantes.getConstante()).into(INPUT_CORREO));
    }

    public static IngresarDatos nueva(Constantes constantes){
        return Tasks.instrumented(IngresarDatos.class, constantes);
    }
}
