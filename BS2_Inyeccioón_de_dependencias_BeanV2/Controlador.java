package BS2_Inyeccioón_de_dependencias_BeanV2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Controlador {
    @Autowired
    @Qualifier("bean1")
    Persona p;

    @Autowired
    @Qualifier("bean2")
    Persona p2;

    @Autowired
    @Qualifier("bean3")
    Persona p3;


    @GetMapping("/controlador/bean/{bean}")
    public String getNombre(@PathVariable String bean){

        switch (bean){
            case"bean1":
                return p.getBean1();
            case "bean2":
                return p2.getBean2();
            case "bean3":
                return p3.getBean3();
        }
        return "null";
    }
}
