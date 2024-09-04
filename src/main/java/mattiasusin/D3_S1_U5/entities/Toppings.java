package mattiasusin.D3_S1_U5.entities;

public class Toppings extends Menu{

    public Toppings(String name, int calories,double price ){
        super(name,calories,price);
    }

    // TO STRING

    @Override
    public String toString() {
        return "Toppings{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                "} " + super.toString();
    }
}
