package parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataParser {
    public List <List<Integer>> convertToIntArrays(List <String> lines) {
        List<List<Integer>> resultArrays = new ArrayList<>();
        for (String element:lines){
            List <Integer> row = new ArrayList<>();
            Scanner scan = new Scanner(element);
            while (scan.hasNextInt()){
                row.add(scan.nextInt());
            }
            resultArrays.add(row);
        }
        return resultArrays;
    }
}
