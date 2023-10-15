package co.com.automatizacion.utest.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GuardarNotas {

	public static final Target BUTTON_GUARDAR_DATOS_BASICOS = Target.the("").located(By.xpath("//font[text()='Siguiente: Ubicación'']"));
	public static final Target BUTTON_GUARDAR_NOTA_SIN_FORMATO = Target.the("espacio para guardar la nota sin formato").located(By.xpath("//div[@id='plaintextnote']//following::button"));
	public static final Target BUTTON_GUARDAR_NOTA_CON_FORMATO = Target.the("espacio para guardar la nota con formato").located(By.xpath("//div[@id='richtextnote']//following::button"));
	public static final Target BUTTON_GUARDAR_LISTA_DE_TAREAS = Target.the("espacio para guardar la lista de tareas").located(By.xpath("//div[@id='tasklist']//following::button"));
}



