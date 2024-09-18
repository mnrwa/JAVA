package lab1;

public class A2 {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Аргументы в обратном порядке:");
            for (int i = args.length - 1; i >= 0; i--) {
                System.out.print(args[i]);
            }
            System.out.println();
        } else {
            System.out.println("Аргументы не предоставлены.");
        }
    }
}
