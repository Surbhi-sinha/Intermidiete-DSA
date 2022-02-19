import java.io.*;
import java.util.*;

public class allreaptingExcept2 {

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
   //XOR everyvalue
    int xXORy = 0;
   for(int val : arr){
       xXORy = xXORy ^ val;
   }

   // fit mask of right most set bit
   int rmsb = xXORy & -xXORy;

   int x = 0;
   int y = 0;
   for(int val : arr){
       if((rmsb & val) == 0){
           //off bit = then uska xor lelo
            x = x ^ val;           
       }else{
           //on bit = then uska xor lelo
           y = y ^ val;
       }
   }

   if(x < y){
       System.out.println(x);
       System.out.println(y);
   }else{
       
    System.out.println(y);
    System.out.println(x);
   }
  }

}