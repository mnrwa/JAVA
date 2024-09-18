import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        Password password = new Password();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        login.setUsername(username);
        System.out.println("Enter your password: ");
        String pass = scanner.nextLine();

        if (pass.length() > 11) {
            password.setPassword(pass);
        } else {
            while (pass.length() < 11) {
                System.out.println("Your password is too short (len < 10)");
                pass = scanner.nextLine();
            }
            password.setPassword(pass);
        }

        List b1b2 = password.getRandNum();
        int q = password.getQ(username.length());
        List upper = password.getUpperLetter(q);
        List set = password.randomFromSet(q);

        System.out.println(b1b2);
        System.out.println(upper);
        System.out.println(set);

        b1b2.addAll(upper);
        b1b2.addAll(set);

        System.out.println(b1b2);

        System.out.print("\nFinished password: ");
        for(int i = 0; i<b1b2.size(); i++) {
            System.out.print(b1b2.get(i));
        }
    }
}
