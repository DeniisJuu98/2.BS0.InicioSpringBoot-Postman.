package BS2_Inyeccioón_de_dependencias_Bean;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
//clase servicio para usar como dependencia
@Service
public class ServicioCiudad {
//creamos una lista para almacenar las ciudades
    ArrayList<Ciudad> listaCiudad = new ArrayList<>();
    //metodo para crear una nueva ciudad y añadirla a la lista
    public void addCiudad(String nombre, int nHabitantes) {
        Ciudad c = new Ciudad();
        c.setNombre(nombre);
        c.setNumeroHabitantes(nHabitantes);
        listaCiudad.add(c);
    }
    //devuelve la lista de las ciudades
    public ArrayList getCiudad()
    {
        return listaCiudad;
    }
}
