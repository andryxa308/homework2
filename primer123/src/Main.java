import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        switch (month) {
            case 1 -> System.out.println("январь(зима)");
            case 2 -> System.out.println("февраль(зима)");
            case 3 -> System.out.println("март(весна)");
            case 4 -> System.out.println("апрель(весна)");
            case 5 -> System.out.println("май(весна)");
            case 6 -> System.out.println("июнь(лето)");
            case 7 -> System.out.println("июль(лето)");
            case 8 -> System.out.println("август(лето)");
            case 9 -> System.out.println("сентябрь(осень)");
            case 10 -> System.out.println("октябрь(осень)");
            case 11 -> System.out.println("ноябрь(осень)");
            case 12 -> System.out.println("декабарь(зима)");
            default -> System.out.println("defaul");

        }
    }
}
