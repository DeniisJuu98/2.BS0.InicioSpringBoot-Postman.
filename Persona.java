package BS2_Inyeccioón_de_dependencias_BeanV2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Persona {

    @Bean
    @Qualifier("bean1")
    public String getBean1() {
        return "bean1";
    }

    @Bean
    @Qualifier("bean2")
    public String getBean2() {
        return "bean2";
    }

    @Bean
    @Qualifier("bean3")
    public String getBean3() {
        return "bean3";
    }




}
