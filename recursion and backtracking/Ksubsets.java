import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class Ksubsets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        ArrayList<ArrayList<Integer>> sets = new ArrayList<>();

        for(int i = 0; i < k; i++){
            sets.add(new ArrayList<>());
        }

        getSubset(1 , n, k ,0 , sets);
    }
    static int counter = 0;
    public static void getSubset(int i , int n , int k , int ssf , ArrayList<ArrayList<Integer>> ans){
        // ssf = selected sets so far
        if(i > n){
            if(ssf == k){
                counter++;
                System.out.print(counter + ". ");

                for(ArrayList<Integer> set : ans){
                    System.out.print(set+" ");
                }
                System.out.println();
            }
            return;
        }

        for(int j = 0 ; j < ans.size() ; j++ ){
            if(ans.get(j).size() > 0){
                ans.get(j).add(i);
                getSubset(i+1 , n , k , ssf, ans);
                ans.get(j).remove((ans.get(j).size()-1));
            }else{
                ans.get(j).add(i);
                getSubset(i+1 , n , k , ssf+1, ans);
                ans.get(j).remove((ans.get(j).size()-1));
                break;
            }
        }
    }
}
