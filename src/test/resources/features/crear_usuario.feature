#Author: Yuliana

 Feature: Crear usuario
   Yo deseo ingresar a una pagina Utest y para ello necesito crear mi usuario


Scenario : Crear un usuario
     Given que una persona quiere ingresar a la pagina Utest
     When completa todos los datos
       |nombre|apellido|correo|mesNacimiento|diaNacimiento|anoNacimiento|
       |Alexis|Moros|amoros@test.com|5      |5            |1985         |
     Then debe ver su usuario creado de manera exitosa

