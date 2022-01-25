package RS1_Avanzando_con_los_controladores;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Data
public class Usuarios {
    @Id
    @GeneratedValue
    Integer id;

    @Getter
    @Setter
    private String nombreUsuario;

    @Getter
    @Setter
    int edad;

    @Getter
    @Setter
    String ciudad;

}
