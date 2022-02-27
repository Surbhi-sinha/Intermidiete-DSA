import java.util.*;
import java.io.*;

public class flipbitsTOconvertAtoB {
      public static void main(String[] args) {
            Scanner scn  = new Scanner(System.in);
            int n = scn.nextInt();
            int m = scn.nextInt();

            int k = n^m;
            //karnighansAlgo for counting the set bits
            int count = 0;
            while(k > 0){
                  int rmsb = (k &-k);
                  k = k - rmsb;
                  count++;
            }

            System.out.println(count);
      }      
}
