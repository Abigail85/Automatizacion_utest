package co.com.automatizacion.utest;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public enum Constantes {
    NOMBRE("firstName"),
    APELLIDO("lastName"),
    CORREO("email"),
    MES("birthMonth"),
    DIA("birthDay"),
    ANO("birthYear"),
    DEFAULT("N/A");

    private final  String constante;

    Constantes(String constante){
        this.constante =constante;
    }
     public String getConstante(){return constante; }
    }

