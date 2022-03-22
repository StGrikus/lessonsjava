import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("введите какое-то число");
            int x = s.nextInt();
            System.out.println("вы ввели " + x);
        }
    }
}
