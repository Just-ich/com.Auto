package HomeTasck.Tasck1806;

import java.util.Scanner;

class MyThread implements Runnable {

    public void run() {

        Scanner scanner = new Scanner(System.in);
        double heftAutoInParom = 0;
        double countAuto = 0;

        System.out.println("Введите максимальную грузоподъёмность парома");
        double maxHeftParom = scanner.nextDouble();
        maxHeftParom += 15;// вес самого парома
        Parom parom = new Parom(maxHeftParom);

        System.out.println("Введите массу одного авто");
        double autoHeft = scanner.nextDouble();
        System.out.println("Введите кол-во авто");
        int kol_woAuto = scanner.nextInt();
        Auto auto = new Auto(autoHeft, kol_woAuto);

        for (int i = 0; i <= auto.kol_woAuto; i++) {
            heftAutoInParom += auto.autoHeft;
            if (parom.maxHeftParom > heftAutoInParom) {
                countAuto++;
            }
        }
        System.out.println("Amount auto " + countAuto);
        System.out.println("Queue auto " + (auto.kol_woAuto - countAuto));

    }
}
