package BS4_Application_Properties_YML;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "datos.my")
public class MY {
    private String VAR2;

    public String getVAR2() {
        return VAR2;
    }

    public void setVAR2(String VAR2) {
        this.VAR2 = VAR2;
    }

}
