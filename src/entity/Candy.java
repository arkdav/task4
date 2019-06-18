package entity;

import collector.TypeSweet;

public class Candy extends Sweetness{

    public Candy(double weight, double sugar){
        super(weight,sugar);
        setType(TypeSweet.CANDY.toString());
    }

}
