package reader;

import exception.DataException;
import validator.DataValidator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {
    public List<String> readAll(String filePath) throws DataException {
        File file = new File(filePath);
        DataValidator valid = new DataValidator();
        if (!valid.checkFile(file)) {
            throw new DataException("Error with your file: "+file);
        }
        List<String> lines = new ArrayList<>();
        try (Scanner scan = new Scanner(file))
        {
            while (scan.hasNextLine()) {
                String str = scan.nextLine();
                if (valid.stringIsCorrect(str)) {
                    lines.add(str);
                }
            }
        }
        catch (IOException e){
            throw new RuntimeException("Error while opening file ", e);
        }
        return lines;
    }

}
