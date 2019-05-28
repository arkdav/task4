package entity;

import java.util.ArrayList;
import java.util.List;
import exception.DataException;
import parser.DataParser;
import reader.DataReader;

public class Gift{

    private final int MAX_NUMBER_SWEETNESS = 15;
    private List<Sweetness> gift;

    public Gift(){
        gift=new ArrayList<>();
    }

    public Gift(List <Sweetness> gift) {
        this.gift = new ArrayList<>(gift);
    }

    public  Gift(Gift gift){
        this.gift = new ArrayList<>(gift.gift);
    }

    public List<Sweetness> getSweetness() {
        return gift;
    }

    public int getNumberSweetness(){
        return gift.size();
    }

    public void addSweetness(Sweetness addingSweetness, int number) throws DataException{
        int currentSize=gift.size();
        if(MAX_NUMBER_SWEETNESS-currentSize>=number){
            for(int i=0; i<number;++i){
                addSweetness(addingSweetness);
            }
        }
        else {
            throw new DataException("The gift set can contain only 12 sweetness.");
        }
    }

    public void addSweetness(Sweetness addingSweetness) throws DataException {
        if (gift.size() < MAX_NUMBER_SWEETNESS ) {
            gift.add(addingSweetness);
        } else {
            throw new DataException("The gift set is full");
        }
    }

    public void addSweetnessFromRow (List <Integer> numbers) throws DataException{
        int typeIndex=numbers.get(0);
        double weight=(double)numbers.get(1);
        double sugar=(double)numbers.get(2);
        int number = numbers.get(3);
        Sweetness sweet;
        switch(typeIndex){
            case 1: sweet = new Candy(weight,sugar); break;
            case 2: sweet = new Biscuit(weight,sugar);break;
            case 3: sweet = new Chocolate(weight,sugar);break;
            case 4: sweet = new Marmalade(weight,sugar);break;
            case 5: sweet = new Waffle(weight,sugar);break;
            default: throw new DataException("Error with type index");
        }
        if(number==1) {
            this.addSweetness(sweet);
        }
        else {
            this.addSweetness(sweet,number);
        }
    }

    public void addSweetnessFromFile (String path){
        DataReader reader = new DataReader();
        try{
            List<String> lines = reader.readAll(path);
        DataParser converter = new DataParser();
        List<List<Integer>> resultArrays = converter.convertToIntArrays(lines);
        for (int rowNumber=0; rowNumber<resultArrays.size();rowNumber++) {
            this.addSweetnessFromRow(resultArrays.get(rowNumber));
        }
        } catch (DataException e) {
            e.printStackTrace();
        }
    }
}
