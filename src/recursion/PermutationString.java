package recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PermutationString {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        permutation("", "abc", str);
        Collections.sort(str);
        System.out.println(str);
    }

    public static void permutation(String p, String up, ArrayList<String> str) {
        if (up.isEmpty()) {
            str.add(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String l = p.substring(i, p.length());
            permutation(f+ch+l, up.substring(1), str);
        }
    }
}
