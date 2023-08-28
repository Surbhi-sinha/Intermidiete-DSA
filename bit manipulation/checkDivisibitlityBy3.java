import java.util.*;
import java.io.*;


public class checkDivisibitlityBy3 {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.next();

            int even = 0;
            int odd = 0;
            for(int i = 0 ; i < str.length() ; i++) {
                  int bit  = str.charAt(i) - '0';
                  if(i % 2 == 0) {
                        even += bit;
                  }else{
                        odd += bit;
                  }
            }

            int delta = (even - odd);
            if(delta %11 ==0 ){
                  System.out.println(true);
            }else{
                  System.out.println(false);
            }
      }      
}
