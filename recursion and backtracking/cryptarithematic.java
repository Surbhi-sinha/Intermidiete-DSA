import java.util.*;
import java.io.*;

public class cryptarithematic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.next();
        String s2 = scn.next();
        String s3 = scn.next();
        HashMap<Character , Integer> charIntMap = new HashMap<>();
        String unique = "";
        for(int i =0 ; i< s1.length() ; i++){
            char ch = s1.charAt(i);
            if(charIntMap.containsKey(ch) == false){
                charIntMap.put(ch , -1);
                unique+= ch;
            }
        }
        for(int i =0 ; i< s2.length() ; i++){
            char ch = s2.charAt(i);
            if(charIntMap.containsKey(ch) == false){
                charIntMap.put(ch , -1);
                unique+= ch;
            }
        }
        for(int i =0 ; i< s3.length() ; i++){
            char ch = s3.charAt(i);
            if(charIntMap.containsKey(ch) == false){
                charIntMap.put(ch , -1);
                unique+= ch;
            }
        }
        boolean[] usedNumber = new boolean[10];
        SolveCryptarithematic(unique , 0 , charIntMap ,usedNumber, s1 , s2 ,s3);
        
    } 
    public static int getNum(String s , HashMap<Character , Integer> charIntMap){
        String num = "";
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            num += charIntMap.get(ch);
        }
        return Integer.parseInt(num);
    }
    public static void SolveCryptarithematic(String unique , int idx , HashMap<Character , Integer > charIntMap ,boolean[] usedNumber, String s1 , String s2 , String s3){
        if(idx == unique.length()){
            int num1 = getNum(s1,charIntMap);
            int num2 = getNum(s2,charIntMap);
            int num3 = getNum(s3 , charIntMap);
            if(num1 + num2 == num3){
                for(int i = 0 ; i < 26 ; i++){
                    char ch = (char)('a'+i);
                    if(charIntMap.containsKey(ch)){
                        System.out.print(ch + "-" + charIntMap.get(ch)+" ");
                    }
                }
                System.out.println();
            }
            return;
        }
        char  ch = unique.charAt(idx);
        for(int num = 0 ; num <= 9 ; num++){
            if(usedNumber[num] == false){
                charIntMap.put(ch , num);
                usedNumber[num] = true;
                SolveCryptarithematic(unique , idx+1 , charIntMap , usedNumber , s1 ,s2 ,s3);
                charIntMap.put(ch , -1);
                usedNumber[num] = false;
            }
        }
    }   
}
