package runner;

import action.GiftAction;
import collector.Gift;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Gift gift=new Gift();
        gift.addSweetnessFromFile("data/input.txt");
        System.out.println(gift.getSweetness());
        System.out.println("Put type (candy, biscuit, chocolate, marmalade, waffle): ");
        Scanner scan = new Scanner(System.in);
        String type = scan.next();
        System.out.println(GiftAction.findSweetsByType(gift, type));
        System.out.println("Gift weight: "+GiftAction.getGiftWeight(gift));
        System.out.println("Put start and end sugar position: ");
        Double startSugar=scan.nextDouble();
        Double endSugar=scan.nextDouble();
        System.out.println(GiftAction.findSweetsBySugar(gift, startSugar, endSugar));
    }
}
