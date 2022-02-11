/**
 * josephusSpecial
 */
import java.util.*;
import java.io.*;

public class josephusSpecial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(Solution(n));
    }
    public static int Solution(int n){
        int po2 = powerOf2(n);
        int l = n%po2;
        return 2*l+1;
    }
    public static int powerOf2(int n) {
        int power = 1;
        while(power*2 < n){
            power *= 2;

        }
        return power;
    }
    
}