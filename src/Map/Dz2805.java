package Map;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;


//1) С помощью HashMap посчитать количество использований каждого слова в строке
//        Пример:
//        Ввод Current task posted for Java developers developers
//        Вывод {Java=1, task=1, developers=2, for=1, Current=1, posted=1}
//        2) Сгенерируете 100 случайных чисел от 1 до 25 и посчитайте сколько раз сгенерировалось каждое число
//        Пример:
//        Ввод 1 2 3 1 4 5 5 2 5
//        Вывод {1=2,2=2,3=1,4=1,5=3}
//        3)Есть 2 HashMap<Integer,String>, поменять местами значения из 1 и 2 мапы у которых равные ключи, посчитать кол-во замен
//        Ввод
//        1 - Hi     2 - If
//        2 - By	   3 - For
//        3 - Nice   4 - Else
//        5 - Ok
//
//        Вывод
//        1 - Hi     2 - By
//        2 - If     3 - Nice
//        3 - For    4 - Else
//        5 - Ok
//
//        Было произведено 2 замены

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
