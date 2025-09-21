package myfirstpackage;

public class MyFirstPackage {
    // Два приватных поля типа int
    private int firstNumber;
    private int secondNumber;
    
    // Конструктор, создающий объект и инициализирующий значения полей
    public MyFirstPackage(int firstNumber, int secondNumber) {
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