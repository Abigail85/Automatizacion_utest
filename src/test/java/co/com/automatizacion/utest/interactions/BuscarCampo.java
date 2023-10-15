package co.com.automatizacion.utest.interactions;

import co.com.utest.automatizacion.utils.Constantes;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;


public class BuscarCampo implements Interaction {
    private final Constantes constantes;


    public BuscarCampo(Constantes constantes){
        this.constantes=constantes;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(Scroll.to(INPUT_BUSCAR_NOTA));
      //  actor.attemptsTo(Click.on(INPUT_BUSCAR_NOTA));
      //  actor.attemptsTo(Enter.theValue(constantes.getConstante()).into(INPUT_BUSCAR_NOTA));


    }

    public static BuscarCampo guardada(Constantes constantes){
        return Tasks.instrumented(BuscarCampo.class,constantes);
    }
}
