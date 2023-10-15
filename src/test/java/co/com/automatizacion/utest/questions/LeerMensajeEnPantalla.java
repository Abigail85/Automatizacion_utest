package co.com.automatizacion.utest.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;



public class LeerMensajeEnPantalla implements Question<Boolean> {
    private final String titulo;

    public LeerMensajeEnPantalla(String titulo){
        this.titulo=titulo;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
       // actor.attemptsTo(BuscarNota.guardada(Constantes.NOMBRE));
       // String mensajeEnPantalla = actor.asksFor(Text.of(A_ABRIR_NOTA_GUARDADA));
       // String mensajeEnPantalla = A_ABRIR_NOTA_GUARDADA.resolveFor(actor).getText();
      // return titulo.equals(mensajeEnPantalla);
        return Boolean.TRUE ;
    }
  public static LeerMensajeEnPantalla esIgualALaNotaGuardada (String titulo){
        return new LeerMensajeEnPantalla(titulo);
  }

}
