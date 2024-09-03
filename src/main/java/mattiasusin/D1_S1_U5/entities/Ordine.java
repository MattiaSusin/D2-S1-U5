package mattiasusin.D1_S1_U5.entities;

import lombok.Getter;
import lombok.Setter;
import mattiasusin.D1_S1_U5.enums.StatOrdine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Clock;
import java.util.List;
import java.util.UUID;

@Component
@Getter
@Setter
public class Ordine {
    @Autowired
    private int numeroComanda;
    private List<Menu> elementiMenu;
    private Clock orarioAcquisizione;
    private double importoTotale;
    private StatOrdine statOrdine;

    // TO STRING

    @Override
    public String toString() {
        return "Ordine{" +
                "numeroComanda=" + numeroComanda +
                ", elementiMenu=" + elementiMenu +
                ", orarioAcquisizione=" + orarioAcquisizione +
                ", importoTotale=" + importoTotale +
                ", statOrdine=" + statOrdine +
                '}';
    }
}
