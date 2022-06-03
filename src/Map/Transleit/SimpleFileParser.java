package Map.Transleit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleFileParser {

    public List<List<String>> parse(List<String> list){
        List<List<String>> result = new ArrayList<>();
        for (var elem : list){
            List<String> temp = List.of(elem.split(" "));
            result.add(temp);
        }
        return result;
    }
    public List<String> par(List<String> transleit){
        List<String> temp=new ArrayList<>();
        for (var elem : transleit){
            temp = List.of(elem.split(" "));
        }
        return temp;
    }
}

