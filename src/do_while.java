import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int value;
            do{
                System.out.println("Введите 5");
                value = scanner.nextInt();
            } while(value!=5);
        }
        System.out.println("Вы ввели 5");
    }
}
