import java.util.*;
import java.io.*;

public class is2powerN {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            if((n & (n-1)) == 0) {
                  System.out.println(true);
            } else{
                  System.out.println(false);
            }
      }      
}
