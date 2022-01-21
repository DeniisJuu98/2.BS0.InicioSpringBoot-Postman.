package BS2_Inyeccioón_de_dependencias;


import org.springframework.stereotype.Service;

//usamos @Service para poder usarlo como dependencia en otras clases
@Service
public class Servicio implements ServInt{

    //Creamos una nueva persona, que sera la que se use en las nuevas clases
    Persona p = new Persona();

    //creamos la clase implementada desde la interfaz
    @Override
    public Persona createPersona(String nombre, int edad, String provincia) {
        //set de los datos de Persona
        p.setNombre(nombre);
        p.setProvincia(provincia);
        p.setEdad(edad);
        //devolvemos persona
        return p;
    }
    //Clase para devolver la persona una vez creada.
    public Persona getPersona()
    {
        return p;
    }
}
