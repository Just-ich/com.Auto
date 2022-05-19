package WritAndRead;

import WritAndRead.Exception.SimpleException;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, NullPointerException {


       // File file = new File("P.txt");


//        PrintWriter pw = new PrintWriter(file);
//
//        pw.println("*************\n" +
//                "* sdfd      *\n" +
//                "54*         *\n" +
//                "*           *  \n" +
//                "*           *\n" +
//                "34gdsv*******\n" +
//                "*************");
//        pw.close();

        File file = new File("P.txt");
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        System.out.println(file);
        String[] str = new String[8];  // цифра 8 это кол-во строк в файле
        int counter = 0;
        while (scanner.hasNextLine()) {
            //list.add(scanner.nextLine());
            str[counter] = scanner.nextLine();

            counter++;
        }
        scanner.close();


        int numberChar=0, numberLine;
        for (int j = 0; j < str.length; j++) {
                char[] strToArray = str[numberChar].toCharArray();
                list.add(str[numberChar]);
                for (int k = 0; k < str[0].length(); k++) {
                    if (Character.isLetter(strToArray[k]) || Character.isDigit(strToArray[k]) ) {
                        numberLine=j+1;
                        System.out.println("Есть буква, цифра --- номер строки "+numberLine);
                        list.remove(str[numberChar]);
                        break;
                    }
                }
            numberChar++;
        }
        System.out.println("\n"+list);
    }
}

















//        String input = "./Resurses/input.txt";
//        String output = "./Resurses/output.txt";
//
//        Read read=new Read();
//        Write write=new Write();
//        List<String> list;
//
//        try {
//            list=read.readAll(input);
//            System.out.println(list);
//            for (String a: list) {
//                System.out.println(a.toString().split(","));
//            }
//            write.writeAll(output, list);
//            System.out.println(list);
//        }catch (SimpleException e){
//            throw new SimpleException("Exception Main", e);
//        }

