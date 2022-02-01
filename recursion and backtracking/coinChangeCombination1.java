import java.io.*;
import java.util.*;

public class coinChangeCombination1 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        int amt = Integer.parseInt(br.readLine());
        
        coinChange(0, coins, 0, amt, "");
    }
    public static void coinChange(int i, int[] coins, int amtsf, int tamt, String asf){
        if(i == coins.length){

            if(amtsf == tamt){
                System.out.println(asf+".");
            }
            return;
        }
        //yes
        coinChange(i+1 , coins , amtsf+coins[i] , tamt , asf+coins[i]+"-");
        //no        
        coinChange(i+1 , coins , amtsf , tamt , asf);
    }
}