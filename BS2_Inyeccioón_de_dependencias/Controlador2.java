package BS2_Inyeccioón_de_dependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Controlador2 {
//Importamos la dependencia de la clase servicio
    @Autowired
    Servicio servicio;

    //Usamos el post para devolver los datos una vez editados
    @PostMapping("/persona2/getPersona")
    public Persona getPersonaNueva (){
        //creamos ua nueva persona, a la que le introducimos la persona creada en el controlador 1.
        Persona p = (Persona) servicio.getPersona();
        //Cogemos la edad y la multiplicamos por 2.
        p.setEdad(p.getEdad()*2);
        //Devolvemos persona
        return p;
    }


}
