package BS2_Inyeccioón_de_dependencias;
//usamos una interfaz para la clase servicio
public interface ServInt {

    //este metodo creara un nuevo objeto persona
    Persona createPersona(String nombre, int edad, String provincia);
}
