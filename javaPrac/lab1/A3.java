package lab1;

import java.util.Random;
import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Введите количество случайных чисел: ");
        int n = sc.nextInt();

        System.out.println("Выберите формат вывода: 1 - без перехода на новую строку, 2 - с переходом на новую строку");
        int format = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int k = rand.nextInt(100);
            if (format == 1) {
                System.out.print(k + " ");
            } else if (format == 2) {
                System.out.println(k);
            } else {
                System.out.println("Неверный формат. Пожалуйста, выберите 1 или 2.");
                break;
            }
        }
    }
}
