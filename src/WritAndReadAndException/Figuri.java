package WritAndReadAndException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Figuri {
    public void Fig() throws IOException {


//        // записываем данные в файл
//        File file1 = new File("P.txt");
//        PrintWriter pw = new PrintWriter(file1);
//        pw.println("*************\n" +
//                "* sdfd      *\n" +
//                "54*         *\n" +
//                "*           *\n" +
//                "*           *\n" +
//                "34gdsv*******\n" +
//                "3876587678sv*******\n" +
//                "*************");
//        pw.close();

        // Узнаём кол-во строк в файле
        BufferedReader reader = new BufferedReader(new FileReader("P.txt"));
        int lines = 0;
        while (reader.readLine() != null) lines++;
        reader.close();

        //создаём ArrayList; массив строк и записываем каждую строку в массив строк
        File file = new File("P.txt");
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(file);

        System.out.println(file.isFile());
        String[] str = new String[lines];
        int counter = 0;
        while (scanner.hasNextLine()) {
            str[counter] = scanner.nextLine();
            counter++;
        }
        scanner.close();

        //проверяем массив строк на наличие букв и цифр
        int numberChar = 0, numberLine;
        for (int j = 0; j < str.length; j++) {                                                 // выбор строки прохода
            char[] strToArray = str[numberChar].toCharArray();                             // создание массива чаров из строки
            list.add(str[numberChar]);                                                     // записываем строку в ArrayList
            for (int k = 0; k < str[0].length(); k++) {                                    // проверяем массив чаров на наличие букв и цифр
                if (Character.isLetter(strToArray[k]) || Character.isDigit(strToArray[k])) {   // сама проверка на наличие букв и цифр
                    numberLine = j + 1;
                    System.out.println("Есть буква, цифра --- номер строки " + numberLine);      // вывод строки в которой есть буква или число
                    list.remove(str[numberChar]);                                              // удаление строки с буквой или цифрой
                    break;
                }
            }
            numberChar++;
        }
        System.out.println(" ");


        // вывод полученного результата
        String[] wordsArray = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            wordsArray[i] = list.get(i);
            System.out.println(wordsArray[i]);
        }

        //вызываем метод подсчёта S и P
        int finalLines = lines;
        int sizeString = str[0].length();
        MetodiFiguri metodiFiguri = new MetodiFiguri();
        metodiFiguri.PloschadAndPerimetr(finalLines, sizeString);

        //вызов метода проверки на выпуклость
        metodiFiguri.WipuklNeWipukl(wordsArray);
    }
}