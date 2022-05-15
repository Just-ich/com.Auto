package BuildAuto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nВыберите какую машину будем собирать: \n" +
                    "1 - BuildAuto.BMW\n" +
                    "2 - BuildAuto.Mersedes\n" +
                    "3 - Exit this Fabric\n");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    BuildAuto buildAutoBMW = new BuildAuto();
                    buildAutoBMW.createAuto(Auto.BuildAutoType.BMW);
                    break;

                case 2:
                    BuildAuto buildAutoMersedes = new BuildAuto();
                    buildAutoMersedes.createAuto(Auto.BuildAutoType.Mersedes);
                    break;

                case 3:
                    return;
            }
        }
    }
}
