package BS2_Inyeccioón_de_dependencias_Bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
//declarar controlador
@RestController()
public class Controlador2 {
    //añadimos dependencias
    @Autowired
    ServicioCiudad servicioCiudad;
    //get para mostrar la lista de las ciudades
    @GetMapping("/controlador2/getCiudad")
    public ArrayList getPersona (){
       return servicioCiudad.getCiudad();
    }


}
