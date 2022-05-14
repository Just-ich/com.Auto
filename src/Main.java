import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nВыберите какую машину будем собирать: \n" +
                    "1 - BMW\n" +
                    "2 - Mersedes\n" +
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
