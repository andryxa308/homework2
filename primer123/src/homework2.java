import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("зима");
        }
        else if (month == 3 || month == 4 || month == 5) {
            System.out.println("весна");
        }
        else if (month == 6 || month == 7 || month == 8) {
            System.out.println("лето");
        }
        else {
            System.out.println("осень");



        }
    }
}