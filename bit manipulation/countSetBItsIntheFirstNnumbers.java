import java.util.*;
import java.io.*;

public class countSetBItsIntheFirstNnumbers {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            System.out.println(solution(n));
      }      

      public static int solution(int n) {
            if(n == 0){
                  return 0;
            }
            int x = findPower(n);  //closestPowerOf2upton

            int countofsetbitsupto2pown = (1 << (x-1))*x;
            int msbfrom2powNtoN = (n - (1 << x) + 1);
            int rest = solution(n - (1 << x));
            return (countofsetbitsupto2pown + msbfrom2powNtoN + rest);
      }

      public static int findPower(int n) {
            int c = 0;
            while((1<<c) <= n){
                  c++;
            }
            return c-1;
      }
}
