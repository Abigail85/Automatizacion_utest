package co.com.automatizacion.utest.interactions;


import co.com.utest.automatizacion.user_interface.IngresarDatos;
import co.com.utest.automatizacion.utils.Constantes;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class CompletarDatos implements Interaction {

    private final String campo;

    public CompletarDatos(String campo){

        this.campo=campo;

    }
    @Step("Ingresar los datos requeridos en el formulario")
    @Override
    public <T extends Actor> void performAs(T actor) {
        if("nombre".equals(campo))
        actor.attemptsTo(Click.on(IngresarDatos.INPUT_NOMBRE));
        actor.attemptsTo(Enter.theValue(Constantes.NOMBRE.getConstante()).into(IngresarDatos.INPUT_NOMBRE));
        

    }


    public static CompletarDatos delFormulario(String campo){
        return Tasks.instrumented(CompletarDatos.class,campo);
    }
}
