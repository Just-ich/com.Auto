package Map.Transleit;

import java.util.*;

public class SimpleFileValidator {

    public Map<String, String> validate(List<List<String>> parsedInput) {

        Map<String, String> mappedInput= new HashMap<>();
        for (int i = 0; i < parsedInput.size(); i++) {
            mappedInput.put(parsedInput.get(i).get(0), parsedInput.get(i).get(1));
        }
            return mappedInput;
    }
}



