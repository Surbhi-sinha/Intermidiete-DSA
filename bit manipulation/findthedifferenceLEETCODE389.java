import java.io.*;
import java.util.*;
public class findthedifferenceLEETCODE389 {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str1  = scn.next();
            String str2  = scn.next();
            char xor = 0; 

            for(char ch : str1.toCharArray()) {
                  xor = (char) (xor ^ ch);
            }
            for(char ch : str2.toCharArray()) {
                  xor = (char) (xor ^ ch);
            }

            System.out.println(xor);
      }
}
