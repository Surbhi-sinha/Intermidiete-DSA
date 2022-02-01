/**
 * wordsKlengthwords1
 */
import java.util.*;
import java.io.*;
public class wordsKlengthwords1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();

        HashMap<Character , Integer> unique = new HashMap<>();
        String ustr = "";
        for(char ch : str.toCharArray()){
            if(unique.containsKey(ch) == false){
                unique.put(ch , 1);
                ustr += ch;
            }else{
                unique.put(ch , unique.get(ch) + 1);
            }
        }
        Character[] spots  = new Character[k];
        generateWords(0 , ustr , 0 , k , spots );
    }

    public static void generateWords(int cc , String ustr , int ssf , int ts ,  Character[] spots){
        if(cc == ustr.length()){
            if(ssf == ts){
                for(int i = 0 ; i < spots.length ; i++){
                    System.out.print(spots[i]);
                }
                System.out.println();
            }
            return;
        }
        char ch = ustr.charAt(cc);
        for(int i = 0 ; i < spots.length ; i++){
            if(spots[i] == null){
                spots[i] = ch;
                generateWords(cc+1 , ustr , ssf+1 , ts , spots);
                spots[i] = null;
            }
        }
        generateWords(cc+1 , ustr , ssf+0 , ts , spots);
    }
}