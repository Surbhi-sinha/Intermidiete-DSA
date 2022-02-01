import java.util.*;
import java.io.*;

public class wordsKselection4 {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();

        String ustr = "";
        HashMap<Character , Integer> unique = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(unique.containsKey(ch) == false){
                unique.put(ch , 1);
                ustr += ch;
            }else{
                unique.put(ch , unique.get(ch) +1);
            }
        }

        generateWords(ustr , unique , 0 , k ,0,"");
    } 
    public static void generateWords(String ustr , HashMap< Character , Integer > unique , int cspot , int tspot , int lspot , String asf){
        if(cspot == tspot){
            System.out.println(asf);
            return;
        }
        for(int i = lspot ; i < ustr.length() ; i++){
            char ch = ustr.charAt(i);
            if(unique.get(ch) > 0){
                unique.put(ch , unique.get(ch) -1);
                generateWords(ustr , unique , cspot+1 , tspot , i, asf + ch);
                unique.put(ch , unique.get(ch) +1);
                
            }
            
        }
    }   
}
