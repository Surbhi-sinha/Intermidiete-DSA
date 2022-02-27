import java.util.*;
import java.io.*;

public class is4PowerN {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            int dummy = 0b01010101010101010101010101010101;
            if(n > 0 && ((n & (n-1)) == 0) && (n & dummy)>0){
                  System.out.println(true);
            }else{
                  System.out.println(false);

            }
      }
}
