import java.io.*;
import java.util.*;

public class copySetBitsInRange {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int A = scn.nextInt();
            int B = scn.nextInt();
            int left = scn.nextInt();
            int right = scn.nextInt();

            //for mask1 
            int m1 = 1;
            m1 = m1<<(Math.abs(right-left)+1);
            m1 = m1 -1;
            int mask2 = m1 << (left-1);

            int fmoa = mask2 & A; // fmoa = final mask of A
            System.out.println(fmoa | B); 


      }      
}
