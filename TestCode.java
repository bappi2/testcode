import java.util.HashSet;
import java.util.Set;

public class TestCode {
    public static void main(String[] args) {
        String input = "himohammadmeftauddin";
        String[] dict = {"hi", "mohammad", "meftauddin"};
        System.out.println(TestCode.makeSentence(input, dict));
    }
    static String makeSentence(String input, String[] dict) {
        Set<String> mySet = new HashSet<>();
        for (String str: dict) {
            mySet.add(str);
        }
        int j = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            String currSub = input.substring(j, i + 1);

            if (mySet.contains(currSub)) {
                sb.append(currSub);
                j = i + 1;
                sb.append(" ");
            }
        }
        return sb.toString().substring(sb.length() -1);
    }
}
