package WritAndReadAndException;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Figuri figuri=new Figuri();
        figuri.getClass();

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

