import java.io.*;
import java.util.*;

public class lexicographicalNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 1 ; i < 10 ;i++){
            lexicographical(i , n);
        }

    }
    public static void lexicographical(int i , int n){
        if(i > n){
            return; 
        }
        System.out.println(i);
        for(int j = 0 ; j < 10 ; j++){
            lexicographical(i*10+j , n);
        }
    }

}







