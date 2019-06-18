package action;

import collector.Gift;
import entity.Sweetness;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class GiftAction {

    private static final Logger log = Logger.getLogger(GiftAction.class.getName());

    public static double getGiftWeight(Gift gift){
        log.info("Getting weight of gift.");
        double sumWeight=0;
        List<Sweetness> sweets = gift.getSweetness();
        for(Sweetness sweet: sweets){
            sumWeight+=sweet.getWeight();
        }
        return sumWeight;
    }

    public static List<Sweetness> findSweetsByType(Gift gift, String type){
        log.info("Getting sweets by type.");
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
        log.info("Getting sweets by sugar.");
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
