package RS1_Avanzando_con_los_controladores;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class Controlador {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    @GetMapping
    public List<Usuarios> getAll(){
        return usuarioRepositorio.findAll();
    }
    @GetMapping("{id}")
    public Usuarios getByID(@PathVariable Integer id) throws Exception{
        return usuarioRepositorio.findById(id).orElseThrow(() -> new Exception("No encontrado"));
    }
    @PostMapping
    public Usuarios anadirUsuario(@RequestBody Usuarios usu){
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
    public Usuarios modificarUsuario(@PathVariable Integer idUsuario, @RequestBody UsuarioInputDto usu) throws Exception{
        System.out.println("Estas modificando");
        Usuarios usuFind=usuarioRepositorio.findById(idUsuario).orElseThrow(()-> new Exception("Id: "+idUsuario+" No encontrado"));
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




