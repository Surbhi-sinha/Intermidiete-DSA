import java.io.*;
import java.util.*;

public class removeInvalidParenthesis {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        HashSet<String> ans = new HashSet<>();
        solution(str , getMinRem(str), ans);
    }    
    public static int getMinRem(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i< str.length() ; i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            }else if(ch == ')'){
                if(st.size() ==0){
                    st.push(ch);
                }else if(st.peek() == '('){
                    st.pop();
                }else if(st.peek() ==')'){
                    st.push(ch);
                }
            }
        }
        return st.size();
    } 
    public static void solution(String str , int minrem , HashSet<String> ans){
        if(minrem == 0){
            if(getMinRem(str) == 0){
                if(ans.contains(str) == false){
                    System.out.println(str);
                    ans.add(str);
                }
            }
            return;
        }
        for(int i = 0 ; i< str.length() ; i++){
            String left = str.substring(0 , i);
            String right = str.substring(i+1);
            solution(left+right ,minrem-1 ,ans);

        }
    }
}
