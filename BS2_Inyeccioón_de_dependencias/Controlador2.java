package BS2_Inyeccioón_de_dependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Controlador2 {

    @Autowired
    Servicio servicio;

    @PostMapping("/persona2/getPersona")
    public Persona getPersonaNueva (){
        Persona p = (Persona) servicio.getPersona();
        p.setEdad(p.getEdad()*2);
        return p;
    }


}
