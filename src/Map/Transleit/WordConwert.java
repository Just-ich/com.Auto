package Map.Transleit;

import java.util.*;

public class WordConwert {

    public List<String> transleit(List<String> parsedInput1, Map<String, String> mapaInput){
        List<String> ar=new ArrayList<>(); // Лист для результата
        for (int i = 0; i < parsedInput1.size(); i++) {
            if (mapaInput.keySet().contains(parsedInput1.get(i))) {
                String str;
                str = mapaInput.get(parsedInput1.get(i));
                ar.add(str);
            }if (!(mapaInput.keySet().contains(parsedInput1.get(i)))){
                ar.add(parsedInput1.get(i));
            }
        }
        System.out.println("Исходный текст:       "+parsedInput1);
        System.out.println("Текст после перевода: "+ar);
        return ar;
    }


}
