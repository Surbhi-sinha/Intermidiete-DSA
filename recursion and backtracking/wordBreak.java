import java.util.*;
import java.io.*;

public class wordBreak {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        HashSet<String> dict = new HashSet<>();
        for (int i = 0; i < n; i++) {
            dict.add(scn.next());
        }

        String sentence = scn.next();
        solution(sentence, "", dict);
    }

    public static void solution(String sentence, String asf, HashSet<String> dict) {
        if (sentence.length() == 0) {

            System.out.println(asf);

            return;
        }
        for (int i = 0; i < sentence.length(); i++) {
            String wordIndict = sentence.substring(0, i + 1);
            String ros = sentence.substring(i + 1);

            if (dict.contains(wordIndict)) {

                solution(ros, asf + wordIndict + " ", dict);

            }
        }
    }
}
