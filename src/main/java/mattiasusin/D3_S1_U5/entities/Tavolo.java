package mattiasusin.D3_S1_U5.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Setter
@Getter
public class Tavolo {

    private int numeroTavolo;
    private int numeroCoperti;
    private boolean statoTavolo;

// TO STRING
    @Override
    public String toString() {
        return "Tavolo{" +
                "numeroTavolo=" + numeroTavolo +
                ", numeroCoperti=" + numeroCoperti +
                ", statoTavolo=" + statoTavolo +
                '}';
    }
}

