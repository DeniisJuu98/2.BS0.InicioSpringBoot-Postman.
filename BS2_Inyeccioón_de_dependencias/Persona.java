package BS2_Inyeccioón_de_dependencias;

import lombok.Data;
import org.springframework.stereotype.Component;

//Creamos un opjeto persona , con sus getters y setters
@Data
public class Persona {
    String nombre;
    int edad;
    String provincia;

    public Persona() {
    }

    public Persona(String nombre, int edad, String provincia ) {
        this.nombre = nombre;
        this.edad = edad;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

}
