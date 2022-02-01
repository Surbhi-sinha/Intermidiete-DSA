import java.io.*;
import java.util.*;

public class coinChangeCombination2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] coins = new int[n];
        for(int i = 0 ; i < coins.length ; i++){
            coins[i] = scn.nextInt();
        }
        int amt = scn.nextInt();

        coinChange(0 , coins , 0 , amt , "");
    }    
    public static void coinChange(int i , int[] coins , int amtsf , int tamt ,String asf ){
        if(i == coins.length){
            if(amtsf == tamt){
                System.out.println(asf+".");
            }
            return;
        }
        for(int  j = tamt/coins[i] ; j >= 1 ; j-- ){ // saare number vali calls or no vali cal ko neeche handle kr lia hai
            String s = "";
            for(int k = 0 ;  k< j ; k++){
                s+= coins[i]+"-";
            }
            coinChange(i+1 , coins , amtsf+coins[i] *j , tamt , asf+s);
        }
        coinChange(i+1 , coins , amtsf , tamt , asf);
    }
}
