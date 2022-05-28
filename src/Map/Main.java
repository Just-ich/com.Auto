package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Dz2805 dz=new Dz2805();
        dz.dz28051();
        //dz.dz28052();
        //dz.dz28053();



/* Занятие 28,05,22
        Map<String, User> map=new HashMap<>();

        User user=new User("Iwan", "Iwanow", 56, "+375259632236");
        User user1=new User("Walera", "Stepanow", 76, "+375259635486");
        User user2=new User("Petja", "Xiaomi", 16, "+375257512386");

        map.put(user.getPhoneNumber(), user);
        map.put(user1.getPhoneNumber(), user1);
        map.put(user2.getPhoneNumber(), user2);

        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();



        for (Map.Entry<String, User> entry: map.entrySet()){
            if (entry.getKey().equals(s)){
                System.out.println(entry);
                String a=scanner.nextLine();
                entry.getValue().setPhoneNumber(a);
                map.remove(entry);
                map.put(entry.getValue().getPhoneNumber(), entry.getValue());
            }
        }
        System.out.println(map);


//        map.put(1,"Ivanov");
//        map.put(2,"Petrov");
//        map.put(3,"Sidorov");
//
//        System.out.println(map.get(1));
//        System.out.println(map.values());
//        System.out.println(map.keySet());
//
//        map.replace(2, "Vasilew");
//        System.out.println(map);
//
//
//        for (Map.Entry<Integer, String> entry: map.entrySet()){
//            entrySet
//        }
//
*/
    }
}
