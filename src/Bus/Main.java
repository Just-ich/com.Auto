package Bus;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bus bus=new Bus.Builder().withNumberBus(3).withEmblema('#').withKolwoMest(15).withMarschrut("Minsk--Brest").build();
        System.out.println(bus.toString());



//        while (true) {
//            System.out.println("\n1 - Добавить пассажира" +
//                    "\n2 - Удалить пассажира" +
//                    "\n3 - Вывести список пассажиров" +
//                    "\n4 - Выйти \n");
//            Scanner scanner = new Scanner(System.in);
//            switch (scanner.nextInt()) {
//                case 1:
//                    ArrayList<String> passengers=new Passengers.Builder().addPas();
//                    System.out.println(passengers.toString());
//                    break;
//                case 2:
//                    ArrayList<String> passengers1=new Passengers.Builder().withPas().build();
//                    System.out.println(passengers1.toString());
//                    break;
//                case 3:
//                    Passengers passengers2=new Passengers();
//                    passengers2.List();
//                case 4:
//                    return;
//
//            }
//        }
    }
}
