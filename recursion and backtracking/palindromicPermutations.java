import java.util.*;
import java.io.*;

public class palindromicPermutations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        HashMap<Character , Integer> fmap = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(fmap.containsKey(ch) == false){
                fmap.put(ch , 1);
            }else{
                fmap.put(ch , fmap.get(ch) + 1);
            }
        }

        int odds = 0;
        Character odd = null;
        int len = 0;
        for(char ch : fmap.keySet()){
            int freq = fmap.get(ch);
            if(freq % 2 == 1){
                odds++;
                odd =ch;
            }

            fmap.put(ch ,freq /2);
            len += freq / 2;
        }
        if(odds > 1){
            System.out.println(-1);
            return;
        }

        generateWords(fmap , 1 , len , odd ,"");
    
    }
    public static void generateWords(HashMap<Character , Integer> fmap, int cs , int ts , Character oddc , String asf){
        if(cs > ts ){
            
                String res = asf;
                if(oddc != null){
                    res+=oddc;
                }

                //gerating the reverse of the word
                String rev = "";
                for(int i = asf.length()-1 ; i >= 0 ; i--){
                    rev+= asf.charAt(i);
                }
                System.out.println(res+rev);
            
            return;
        }
        for(char ch : fmap.keySet()){
            int freq = fmap.get(ch);
            if(freq > 0){

                fmap.put(ch , freq-1);
                generateWords( fmap , cs+1 , ts , oddc , asf+ch);
                fmap.put(ch , freq);
            }
        }
    }    
}
