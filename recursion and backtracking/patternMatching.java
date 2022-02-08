import java.util.*;
import java.io.*;

public class patternMatching {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String pattern = scn.next();
        HashMap<Character , String> map = new HashMap<>();
        solution(str , pattern , map , pattern);
    }    
    public static void solution(String str , String pattern , HashMap<Character , String > map , String op){
        if(pattern.length() == 0){
            if(str.length() == 0){
                HashSet<Character> printedChar = new HashSet<>();
                for(int i = 0 ; i< op.length() ; i++){
                    char ch = op.charAt(i);
                    if(printedChar.contains(ch) == false){
                        System.out.print(ch + " => " + map.get(ch) + ", ");
                        printedChar.add(ch);
                    }
                }
                System.out.println(".");
            }
            return;
        }
        char ch = pattern.charAt(0);
        String rop = pattern.substring(1);
        if(map.containsKey(ch)){
            String previousmapping = map.get(ch);
            if(str.length() >= previousmapping.length()){
                String left = str.substring(0 , previousmapping.length());
                String right = str.substring(previousmapping.length());
                if(left.equals(previousmapping)){
    
                    solution(right , rop , map , op);
                }
            }


        }else{
            for(int i = 0 ; i < str.length() ; i++){
                String left = str.substring(0 , i+1);
                String right = str.substring(i+1);
                map.put(ch , left);
                solution(right , rop , map , op);
                map.remove(ch);
            }

        }
    }
}
