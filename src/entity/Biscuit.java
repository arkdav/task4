package entity;

public class Biscuit extends Sweetness{
    public Biscuit(double weight, double sugar){
        super(weight,sugar);
        setType(TypeSweet.BISCUIT.toString());
    }
}
