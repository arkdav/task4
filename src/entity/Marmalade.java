package entity;

import collector.TypeSweet;

public class Marmalade extends Sweetness{
    public Marmalade(double weight, double sugar){
        super(weight,sugar);
        setType(TypeSweet.MARMALADE.toString());
    }
}
