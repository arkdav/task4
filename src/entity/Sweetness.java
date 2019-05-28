package entity;

public class Sweetness{

    private static final double DEFAULT_WEIGHT=0;
    private static final double DEFAULT_SUGAR=0;
    private static final String DEFAULT_TYPE="";
    private double weight;
    private double sugar;
    private String type;

    public Sweetness(){
        this.weight= DEFAULT_WEIGHT;
        this.sugar= DEFAULT_SUGAR;
        this.type=DEFAULT_TYPE;
    }

    public Sweetness (double weight, double sugar){
        this.weight=weight;
        this.sugar=sugar;
    }

    public Sweetness(Sweetness sweetness){
        if (sweetness!=null){
            weight=sweetness.getWeight();
            sugar=sweetness.getSugar();
            type=sweetness.getType();
        }
    }

    public void setWeight(double weight){
        if(weight>0) {
            this.weight = weight;
        }
    }
    public void setSugar(double sugar){
        if (sugar>0){
            this.sugar=sugar;
        }
    }

    public void setType(String type){
        this.type=type;
    }

    public double getWeight(){
        return weight;
    }

    public double getSugar(){
        return sugar;
    }

    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return "\n{" +
                " type: " +type.toLowerCase()+
                ", weight = " + weight +
                " gr, sugar = " + sugar +
                " gr in 100 gr of sweet}";
    }

}

