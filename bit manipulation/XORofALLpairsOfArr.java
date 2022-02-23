import java.util.*;
import java.io.*;
public class XORofALLpairsOfArr {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                  arr[i] = scanner.nextInt();
            }
            System.out.println(solution(arr));
            
      }

      public static int solution(int[] arr){
            int xor = 0;
            for(int val : arr){
                  xor = xor ^ (2 * val);
            }
            return xor;
      }
}
