package mattiasusin.D3_S1_U5;

import lombok.Getter;
import mattiasusin.D3_S1_U5.entities.Bevande;
import mattiasusin.D3_S1_U5.entities.Pizze;
import mattiasusin.D3_S1_U5.entities.Toppings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class MenuConfig {

    @Value("${costo.del.coperto:2.5}")
    private double Coperto;


    //ELENCO BEANS

    @Getter
    @Value("${costo.del.coperto:2.50}")
    private double costoDelCoperto;

    @Autowired
    @Bean
    @Primary
    public List<Pizze> getPizze() {
        return Arrays.asList(
                new Pizze("Margherita", 800, 7.50),
                new Pizze("4 Stagioni", 1500, 10.50),
                new Pizze("Wurstel", 900, 9.50),
                new Pizze("Diavola", 1000, 9.50)
        );
    }

    public double getCostoMargherita() {
        List<Pizze> pizzeList = getPizze(); //OTTIENI LISTA DELLE PIZZE
        for (Pizze pizze : pizzeList) {
            if ("Margherita".equals(pizze.getName())) {
                return pizze.getPrice(); //RESTITUISCE IL PREZZO DELLA PIZZA
            }
        }
        return 0;
    }

    @Bean
    public List<Bevande> getBevande() {
        return Arrays.asList(
                new Bevande("Coca-Cola", 345, 3.5),
                new Bevande("Bionda Piccola", 345, 3.5),
                new Bevande("Bionda Media", 345, 6.5),
                new Bevande("Ipa Piccola", 345, 4.5),
                new Bevande("Ipa Media", 345, 7.00)
        );
    }

    ;

    @Bean
    public List<Toppings> getToppings() {
        return Arrays.asList(
                new Toppings("Burrata", 120, 1.5),
                new Toppings("Cipolla di Tropea", 140, 1.2),
                new Toppings("Salamino piccante", 140, 0.9),
                new Toppings("Crudo", 180, 1.0)
        );
    }


}
