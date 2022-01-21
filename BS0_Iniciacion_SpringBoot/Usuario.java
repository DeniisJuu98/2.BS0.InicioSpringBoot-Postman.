package BS0_Iniciacion_SpringBoot;

import lombok.Data;

//Creamos una clase simple de usuario, para ser luego buscada en un JSON
//Con lo que tienen que ser los mismos parametros del objeto
@Data
public class Usuario{
    String nombre;
    int edad;
    String provincia;
}
