package co.com.automatizacion.utest.tasks;

import co.com.utest.automatizacion.models.Utest_Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.utest.automatizacion.user_interface.IngresarDatos.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarDatos implements Task {
    private List<Utest_Datos> datos;



    public IngresarDatos(List<Utest_Datos> datos) { this.datos = datos;

    }

    public static IngresarDatos personales(List<Utest_Datos> datos) {
        return instrumented(IngresarDatos.class, datos);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(datos.get(0).getNombre()).into(INPUT_NOMBRE),
                         Enter.theValue(datos.get(0).getNombre()).into(INPUT_APELLIDO),
                         Enter.theValue(datos.get(0).getNombre()).into(INPUT_CORREO),
                         SelectFromOptions.byVisibleText(datos.get(0).getNombre()).from(SELECT_MES),
                         SelectFromOptions.byVisibleText(datos.get(0).getNombre()).from(SELECT_DIA),
                         SelectFromOptions.byVisibleText(datos.get(0).getNombre()).from(SELECT_ANO));
        }

}
