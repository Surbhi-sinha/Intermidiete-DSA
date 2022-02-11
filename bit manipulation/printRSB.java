import java.util.*;
public class printRSB {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int rsbn = (n & -n);
        System.out.println(Integer.toBinaryString(rsbn));
    }   
}
