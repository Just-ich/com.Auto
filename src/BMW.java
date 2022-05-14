import java.util.Scanner;

public class BMW extends Auto implements Build{




    public void WiborDeistwija(){
        System.out.println("\nВыберите какую часть машины создать: \n" +
                "1 - Создать двигатель\n" +
                "2 - Создать раму\n");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()){
            case 1:
                BuildDwigatel();
                break;
            case 2:
                BuildRama();
                break;
        }
    }


    @Override
    public void BuildRama() {
        System.out.println("Сборка раммы BMW ");
    }

    @Override
    public void BuildDwigatel() {
        System.out.println("Сборка двигателя BMW ");

    }
}
