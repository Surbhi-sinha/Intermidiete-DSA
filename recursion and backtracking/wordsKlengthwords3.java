import java.io.*;
import java.util.*;

public class wordsKlengthwords3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
        //lastoccurence vala hashmap
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0 ; i < str.length() ;i++){
            char ch = str.charAt(i);
            map.put(ch , -1);
            
        } 
        Character[] spots  = new Character[k];
        genrateWords(str , map , 0 ,0,k, spots );
    }    
    public static void genrateWords(String str , HashMap<Character , Integer> map , int idx ,int ssf , int k, Character[] spots){
        if(idx == str.length()){
            if(ssf == k ){
                for(int i = 0 ;i < spots.length ; i++){

                    System.out.print(spots[i]);
                }
                System.out.println();
            }
            return;
        }
        char ch = str.charAt(idx);
        int lo = map.get(ch); // lo = last occurence
        for(int i = lo +1 ; i < spots.length ; i++){
            if(spots[i] == null){
                spots[i] = ch;
                map.put(ch , i);
                genrateWords(str , map, idx+1 ,ssf+1 , k , spots);
                map.put(ch , lo);
                spots[i] = null;
            }
        }
        if(lo == -1){

            genrateWords(str , map , idx+1 ,ssf+0 , k , spots);
        }
    
    }
}
