import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Password {
    private String password;
    private  List<String> b1b2 = new ArrayList<>();

    public void setPassword(String password) {
        this.password = password;
    }

    public int getQ(int lenStr) {
        return lenStr % 8;
    }

    public List <String> getRandNum() {
        Random rand = new Random();
        b1b2.add(String.valueOf(rand.nextInt(10))); // b₁
        b1b2.add(String.valueOf(rand.nextInt(10)));
        return b1b2;
    }

    public List <String> getUpperLetter(int q) {
        List<String> upperLetter = new ArrayList<>();
        Random rand = new Random();
        for (int i = 3; i < 4+q; i++) {
            upperLetter.add(String.valueOf((char)(rand.nextInt(26) + 'A')));
        }
        return upperLetter;
    }

    public List <String> randomFromSet(int q) {
        List<String> fromSet = new ArrayList<>();
        Random rand = new Random();
        String[] set = {"!","”","#","$","%","&","’","(",")","*"};
        for (int i = 4+q; i < 12; i++) {
            int randomIndex = rand.nextInt(set.length);
            fromSet.add(set[randomIndex]);
        }
        return fromSet;
    }


}
