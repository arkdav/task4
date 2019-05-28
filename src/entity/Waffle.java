package entity;

public class Waffle extends Sweetness{
    public Waffle(double weight, double sugar){
        super(weight,sugar);
        setType(TypeSweet.WAFFLE.toString());
    }
}
