import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();

        Pattern p = Pattern.compile(".*[\\w]+"+part+"[\\w]+.*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = p.matcher(line);

        System.out.println(matcher.matches() ? "YES" : "NO");
        // write your code here
    }
}