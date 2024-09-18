package lab1;

public class A1 {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Здравствуйте,"+ name );
        } else {
            System.out.println("Пожалуйста, укажите имя в аргументах командной строки.");
        }
    }
}
