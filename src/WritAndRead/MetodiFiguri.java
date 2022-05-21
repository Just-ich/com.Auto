package WritAndRead;

public class MetodiFiguri {

    //Создать методы:
    //вычисления площади и периметра фигуры; составляют ли точки прямоугольник(не лежат
    //ли три точки на одной прямой); является ли четырехугольник выпуклым; является ли
    //прямоугольник квадратом, ромбом, трапецией.

    public void PloschadAndPerimetr(int finalLines, int sizeString){
        int S, P;
        S=finalLines*sizeString;
        P=(finalLines+sizeString)*2;
        System.out.println("\n"+"Площадь фигуры(прямоугольник)= "+S);
        System.out.println("Периметр фигуры(прямоугольник)= "+P);
    }


    public void WipuklNeWipukl(String[] wordsArray){
        String q="*";
     
        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray.length==wordsArray[i].length()){
                System.out.println(" AAAAAAAAAAAAAAAAAAA");
            }
        }
    }
}
