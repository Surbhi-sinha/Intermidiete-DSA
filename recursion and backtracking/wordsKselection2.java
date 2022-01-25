
import java.util.*;
public class wordsKselection2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int k = scn.nextInt();

        HashSet<Character> unique = new HashSet<>();
        String ustr = "";
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(unique.contains(ch)==false){
                unique.add(ch);
                ustr+=ch;
            }
        }

        generateWords(ustr , 1, k , -1 , "");
    }
    public static void generateWords(String ustr , int cs , int ts , int lc , String asf){
        //cs = current selection so far
        // ts = total selection
        // lc = last char\
        if(cs > ts){
            System.out.println(asf);
            return;
        }
        for(int i = lc +1 ; i < ustr.length() ; i++){
            char ch = ustr.charAt(i);
            generateWords(ustr , cs +1  ,ts , i , asf + ch );
        }
    }
}
