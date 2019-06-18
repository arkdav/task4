package entity;

import collector.TypeSweet;

public class Chocolate extends Sweetness{
    public Chocolate(double weight, double sugar){
        super(weight,sugar);
        setType(TypeSweet.CHOCOLATE.toString());
    }

}
