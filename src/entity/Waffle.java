package entity;

import collector.TypeSweet;

public class Waffle extends Sweetness{
    public Waffle(double weight, double sugar){
        super(weight,sugar);
        setType(TypeSweet.WAFFLE.toString());
    }
}
