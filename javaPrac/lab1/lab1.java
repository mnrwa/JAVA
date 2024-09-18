package lab1;

import java.util.Random;
import java.util.*;

//вариант 1

public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        Random rand = new Random();

        System.out.println("Введите количество элементов:");
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(1000);
        }


        int min = array[0];
        int max = array[0];


        List<Integer> divisionOn3Or9 = new ArrayList<>();
        List<Integer> divisionOn5And7 = new ArrayList<>();

        System.out.println("Четные и нечетные числа:");
        for (int i = 0; i < n; i++) {

            if (array[i] % 2 == 0) {
                System.out.println("array[" + i + "] = " + array[i] + " - Четное число");
            } else {
                System.out.println("array[" + i + "] = " + array[i] + " - Нечетное число");
            }

            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }

            if (array[i] % 3 == 0 || array[i] % 9 == 0) {
                divisionOn3Or9.add(array[i]);
            }

            if (array[i] % 5 == 0 && array[i] % 7 == 0) {
                divisionOn5And7.add(array[i]);
            }
        }

        System.out.println("\nМаксимальный элемент в массиве: " + max);
        System.out.println("Минимальный элемент в массиве: " + min);

        System.out.println("\nЧисла, которые делятся на 3 или на 9:");
        for (int num : divisionOn3Or9) {
            System.out.println(num);
        }

        System.out.println("\nЧисла, которые делятся на 5 и на 7:");
        for (int num : divisionOn5And7) {
            System.out.println(num);
        }

        System.out.println("\nВсе трехзначные числа, в десятичной записи которых нет одинаковых цифр:");
        for (int i = 0; i < n; i++) {
            if ((array[i] >= 100 && array[i] <= 999)
                    && (array[i] / 100 != (array[i] / 10) % 10
                    && (array[i] / 10) % 10 != array[i] % 10
                    && array[i] % 10 != array[i] / 100)) {
                System.out.println(array[i]);
            }
        }

        System.out.println("\nПростые числа:");

        class Prime {
            private int number;
            private boolean flag = true;

            public void setNumber(int number) {
                this.number = number;
            }

            public boolean isFlag(int num) {

                if (num <= 1)
                    return false;
                for (int i = 2; i < num / 2; i++) {
                    if (num % i == 0)
                        return false;
                }
                return true;

            }
        }
        Prime prime = new Prime();
        for (int i = 0; i < array.length; i++) {
            prime.setNumber(array[i]);
            if (prime.isFlag(array[i])) {
                System.out.println(array[i]);
            }
        }

        Arrays.sort(array);
        System.out.println("\nОтсортированные числа по возрастанию:");
        for (int num : array) {
            System.out.println(num);
        }

        System.out.println("\nОтсортированные числа по убыванию:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(10);
            System.out.print(" " + array[i]);
        }




        System.out.println("\nЧисла в порядке убывания частоты встречаемости:");

        Arrays.sort(array);
        int maxSize = array[array.length-1];
        System.out.println(maxSize+" maxSize");

        int [] freq = new int[maxSize+1];

        for (int i = 0; i <= maxSize; i++) {
            freq[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            freq[array[i]]++;
        }

        for (int i = 0; i <= maxSize; i++) {
            for (int j = i + 1; j <= maxSize; j++) {
                if (freq[i] < freq[j]) {
                    int tempFreq = freq[i];
                    freq[i] = freq[j];
                    freq[j] = tempFreq;

                    int tempElement = i;
                    i = j;
                    j = tempElement;
                }
            }
        }

        for (int i = 0; i <= maxSize; i++) {
            if (freq[i] > 0) {
                System.out.println("Элемент " + i + " встречается " + freq[i] + " раз");
            }
        }






        System.out.println("\n«Счастливые» числа:");
        for (int number : array) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            if (number == 7) {
                System.out.println(number);
            }
        }


        System.out.println("\nЧисла-палиндромы:");





















        sc.close();



    }

}

