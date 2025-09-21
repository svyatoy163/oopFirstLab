class MyFirstClass {
    public static void main(String[] args) {
        // Создание и инициализация объекта "o" типа MySecondClass
        MySecondClass o = new MySecondClass(0, 0);
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

class MySecondClass {
    // Два приватных поля типа int
    private int firstNumber;
    private int secondNumber;
    
    // Конструктор, создающий объект и инициализирующий значения полей
    public MySecondClass(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    
    // Методы для получения значений полей
    public int getFirstNumber() {
        return firstNumber;
    }
    
    public int getSecondNumber() {
        return secondNumber;
    }
    
    // Методы для модификации значений полей
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }
    
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
    
    // Метод, реализующий битовое "И" над числами
    public int bitwiseAnd() {
        return firstNumber & secondNumber;
    }
}