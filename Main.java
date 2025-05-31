import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int x = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите год в формате yyyy: ");
            int years = scanner.nextInt();
            System.out.println("Введите количество дней: ");
            int days = scanner.nextInt();

            if (years % 400 == 0 && days == 366) {
                i++;
            } else if (years % 100 == 0 && days == 365) {
                i++;
            } else if (years % 4 == 0 && days == 366) {
                i++;
            } else if (years % 400 > 0 && days == 365) {
                i++;
            } else if (years % 4 > 0 && days == 365) {
                i++;
            }
            if (i > 0) {
                i = 0;
                x++;
            } else break;
        }
        System.out.println("Набрано очков: " + x);
    }

}
