import java.util.*;

public class test2 {
      public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
           int tc = scn.nextInt();
           while(tc-- > 0){
                  int n = scn.nextInt();
                  int[] arr = new int[n];
                  for(int i = 0; i < n; i++){
                        arr[i] = scn.nextInt();
                  }
                  ArrayList<Integer> al = findSeq(n,arr);
                  System.out.println(al.size());
                  for(int i = 0; i < al.size(); i++){
                        System.out.print(al.get(i)+" ");
                  }
           }
      }
      public static ArrayList<Integer> findSeq(int n , int[] arr){
            ArrayList<Integer> al = new ArrayList<Integer>();
            al.add(arr[0]);
            for(int i = 2 ; i< n-1 ; i++){
                  int min = Math.min(arr[i] , arr[i+1]);
                  if(--min == 0){
                        i++;
                        continue;
                  }
                  al.add(arr[i]);
                  al.add(min-1);
                  // al.add(arr[i+1]);
            }
            return al;
      }
}
