package lab1;

public class A5 {
    public static void main(String[] args) {
        int totalSum = 0;
        int totalProduct = 1;

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                int sum = 0;
                int mult = 1;

                while (num != 0) {
                    int digit = num % 10;
                    sum += digit;
                    mult *= digit;
                    num /= 10;
                }

                System.out.println("Для числа" + arg );
                System.out.println("Сумма цифр:" + sum);
                System.out.println("Произведение цифр:" + mult);
                System.out.println();

                totalSum += sum;
                totalProduct *= mult;

            } catch (NumberFormatException e) {
                System.out.println("Неверный формат числа для аргумента: " + arg);
            }
        }

        System.out.println("Общая сумма всех цифр: " + totalSum );
        System.out.println("Общее произведение всех цифр: " + totalProduct);
    }
}
