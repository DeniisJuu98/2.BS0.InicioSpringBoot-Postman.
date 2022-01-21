package BS2_Inyeccioón_de_dependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;



@RestController()
public class Controlador1 {

    @Autowired
    Servicio servicio;

    @GetMapping("/controlador1/addPersona")
    public Persona getPersona (@RequestHeader(value = "nombre") String nombre,@RequestHeader(value = "edad") int edad,@RequestHeader(value = "provincia") String provincia){
        return servicio.createPersona(nombre,edad,provincia);
    }


}
