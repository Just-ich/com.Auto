package HomeTasck.Tasck0506.Check;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class GameService {

    public static final String ANSI_RED = "\u001B[91m";
    public static final String ANSI_GREEN = "\u001B[92m";
    public static final String ANSI_WHITE = "\u001B[38m";
    public static final String ANSI_YELLOU = "\u001B[93m";

    boolean get_Of_Field = true;                // для зацикливания игры
    boolean begin_Position = true;
    boolean end_Position = true;
    String beginMove;                            // для записи начальной позиции
    String endMove;                              // для записи конечной позиции
    String str = "";                               // для записи нумерации полей
    String horseBeginMove = ANSI_RED + "  K  ";      // значение для записи начальной позиции
    String horseEndMove = ANSI_YELLOU + "  K  ";     // значение для записи конечной позиции
    String tempKeyBegin = "";                      // временное хранение ключа изначального значения начальной позиции
    String tempValuesBegin = "";                   // временное хранение значения изначального значения начальной позиции
    String tempKeyEnd = "";                        // временное хранение ключа изначального значения начальной позиции
    String tempValuesEnd = "";                     // временное хранение значения изначального значения начальной позиции

    Field field = new Field();

    public void play_Game() {
        System.out.println(ANSI_RED + "\n  K  --- Начальная позиция коня" +
                           ANSI_YELLOU + "\n  K  --- Текущая позиция коня" +
                           ANSI_WHITE + "\nExit/exit --- выйти из игры\n");
        field.move();
        try {
            while (get_Of_Field) {
                position();
            }
        } catch (InputMismatchException e) {
            System.out.println("   Выберите цифру!   ");
            play_Game();
        }
    }

    public void position() {
        while (begin_Position) {
            System.out.println("\nВыберите начальную позицию фигуры");
            Scanner begin_Move = new Scanner(System.in);
            beginMove = begin_Move.nextLine();
            if (field.map.containsKey(beginMove)) {
                tempKeyBegin = beginMove;                         // временное хранение ключа изначального значения начальной позиции
                tempValuesBegin = field.map.get(beginMove);       // временное хранение значения изначального значения начальной позиции
                field.map.put(beginMove, horseBeginMove);         // отображение начальной позиции
                begin_Position = false;
            } else {
                System.out.println("Нет такого поля, попробуйте ещё раз");
            }
        }

        while (end_Position) {
            Scanner end_Move = new Scanner(System.in);
            endMove = end_Move.nextLine();
            if (endMove.equals("exit") || endMove.equals("Exit")) {
                System.exit(0);
            }
            if (field.map.containsKey(endMove)) {
                tempKeyEnd = endMove;                           // временное хранение конечного значения ключа конечной позиции
                tempValuesEnd = field.map.get(endMove);         // временное хранение конечного значения конечной позиции
                field.map.put(endMove, horseEndMove);           // отображение конечной позиции
                wiwodDoskiIzMapi();                             // вывод поля с подкрашиванием позицийф
                field.map.put(tempKeyBegin, tempValuesBegin);  // возвращаем изначальное значени начальной клетки
                field.map.put(tempKeyEnd, tempValuesEnd);  // возвращаем изначальное значени конечной клетки
            } else {
                System.out.println("Такой ход не возможен, попробуйте ещё раз");
            }
        }
    }

    void control_Move() {

    }

    void wiwodDoskiIzMapi() {
        System.out.println(field.map.get("width"));
        for (int i = 1; i <= 8; i++) {
            str = "";
            System.out.print(ANSI_GREEN + i);
            for (char k = 'a'; k <= 'h'; k++) {
                str = String.valueOf(k) + i;
                System.out.print(ANSI_WHITE + field.map.get(str));
            }
            System.out.println();
        }
    }
}

