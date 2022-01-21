package BS2_Inyeccioón_de_dependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


//Definimos como controlador
@RestController()
public class Controlador1 {
//Introducimos la dependencia de la clase servicio
    @Autowired
    Servicio servicio;

    //Cogemos los datos introducidos en el Header de Postman, para crear un objeto Persona
    
    @GetMapping("/controlador1/addPersona")
    public Persona getPersona (@RequestHeader(value = "nombre") String nombre,@RequestHeader(value = "edad") int edad,@RequestHeader(value = "provincia") String provincia){
        //Para la creacion de persona, usamos el metodo imporado de servicio, y usamos su clase creada anteriormente
        return servicio.createPersona(nombre,edad,provincia);
    }


}
