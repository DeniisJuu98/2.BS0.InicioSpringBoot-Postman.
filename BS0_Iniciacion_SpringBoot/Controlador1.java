package BS0_Iniciacion_SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
public class Controlador1 {

    @Autowired
    Herramienta herramienta;//llama a HerramientImpl para que se declare una sola vez

    @GetMapping("/a")
    public String getHola(){

        return "Hola Mundo";
    }
    @GetMapping("/b")
    public String getHolab(){

        return "Hola MundoBBBB";
    }

    @GetMapping("/nombre/{id}")
        public String getNombreId(@PathVariable String id){
            return "Id del usuario :"+ id;
        }

    @GetMapping("/herramient")
    public String dameHerramienta(@PathVariable String herrmaient){
        return herramienta.getHerramienta(herrmaient);
    }

    @PostMapping("/usuario")
    public Usuario getUsuario(@RequestBody Usuario usu){
        usu.setEdad(usu.getEdad()+1);
        return usu;
    }


}
