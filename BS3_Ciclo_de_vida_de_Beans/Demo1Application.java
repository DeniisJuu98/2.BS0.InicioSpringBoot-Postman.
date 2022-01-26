package BS3_Ciclo_de_vida_de_Beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Demo1Application {

	//Primero se ejectua el PostConstruct, a continuacion de manera secuencial los CommandLineRunner
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Bean
	CommandLineRunner ejectuame(){
		return p ->
		{
			System.out.println("Hola desde clase secundaria");
		};
	}

	@Bean
	CommandLineRunner ejectuame2(){
		return p ->
		{
			System.out.println("Soy la tercera clase");
		};
	}

	@PostConstruct
	public void llamada1(){
		System.out.println("Hola desde clase inicial");
	}

}
