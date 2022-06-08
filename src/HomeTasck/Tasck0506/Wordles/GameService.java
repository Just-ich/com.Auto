package HomeTasck.Tasck0506.Wordles;

import java.util.ArrayList;
import java.util.Scanner;

public class GameService {

    public static final String ANSI = "\u001B[01m";
    public static final String ANSI_GREEN = "\u001B[92m";
    public static final String ANSI_YELLOW = "\u001B[93m";
    public static final String ANSI_RED = "\u001B[91m";
    public static final String ANSI_WHITE = "\u001B[38m";

    public void game() {
        String word;
        String word_User;

        //Создаём списки для символов из слов ведущего и игрока
        ArrayList<Character> word_List = new ArrayList<>();
        ArrayList<Character> word_User_List = new ArrayList<>();

        System.out.println(ANSI+"Игра Wordles - угадай слово!\n" +
                ANSI_GREEN+"Буква и её место совпадают с буквой и местом в загаданном слове\n" +
                ANSI_YELLOW+"Буква есть в слове но стоит не на своём месте\n" +
                ANSI_RED+"Буквы нет в слове\n" +
                ANSI_WHITE+"Загадайте слово из 5-ти букв");
        Scanner word_Scan = new Scanner(System.in);
        word = word_Scan.nextLine();
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); // можно добавить, чтобы
        // игрок не видел, что ввёл ведущий
        for (int i = 0; i < word.length(); i++) {
            word_List.add(word.charAt(i));
        }

        System.out.println();

        System.out.println("Попробуйте угадать слово, у вас 6 попыток");
        for (int i = 1; i < 7; i++) {

            word_User_List.clear();
            System.out.println("\n"+ANSI_WHITE + "Попытка № " + i);
            Scanner word_User_Scan = new Scanner(System.in);
            word_User = word_User_Scan.nextLine();
            for (int j = 0; j < word_User.length(); j++) {
                word_User_List.add(word_User.charAt(j));
            }

            if (word_List.equals(word_User_List)) {
                System.out.println("Поздравляем вы угадали слово --- " + word);
                i = 7;
            }

            // Проводим сравнение букв в слове и в зависимости от наличия буквы в слове игрока и позоции
            // Выводится слово с буквами определённого цвета
            for (int j = 0; j < word_List.size(); j++) {
                // Проверка, что буква и её позиция совпадают в слове ведущего и игрока,
                // обозначается зелёным цветом
                if (word_List.get(j).equals(word_User_List.get(j))) {
                    System.out.print(ANSI_GREEN + word_User_List.get(j));
                    continue;
                    // Проверка, что в слове игрока есть буква из слова ведущего но она
                    // не на своём месте, обозначается жёлтым цветом
                } else if (!(word_List.get(j).equals(word_User_List.get(j))) && word_List.contains(word_User_List.get(j))) {
                    System.out.print(ANSI_YELLOW + word_User_List.get(j));
                    continue;
                }
                //Проверка, что нет буквы в слове, обозначается красным цветом
                System.out.print(ANSI_RED + word_User_List.get(j));
            }
        }
    }
}

