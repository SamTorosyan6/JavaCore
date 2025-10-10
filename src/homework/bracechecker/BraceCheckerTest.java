package homework.bracechecker;

public class BraceCheckerTest {

    static void main() {

        String text = "Hello (from) [Java[";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();

    }

}
