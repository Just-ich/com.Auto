package HomeTasck.Tasck0406;

import java.util.Scanner;

public class Tasck0406 {    public void homeTasck(){
    //        //ДЗ
//        // 1)Задана последовательность, состоящая только из символов ‘>’, ‘<’ и ‘-‘.
//        // Требуется найти количество стрел, которые спрятаны в этой последовательности.
//        // Стрелы – это подстроки вида ‘>>-->’ и ‘<--<<’.
//
//
//        String str = ">>--><--<<<--<<>>--><--<<<--<<>>--><--<<<--<<>>--><--<<<--<<";
//        String strResult = "";
//        String left = "<--<<";
//        String right = ">>-->";
//
//        int countLeft = 0, countRight = 0;
//        char[] chars = str.toCharArray();
//        for (int i = 0; i < chars.length; i += left.length()) {   // ч/з каждые кол-во символов стрелы добавляем пробел
//            for (int j = 0; j < left.length(); j++) {             // для последуещего разбиения строки на подстроки
//                strResult += chars[j + i];
//            }
//            strResult += " ";
//        }
//
//
//        List<String> list = new ArrayList();
//        for (int i = 0; i < 1; i++) {
//            list = List.of(strResult.split(" "));
//            for (var x : list) {
//                if (x.equals(left)) {
//                    countLeft++;
//                }
//                if (x.equals(right)) {
//                    countRight++;
//                }
//            }
//        }
//        System.out.println(left + " " + countLeft + " шт.");
//        System.out.println(right + " " + countRight + " шт.");
//        System.out.println(list);


    //2)Дано число n, найти кол-во простых чисел в промежутке от n до 2n(не включая их) - Постулат Бертрана


    int chislo;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число ");
    chislo =scanner.nextInt();
    for (int i = chislo+1; i < chislo*2; i++) {
        if (i%2==0 && i!=2 || i==1 || i%3==0 || i%5==0){
            continue;
        }
        System.out.println(i);
    }
}
}
