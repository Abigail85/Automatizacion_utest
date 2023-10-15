package co.com.automatizacion.utest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.utest.automatizacion.user_interface.GuardarNotas.*;


public class GuardarInformacion implements Interaction {

    private final String menu;


    public GuardarInformacion(String menu){
        this.menu = menu;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (menu) {
            case "informacion personal":
                actor.attemptsTo(Click.on(BUTTON_GUARDAR_DATOS_BASICOS));
                break;
            case "Nota de texto sin formato":
                actor.attemptsTo(Click.on(BUTTON_GUARDAR_NOTA_SIN_FORMATO));
                break;
            case "Notas de texto enriquecido":
                actor.attemptsTo(Click.on(BUTTON_GUARDAR_NOTA_CON_FORMATO));
                break;
            default:
                System.out.println("La nota no fue encontrada");
                break;
        }
    }

    public static GuardarInformacion enElBlock(String menu){
        return Tasks.instrumented(GuardarInformacion.class,menu);
    }
}
