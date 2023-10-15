package co.com.automatizacion.utest.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarDatos {
	public static final Target INPUT_NOMBRE_1 = Target.the("Escribir el nombre").locatedBy("//input[text()='{0}']");
	public static final Target INPUT_NOMBRE = Target.the("Escribir el nombre").located(By.id("firstName"));
	public static final Target INPUT_APELLIDO= Target.the("espacio para crea la nota").located(By.id("lastName"));
	public static final Target INPUT_CORREO = Target.the("Espacio para seleccionar el titulo de la nota").located(By.id("email"));
	public static final Target SELECT_MES= Target.the("Espacio para crear el titulo de la nota").located(By.id("birthMonth"));
	public static final Target SELECT_DIA = Target.the("Espacio para crear el titulo de la nota").located(By.id("birthDay"));
	public static final Target SELECT_ANO = Target.the("Espacio para crear el titulo de la nota").located(By.id("birthYear"));
}



