package BS0_Iniciacion_SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//Definimos la clase como controlador
@RestController()
public class Controlador1 {

    //Clase para hola mundo
    //Usamos @GetMappig para devolver datos.
    @GetMapping("/a")
    public String getHola(){
        //devolvemos el "Hola mundo"
        return "Hola Mundo";
    }
    @GetMapping("/b")
    public String getHolab(){

        return "Hola MundoBBBB";
    }

    //Devolvemos una frase con la id introducida por los parametros
    @GetMapping("/nombre/{id}")
        public String getNombreId(@PathVariable String id){
            return "Id del usuario :"+ id;
        }


    //Buscamos los datos de los usuarios y les sumamos 1 a su edad
    @PostMapping("/usuario")
    public Usuario getUsuario(@RequestBody Usuario usu){
        usu.setEdad(usu.getEdad()+1);
        return usu;
    }


}
