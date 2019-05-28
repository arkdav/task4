package validator;
import java.io.File;
import java.util.regex.Pattern;

public class DataValidator {

    private static final String REGEX_NUMBERS = "([0-9]*\\s*)+";

    public boolean checkFile(File file){
        return (file.exists()&&file.length()!=0);
    }

    public boolean stringIsCorrect(String string){
        return Pattern.matches(REGEX_NUMBERS, string);
    }
}