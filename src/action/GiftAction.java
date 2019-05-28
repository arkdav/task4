package action;

import entity.Gift;
import entity.Sweetness;

import java.util.ArrayList;
import java.util.List;

public class GiftAction {

    public static double getGiftWeight(Gift gift){
        double sumWeight=0;
        List<Sweetness> sweets = gift.getSweetness();
        for(Sweetness sweet: sweets){
            sumWeight+=sweet.getWeight();
        }
        return sumWeight;
    }

    public static List<Sweetness> findSweetsByType(Gift gift, String type){
        List<Sweetness> sweets = gift.getSweetness();
        List<Sweetness> typeSweetsList = new ArrayList<>();
        for(Sweetness sweet: sweets){
            if(type.toUpperCase().equals(sweet.getType())){
                typeSweetsList.add(sweet);
            }
        }
        return typeSweetsList;
    }
    public static List<Sweetness> findSweetsBySugar(Gift gift, double startSugar, double endSugar){
        List<Sweetness> sugarSweetsList = new ArrayList<>();
        List<Sweetness> sweets = gift.getSweetness();
        for(Sweetness sweet: sweets){
            if(sweet.getSugar()>=startSugar && sweet.getSugar()<=endSugar){
                sugarSweetsList.add(sweet);
            }
        }
        return sugarSweetsList;
    }

}
