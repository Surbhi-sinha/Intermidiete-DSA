import java.io.*;
import java.util.*;

public class wordsKlengthwords4 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int k = Integer.parseInt(br.readLine());

        //hashmap for frequecy
        HashMap<Character , Integer> fmap = new HashMap<>();
        String ustr = "";
        for(char ch : str.toCharArray()){
            if(fmap.containsKey(ch) == false){
                ustr+=ch;
                fmap.put(ch , 1);
            }else{
                fmap.put(ch , fmap.get(ch)+1);
            }
        }

        genrateWords(ustr , fmap , 0 , k , "" );
    }    
    public static void genrateWords(String ustr , HashMap< Character , Integer > fmap , int ssf ,int ts ,String asf){
        if(ssf == ts){
            System.out.println(asf);
            return;
        }
        for(int i = 0 ; i < ustr.length() ; i++){
            char ch = ustr.charAt(i);
            if(fmap.get(ch) > 0){
                fmap.put(ch , fmap.get(ch) -1);
                genrateWords(ustr , fmap , ssf +1 , ts , asf+ch);
                fmap.put(ch , fmap.get(ch) +1);
            }
        }
    }
}
