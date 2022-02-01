import java.util.*;
import java.io.*;

public class coinChangePermutation2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] coins = new int[n];
        for(int i = 0 ; i < coins.length ; i++){
            coins[i] = scn.nextInt();
        }
        int amt = scn.nextInt();
        coinChange(coins , 0 , amt ,"");
    }    
    public static void  coinChange(int[] coins , int amtsf , int tamt , String asf){
        if(amtsf > tamt){
            return;
        }
        if(amtsf == tamt){
            System.out.println(asf+".");
            return;
        }

        for(int i = 0; i < coins.length ; i++){
            coinChange(coins , amtsf + coins[i], tamt , asf + coins[i] + "-");
        }
    }
}
