import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите животное из списка: ");
        System.out.println("1 – кошка");
        System.out.println("2 – собака");
        System.out.println("3 – лев");
        System.out.println("4 – тигр");
        System.out.println("5 – лошадь");
        System.out.println("6 – корова");
        System.out.println("7 – заяц");
        System.out.println("8 – мышь");
        System.out.println("9 – обезьяна");
        System.out.println("10 – слон");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Кошка издает мяуканье");
                break;
            case 2:
                System.out.println("Собака издает лай");
                break;
            case 3:
                System.out.println("Лев издает рев");
                break;
            case 4:
                System.out.println("Тигр издает рычание");
                break;
            case 5:
                System.out.println("Лошадь издает фырканье");
                break;
            case 6:
                System.out.println("Корова издает мычание");
                break;
            case 7:
                System.out.println("Заяц издает писк");
                break;
            case 8:
                System.out.println("Мышь издает шурчание");
                break;
            case 9:
                System.out.println("Обезьяна издает визг");
                break;
            case 10:
                System.out.println("Слон издает трубный зов");
                break;
            default:
                System.out.println("Выбрано некорректное животное");
        }
    }
}