package co.com.automatizacion.utest.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListaDeCampos {
	public static final Target INPUT_CREAR_TAREAS = Target.the("espacio para crea la nota").located(By.id("my-list"));
	public static final Target INPUT_ADICIONAR_TAREAS = Target.the("espacio poner la negrita").located(By.xpath("//button[@id='addnewlist']/img"));//(By.id("addnewlist"));
	public static final Target DIV_MOVER_ELIMINAR_TAREA = Target.the("mover la tarea").locatedBy("//ul[@id='sortable']/div['{0}']");//input[@value="sacudir"]
	public static final Target DIV_LISTA_DE_TAREAS = Target.the("lista de tareas").located(By.xpath("//ul[@id=\"sortable\"]"));//div[@id='tasklist']//div[@class='d-flex justify-content-between delete']"));


}
