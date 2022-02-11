import java.util.*;
import java.io.*;

public class TugOfWar {

    static String ans = "";
    static int minDiff = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        solution(arr, 0, new ArrayList<>(), new ArrayList<>(), 0, 0);
        System.out.println(ans);
    }

    public static void solution(int[] arr , int idx , ArrayList<Integer> s1, ArrayList<Integer> s2 , int sums1, int sums2){
        if(idx == arr.length){
            int delta = Math.abs(sums1 - sums2);
            if(delta < minDiff){
                minDiff = delta;
                ans = s1 + " "+s2;
            }

            return;
        }
        //option me s1 and s2
        //level pr arr k values
        int n = arr.length;
        
            if(s1.size() < (n+1)/2){
                s1.add(arr[idx]);
                solution(arr , idx+1 , s1 , s2 , sums1+arr[idx], sums2);
                s1.remove(s1.size()-1);
            }
    
            if(s2.size() < (n+1)/2){
                s2.add(arr[idx]);
                solution(arr , idx+1 , s1 , s2 , sums1, sums2+arr[idx]);
                s2.remove(s2.size()-1);
            }
        
    }
}
