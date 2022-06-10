package HomeTasck.Tasck0506.Check;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Field {

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_WHITE = "\u001B[38m";
    public static final String ANSI_GREEN = "\u001B[92m";


    ArrayList<String> listKey = new ArrayList<>();
    ArrayList<String> listValues = new ArrayList<>();
    Map<String, String> map = new HashMap<String, String>();


    public void move() {

        //Добавляем значение ключа в мапу для вывода букв для обозначения клеток
        String widthField = ANSI_GREEN + "   a    b    c    d    e    f    g    h";
        map.put("width", widthField);
        // Выводим буквы клеток(ширина)
        for (char i = 'a'; i <= 'h'; i++) {
            //widthField+=i;
            System.out.print(ANSI_GREEN + ("    " + i));
        }

        // Заполняем ЛистКлючей возможными клеточками
        String str;
        for (int i = 1; i <= 8; i++) {
            for (char j = 'a'; j <= 'h'; j++) {
                str = String.valueOf(j);
                listKey.add(str + i);
                widthField += j;
            }
        }

        System.out.println();
        //Создание поля и нумерация их
        for (int k = 0; k < 8; k++) {                       // Выводим номер столбца
            System.out.print(ANSI_GREEN + ((k + 1) + " "));
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0) {
                    if (k % 2 == 0) {
                        System.out.print(ANSI_WHITE + "  0  ");
                        listValues.add(ANSI_WHITE + "  0  ");
                    } else {
                        System.out.print(ANSI_BLACK + "  #  ");
                        listValues.add(ANSI_BLACK + "  #  ");
                    }
                }
                if (i % 2 != 0) {
                    if (k % 2 != 0) {
                        System.out.print(ANSI_WHITE + "  0  ");
                        listValues.add(ANSI_WHITE + "  0  ");
                    } else {
                        System.out.print(ANSI_BLACK + "  #  ");
                        listValues.add(ANSI_BLACK + "  #  ");
                    }
                }
            }
            System.out.println();
        }

        // заполняем мапу Ключами и значениями
        for (int i = 0; i < listKey.size(); i++) {
            map.put(listKey.get(i), listValues.get(i));
        }
    }

    public ArrayList<String> getList() {
        return listKey;
    }

    public Map<String, String> getMap() {
        return map;
    }
}
