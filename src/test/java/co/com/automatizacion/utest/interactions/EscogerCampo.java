package co.com.automatizacion.utest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;



public class EscogerCampo implements Interaction {
    private final String menu;



    public EscogerCampo(String menu){
        this.menu=menu;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               // Click.on(BUTTON_ESCOGER_MENU.of(menu)),
               // Scroll.to(BUTTON_ESCOGER_MENU.of("Nota de texto sin formato"))
        );
    }

    public static EscogerCampo nota(String menu){
        return Tasks.instrumented(EscogerCampo.class,menu);
    }
}
