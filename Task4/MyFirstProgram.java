import myfirstpackage.*;

public class MyFirstProgram {
    public static void main(String[] args) {
        // Класс MyFirstProgram
    }
}

class MyFirstClass {
    public static void main(String[] args) {
        // Создание и инициализация объекта "o" типа MyFirstPackage
        MyFirstPackage o = new MyFirstPackage(0, 0);
        
        System.out.println(o.bitwiseAnd());
        
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setFirstNumber(i);
                o.setSecondNumber(j);
                System.out.print(o.bitwiseAnd());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}