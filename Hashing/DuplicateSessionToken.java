import java.util.HashSet;
import java.util.Set;

public class DuplicateSessionToken {
    public static boolean hasDuplicateToken(String[] tokens) {
        Set<String> seen = new HashSet<>();
        for (String token : tokens) {
            if (!seen.add(token)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] tokens = {"abc123", "xyz789", "abc123"};
        System.out.println(hasDuplicateToken(tokens));
    }
}