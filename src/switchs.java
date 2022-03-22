import java.util.Scanner;

public class switchs {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите возраст");
            int age = scanner.nextInt();
            switch (age) {
                case 0:
                    System.out.println("Ты родился");
                    break;
                case 7:
                    System.out.println("Ты пошел в школу");
                    break;
                case 18:
                    System.out.println("Ты закончил школу");
                    break;
                default:
                    System.out.println("Ни один из вариантов не подошел");
                    // switch может принимать строковые изменения "слова"
            }
        }
    }
}
