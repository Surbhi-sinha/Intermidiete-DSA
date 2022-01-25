import java.io.*;
import java.util.*;
public class wordsKselection1 {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int k = scn.nextInt();

        HashSet<Character> unique = new HashSet<>();
        String ustr = ""; // ustr = unique string
        for(int i = 0 ;i < str.length() ; i++){
            char ch = str.charAt(i);
            if(unique.contains(ch) == false){
                unique.add(ch);
                ustr += ch;
            }
        }

        generateSelections(0 , ustr , 0 , k , "");

    }

    public static void generateSelections(int i , String ustr , int ssf , int ts , String asf ){
        //i = position of the Character 
        //ustr = unique string 
        // ssf = selection so far
        //ts = total selection to b done 
        if(i == ustr.length()){

            if(ssf == ts){
                System.out.println(asf);
            }
            return;
        }
        char ch = ustr.charAt(i);
        generateSelections(i+1 , ustr , ssf +1 , ts , asf + ch );
        generateSelections(i+1 , ustr , ssf +0 , ts , asf +"");
    }
}
