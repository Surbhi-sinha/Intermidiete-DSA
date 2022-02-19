import java.util.*;
import java.io.*;

public class numOfValidWords {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] words = new String[n];
        for(int i = 0 ; i < words.length ; i++){
            words[i] = scn.next();
        }
        int m = scn.nextInt();
        String[] puzzles = new String[m];
        for(int i = 0 ; i < m ; i++){
            puzzles[i] = scn.next();
        }

        ArrayList<Integer> ans = findnumberofValidWords(words ,puzzles );
        for(int i = 0 ;i < puzzles.length ; i++){
            System.out.println(puzzles[i] +" -> " + ans.get(i));
        }
    }    
    public static ArrayList<Integer> findnumberofValidWords(String[] words , String[] puzzles){
        HashMap<Character , ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0 ;i < 26 ; i++){
            map.put((char)('a'+i) , new ArrayList<>());
        }

        //MAKING THE MASK FOR THE words
        for(String word : words){
            int mask = 0;
            for(char ch : word.toCharArray()){
                int bit = ch - 'a';
                mask = mask|((1 << bit));
            }
            HashSet<Character> unique = new HashSet<>();
            for(char ch : word.toCharArray()){
                if(unique.contains(ch)){
                    continue;
                }
                unique.add(ch);
                map.get(ch).add(mask);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        //MAKING THE MASK FOR PUZZLES
        for(String puzzle : puzzles){
            int pmask = 0 ; 
            for(char ch : puzzle.toCharArray()){
                int bit = ch-'a';
                pmask = pmask| ((1 << bit));
            }
            char fch = puzzle.charAt(0);
            int count =0;
            ArrayList<Integer> wordtocheck = map.get(fch);
            for(int wmask : wordtocheck){
                if((wmask & pmask) == wmask ){
                    count++;
                }

            }
            res.add(count);
        }
        return res;

    }
}
