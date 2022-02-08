import java.util.*;
import java.io.*;

public class printAbreviations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        solution(str , 0,"" , 0 );
    }    
    public static void solution(String str , int idx , String asf , int count){
        if(idx == str.length()){
            if(count == 0){
                System.out.println(asf);
            }else{
                System.out.println(asf + count);
            }
            return;
        }

        
        //yes vali calls
        if(count > 0){
            solution(str , idx+1 , asf + count + str.charAt(idx) , 0);
        }else{
            solution(str , idx+1 , asf+str.charAt(idx) , 0);
        }
        
        
        //no vali calls
        solution(str , idx +1 , asf , count+1);
    }
}
