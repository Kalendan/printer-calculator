package printer;

public class ConsolePrinter implements Printer {
@Override
    public void print(double result) {
        System.out.printf("Ваш результат равен: %.2f", result);
    }
}