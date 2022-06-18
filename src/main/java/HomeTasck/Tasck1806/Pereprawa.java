package HomeTasck.Tasck1806;

import java.util.Scanner;

public class Pereprawa {
    double heftAutoInParom = 0;
    double sAutoInParom = 0;
    double countAuto = 0;
    int zahodParoma=0;
    double ostAuto;
    boolean stopParom = true;


    public void pereprawa1() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        Parom parom = new Parom(100, 250);

        System.out.println("Введите массу одного авто");
        double autoHeft = scanner.nextDouble();

        System.out.println("Введите площадь oдного автомобиля");
        double ploschchadAuto = scanner.nextDouble();
        Auto auto=new Auto(autoHeft, ploschchadAuto);

        System.out.println("Введите кол-во авто");
        double kol_woAuto = scanner.nextDouble();

        while (stopParom) {
            while (kol_woAuto != 0) {
                if (parom.maxHeftParom > heftAutoInParom && parom.ploschchadParom > sAutoInParom ) {
                    heftAutoInParom += auto.autoHeft;
                    sAutoInParom += auto.ploschchadAuto;
                    countAuto++;

                } else {

                    ostAuto = kol_woAuto - countAuto;
                    kol_woAuto -= countAuto;
                    heftAutoInParom=0;
                    sAutoInParom=0;

                    if (ostAuto<0) {
                        ostAuto=0;
                    }

                    System.out.println("\n Количество авто на пароме " + countAuto +
                            "\n количество оставшихся авто " + ostAuto +
                            "\n Паром уплыл, будет через 5 минут");
                    countAuto=0;
                    zahodParoma++;
                    for (int j = 1; j <= 5; j++) {
                        System.out.print(j + " ");
                        Thread.sleep(500);
                    }

                    if (ostAuto == 0) {
                        stopParom = false;
                        break;
                    }
                }
            }
        }
        System.out.println("\n\n" +"Все автомобили переправлены"+
                "\nКол-во заплывов парома "+zahodParoma);
    }
}
