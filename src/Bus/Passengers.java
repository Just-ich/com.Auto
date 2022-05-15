package Bus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Passengers {

    public void List() {
        ArrayList<String> list = new ArrayList<>();

    }
    public static class Builder {
        private ArrayList<String> newArrayList=new ArrayList<>();

//        public Builder() {
//             newArrayList= new ArrayList<>();
//        }

        public ArrayList<String> addPas(){
            int a=0;
            while (a>0) {
                System.out.println("\n1 - Добавить пассажира" +
                        "\n2 - Выйти \n");
                Scanner scanner = new Scanner(System.in);
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Введите имя пассажира ");
                        Scanner scanAdd = new Scanner(System.in);
                        String s = scanAdd.nextLine();
                        newArrayList.add(s);
                        List.copyOf(newArrayList);

                        break;
                    case 2:
                        a=1;
                        break;
                }
            }
           // System.out.println(newArrayList);
            return newArrayList;
        }

        public Builder withPas(){
//            int z=0;
//            while (z>0) {
//                System.out.println("\n1 - Удалить пассажира" +
//                        "\n2 - Выйти \n");
//                Scanner scanner = new Scanner(System.in);
//                switch (scanner.nextInt()) {
//                    case 1:
                        System.out.println("Введите номер пассажира ");
                        Scanner scanMinus = new Scanner(System.in);
                        int a = scanMinus.nextInt() - 1;
                        newArrayList.remove(a);
                        List.copyOf(newArrayList);
//                        break;
//                    case 2:
//                        z=0;
//                        break;
//                }
//            }
           // System.out.println(newArrayList);
            return this;
        }

        public ArrayList<String> build(){
            return newArrayList;
        }





    }



}
