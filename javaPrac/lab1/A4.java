package lab1;

public class A4 {
    public static void main(String[] args) {
        if (args.length > 0) {
            String password = args[0];
            String truePassword = "somePassword";

            if (password.equals(truePassword)) {
                System.out.println("Your password is correct");
            } else {
                System.out.println("Your password is incorrect");
            }
        } else {
            System.out.println("Please provide a password as a command-line argument.");
        }
    }
}
