import java.util.Scanner;

public class homework5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер ");
        int color = scanner.nextInt();
        switch (color) {
            case 1 -> System.out.println("желтый");
            case 2 -> System.out.println("красный");
            case 3 -> System.out.println("зеленый");
            case 4 -> System.out.println("оранжевый");
            case 5 -> System.out.println("голубой");
            case 6 -> System.out.println("синий");
            case 7 -> System.out.println("фиолетовый");
            default -> System.out.println("defaul");

        }
    }
}
