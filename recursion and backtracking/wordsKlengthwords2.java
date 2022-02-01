import java.io.*;
import java.util.*;

public class wordsKlengthwords2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();

        HashSet<Character> unique = new HashSet<>();

        String ustr = "";
        for(char ch : str.toCharArray()){
            if(unique.contains(ch) == false){
                unique.add(ch);
                ustr+= ch;

            }
        }
        
        generateWords(ustr ,new HashSet<>() , 0 ,k, "");
    }    

    public static void generateWords(String ustr , HashSet<Character> used , int cs , int ts, String asf){
        if(cs==ts){
            System.out.println(asf);
            return;
        }

        for(int i = 0 ; i < ustr.length() ; i++ ){
            char ch = ustr.charAt(i);
            if(used.contains(ch) == false){
                used.add(ch);
                generateWords(ustr , used , cs+1 , ts , asf+ch);
                used.remove(ch);
            }
        }
    }
}
