package mattiasusin.D3_S1_U5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class D3S1U5ApplicationTests {

    //TEST
    @Autowired
    private MenuConfig menuConfig;

    @BeforeAll
    static void setupIniziale() {
        // Codice per inizializzare risorse comuni a tutti i test
        System.out.println("INIZIO DEI TEST.");
    }

    @AfterAll
    static void setupFinale() {
        // Codice per inizializzare risorse comuni a tutti i test
        System.out.println("FINE DEI TEST.");
    }

    @Test
    void contextLoads() {
    }

    @Test
    public void testCostoDelCoperto() {
        System.out.println("TEST 1");
        double expectedCostoDelCoperto = 2.50;

        double actualCostoDelCoperto = menuConfig.getCostoDelCoperto();
        System.out.println("Costo del coperto: " + actualCostoDelCoperto);
        assertEquals(expectedCostoDelCoperto, actualCostoDelCoperto, "Il costo del coperto dovrebbe essere 2.50");
    }

    @Test
    void testCostoMargherita() {
        System.out.println("TEST 2");
        double exCostoMargherita = 7.50;

        double actualCostoMargherita = menuConfig.getCostoMargherita();
        System.out.println("Costo della Margherita: " + actualCostoMargherita);
        assertEquals(exCostoMargherita, actualCostoMargherita, "Il costo del coperto dovrebbe essere 7.50");
    }

    @ParameterizedTest
    @ValueSource()
}
