package Java_I;
import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter an Integer:\n");
        int integer = scanner.nextInt();
        System.out.println("your int = " + integer);

    }
}
