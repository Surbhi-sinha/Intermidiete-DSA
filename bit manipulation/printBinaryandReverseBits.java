import java.util.*;
import java.io.*;

public class printBinaryandReverseBits {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            boolean flag = false;
            int rev = 0;
            int j = 0;
            for(int i = 31 ; i >= 0 ;i--){
                  if(flag){
                        if((n & (1 << i)) != 0){
                              //on bit
                              System.out.print(1);

                              //reverse vali digit k lie kaam
                              int rmask = (1 << j);
                              
                              rev |= rmask;
                        }else{
                              //off bit
                              System.out.print(0);
                        }
                        j++;
                  }else{
                        if((n & (1 << i)) != 0){
                              //on bit
                              flag = true;
                              System.out.print(1);

                              //reverse vala k lie kaam
                              int rmask = (1 << j);
                              rev |= rmask;
                              j++;
                        }else{
                              //off bit
                        }
                  }
            }
            System.out.println();
            System.out.println(rev);
      }      
}
