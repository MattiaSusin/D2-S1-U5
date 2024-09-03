package mattiasusin.D1_S1_U5.entities;

public class Pizze extends Menu{
    public Pizze(String name, int calories,double price ){
        super(name,calories,price);
    }

    // TO STRING
    @Override
    public String toString() {
        return "Pizze{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                "} " + super.toString();
    }



}
