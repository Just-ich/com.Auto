package Map;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//
//1) С помощью HashMap посчитать количество использований каждого слова в строке
//        Пример:
//        Ввод Current task posted for Java developers developers
//        Вывод {Java=1, task=1, developers=2, for=1, Current=1, posted=1}

public class Dz2805 {

    // ДЗ №1
    public void dz28051() {

        Map<String, Integer> first = new HashMap<>();
        String str = "Current task posted posted for Java developers developers posted";
        String[] words = str.split(" ");
        String string;
        for (int i = 0; i < words.length; i++) {

            string=words[i];
            if (!first.containsKey(string)) {
                first.put(string, 1);
            } else
                first.put(string, first.get(string) + 1);
        }
        System.out.println(first.entrySet());
    }

    // ДЗ №2
    public void dz28052() {

        Map<Integer, Integer> map = new HashMap<>();
        SecureRandom random = new SecureRandom();
        int genereit;

        for (int i = 0; i < 20; i++) {
            genereit = random.nextInt(26);
            if (!map.containsKey(genereit)) {
                map.put(genereit, 1);
            } else
                map.put(genereit, map.get(genereit) + 1);
            System.out.println(genereit);
        }
        System.out.println(map.entrySet());
    }

    // ДЗ №3
    public void dz28053() {
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        map1.put(1, "Hi");
        map1.put(2, "By");
        map1.put(3, "Nice");
        map1.put(5, "Ok");


        map2.put(2, "If");
        map2.put(3, "For");
        map2.put(4, "Else");

        System.out.println(map1.entrySet());
        System.out.println(map2.entrySet());
        System.out.println();

        int schet = 0;
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                String str;
                schet++;
                str = map1.get(entry.getKey());
                map1.put(entry.getKey(), map2.get(entry.getKey()));
                map2.put(entry.getKey(), str);
            }
        }
        System.out.println(map1.entrySet());
        System.out.println(map2.entrySet());
        System.out.println("Всего замен: " + schet);
    }
}
