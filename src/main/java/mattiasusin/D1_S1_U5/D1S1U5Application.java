package mattiasusin.D1_S1_U5;

import mattiasusin.D1_S1_U5.entities.Bevande;
import mattiasusin.D1_S1_U5.entities.Menu;
import mattiasusin.D1_S1_U5.entities.Pizze;
import mattiasusin.D1_S1_U5.entities.Toppings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import lombok.extern.slf4j.Slf4j;

import java.sql.SQLOutput;
import java.util.List;

@SpringBootApplication
@Slf4j
public class D1S1U5Application {

	public static void main(String[] args) {
		SpringApplication.run(D1S1U5Application.class, args);

		// METODI CON I BEANS
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(D1S1U5Application.class);
		// Rappresenta un riferimento allo 'scatolone' (Application Context)

		System.out.println("");
		System.out.println("*****************PIZZE***************************");
		List<Pizze> p = context.getBean("getPizze", List.class);
		p.forEach(System.out::println);
		System.out.println("");
		System.out.println("*****************TOPPINGS***************************");
		List<Toppings> t = context.getBean("getToppings", List.class);
		t.forEach(System.out::println);
		System.out.println("");
		System.out.println("*****************DRINKS***************************");
		List<Bevande> b = context.getBean("getBevande", List.class);
		b.forEach(System.out::println);


	}

}
