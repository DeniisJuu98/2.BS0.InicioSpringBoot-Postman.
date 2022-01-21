package BS2_Inyeccioón_de_dependencias_Bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
//declarar controlador
@RestController()
public class Controlador1 {

    //añadimos la dependencia
    @Autowired
    ServicioCiudad servicioCiudad;

    //creamos el post para añadir las ciudades a la lista, con los datos del header
    @PostMapping("/controlador1/addCiudad")
    public void getPersona (@RequestHeader(value = "nombre") String nombre, @RequestHeader(value = "nHabitantes") int nHabitantes){
         servicioCiudad.addCiudad(nombre,nHabitantes);
    }
}
