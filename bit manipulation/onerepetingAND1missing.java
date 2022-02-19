import java.io.*;
import java.util.*;

public class onerepetingAND1missing {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
    }
    solution(arr);
  }

  public static void solution(int[] arr){
   int xXORy = 0;
   for(int val : arr){
     xXORy = xXORy ^ val;
   }
   for(int i = 1 ; i <= arr.length ; i++ ){
    xXORy = xXORy ^ i;
   }

   int rmsb = xXORy & -xXORy;

   int x =0 ;
   int y = 0 ;
   for(int val : arr){
     if((val & rmsb) == 0){
       //off
       x = x ^ val;
     }else{
       //on
       y = y ^ val;
     }

   }

   for(int i =1 ; i <=  arr.length ;i++ ){
    if((i & rmsb) == 0){
      //off
      x = x ^ i;
    }else{
      //on
      y = y ^ i;
    }

  }
  for(int val : arr){
    if(val == x){
      System.out.println("missing number -> "+x );
      System.out.println("repeating number -> "+ y );
      break;
    }else if(val == y){
      System.out.println("missing number -> "+ y );
      System.out.println("repeating number -> "+ x );
      break;
    }
  }
   
  }

}