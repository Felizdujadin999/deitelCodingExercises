package tdd;

public class Kata {
    public int squareof(int number) {
        return number * number;
    }

    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public int max(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) return firstNumber;
        return secondNumber;
    }
}