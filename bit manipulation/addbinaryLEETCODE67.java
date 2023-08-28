/**
 * addbinaryLEETCODE67
 */

import java.io.*;
import java.util.*;
//galat hai krna hai abhi sahi
public class addbinaryLEETCODE67 {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String a = scn.next();
            String b = scn.next();

            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);

            int sum = num1 + num2;

            String str = Integer.toBinaryString(sum);
            System.out.println(str);
      }
      
}