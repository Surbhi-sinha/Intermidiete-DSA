import java.util.*;
import java.io.*;

public class ksubsetswithEqualSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();

        int sum= 0;
        for(int val : arr){
            sum += val;
        }
        if(k ==1){
            System.out.println("[");
            for(int val : arr){
                System.out.print(val +", ");
            }
            System.out.println();
            return;
        }
        if(k > n || sum % k != 0){
            System.out.println(-1);
            return;
        }

        int[] subsetsum = new int[k];
        ArrayList<ArrayList<Integer>> sets = new ArrayList<>();
        for(int i = 0 ;i < k ; i++){
            sets.add(new ArrayList<>());
        }

        getSubset(arr, 0, n , k , 0 ,subsetsum,sets );
    }    

    public static void getSubset(int[] arr , int idx , int n , int k ,int ssf, int[] subsetsum , ArrayList<ArrayList<Integer>> ans){
        if(idx == n){
            if(ssf == k){
                boolean flag = true;
                for(int i = 0 ;i < subsetsum.length -1 ; i++){
                    if(subsetsum[i] != subsetsum[i+1]){
                        flag = false;
                        break;
                    }
                }

                if(flag == true){
                    for(ArrayList<Integer> set : ans){
                        System.out.print(set+" ");
                    }
                    System.out.println();
                }
            }
            return;
        }
        for(int j = 0 ; j < ans.size(); j++){
            if(ans.get(j).size() > 0){
                ans.get(j).add(arr[idx]);
                subsetsum[j] += arr[idx];
                getSubset(arr , idx+1 , n , k , ssf , subsetsum , ans);
                ans.get(j).remove(ans.get(j).size() -1);
                subsetsum[j] -= arr[idx];
            }else{
                ans.get(j).add(arr[idx]);
                subsetsum[j] += arr[idx];
                getSubset(arr , idx+1 , n , k , ssf  +1 , subsetsum , ans);
                ans.get(j).remove(ans.get(j).size() -1);
                subsetsum[j] -= arr[idx];
                break;
            }
        }
    }
}
