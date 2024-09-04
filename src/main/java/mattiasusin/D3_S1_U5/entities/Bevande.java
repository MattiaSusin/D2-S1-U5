package mattiasusin.D3_S1_U5.entities;

public class Bevande extends Menu{

    public Bevande(String name, int calories,double price ){
        super(name,calories,price);
    }

    //TO STRING

    @Override
    public String toString() {
        return "Bevande{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                "} " + super.toString();
    }
}
