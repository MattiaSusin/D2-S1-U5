package mattiasusin.D3_S1_U5.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    protected String name;
    protected int calories;
    protected double price;
}
