package BS2_Inyeccioón_de_dependencias;


import org.springframework.stereotype.Service;

@Service
public class Servicio implements ServInt{

    Persona p = new Persona();


    @Override
    public Persona createPersona(String nombre, int edad, String provincia) {

        p.setNombre(nombre);
        p.setProvincia(provincia);
        p.setEdad(edad);

        return p;
    }
    public Persona getPersona()
    {
        return p;
    }
}
