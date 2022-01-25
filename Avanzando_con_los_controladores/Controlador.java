package RS1.Avanzando_con_los_controladores;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class Controlador {
    @Autowired
    com.example.demo1.UsuarioRepositorio usuarioRepositorio;

    @GetMapping
    public List<com.example.demo1.Usuarios> getAll(){
        return usuarioRepositorio.findAll();
    }
    @GetMapping("{id}")
    public com.example.demo1.Usuarios getByID(@PathVariable Integer id) throws Exception{
        return usuarioRepositorio.findById(id).orElseThrow(() -> new Exception("No encontrado"));
    }
    @PostMapping
    public com.example.demo1.Usuarios anadirUsuario(@RequestBody com.example.demo1.Usuarios usu){
        System.out.println("Estas añadiendo");
        usuarioRepositorio.save(usu);
        return usu;
    }
    @DeleteMapping("{id}")
    public void borrarUsuario(@PathVariable Integer id) throws Exception{
        System.out.println("Estas eliminando");
        usuarioRepositorio.deleteById(id);
    }
    @PutMapping("{idUsuario}")
    public com.example.demo1.Usuarios modificarUsuario(@PathVariable Integer idUsuario, @RequestBody com.example.demo1.UsuarioInputDto usu) throws Exception{
        System.out.println("Estas modificando");
        com.example.demo1.Usuarios usuFind=usuarioRepositorio.findById(idUsuario).orElseThrow(()-> new Exception("Id: "+idUsuario+" No encontrado"));
        if (usu.getCiudad()!=null)
            usuFind.setCiudad(usu.getCiudad());
        if (usu.getNombreUsuario()!=null)
            usuFind.setNombreUsuario(usu.getNombreUsuario());
        if (usu.getEdad()!=null)
            usuFind.setEdad(usu.getEdad());
        usuarioRepositorio.save(usuFind);
        return usuFind;
    }
}



