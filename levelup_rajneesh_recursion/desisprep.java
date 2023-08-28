import java.util.*;


public class desisprep {


      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                  arr[i] = scn.nextInt();
            }
            int k = scn.nextInt();

            System.out.println(solution(arr,k));
      }

      public static int solution(int[] arr, int k) {
            for (int i = 0; i < k ; i++){
                  int idx = findMaxInArray(arr);
                  int temp = arr[idx];
                  arr[idx] = (int)Math.sqrt(temp);
            }
            int countsum = countArrSum(arr);
            return countsum;
      }
      public static  int findMaxInArray(int[] arr){
            int max = -(int)1e9;
            int idx = 0;
            for(int i = 0 ; i < arr.length ; i++){
                  if(arr[i] > max){
                        max = arr[i];
                        idx = i;
                  }
            }
            return idx;
      }
      public static int countArrSum(int[] arr){
            int sum = 0;
            for(int i = 0 ; i < arr.length; i++){
                  sum += arr[i];
            }
            return sum;
      }

      // time complexity = nk;
      // space complexity = 0;
}

// interview experience questions
// https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/


class Solution {
      public int numberOfSubstrings(String s) {
          
          char[] arr = s.toCharArray();
          int[] count = new int[3];
          int len = arr.length;
          int res = 0;
          for(int i = 0 , j = 0 ; j < arr.length; j++){
                count[arr[j]-'a']++;
                while(allcount(count)){
                      res += (len - j);
                      count[arr[i] - 'a']--;
                      i++;
                }
          }
          return res;
      }
      public boolean allcount(int[] count){
            for(int ele : count){
                  if(ele == 0){
                        return false;
                  }
            }
            return true;
      }
  }


//   interview experience question:------\
// Rahul has n tasks. Time required to complete each task is t[i](for i’th task). 
// Rahul has K days. Rahul picks up the task requiring highest number of time and starts doing it.
//  He works for ceil(t[i]/2) hours. It is given that he will perform one task each day and cannot work for more tha  12 hours in a days i.e if ceil(t/2) is greater than 12 then he will work for twelve hours. 
// He works for K days.
//  tell the total remaining time he would take to finish all the tasks left.

class Solution2{
      public static int calcTime(int[] arr , int k){
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int val : arr){
                  pq.add(val);
            }
            int time = 0;
            if(k > arr.length) return 0;
            int loop = arr.length-k;
            while(loop > 0){
                  int reqtime = pq.remove();
                  // System.out.println(reqtime);
                  if(Math.ceil(reqtime/2) > 12){
                        time += 12;
                  }else{
                        time += Math.ceil(reqtime/2);
                  }
                  loop--;
            }
            return time;
      }
}

// There are x lions, y tigers, z leopards, and w panthers. 
// Find the number of ways to place them on a line such that no two same animals are adjacent to each other. (0<=x,y,z,w<=51) [DP]

class solution3{
      // lions = 0, tigers = 1,leopards = 2, and panthers = 3 position
      public int findWays(int x, int y, int z, int w , int last){
            if(x < 0 || y < 0 || z < 0 || w <0) return 0;
            if(x == 0 || y == 0 || z== 0 || w == 0) return 1;

            int ans = 0;
            if(last ==0){// last me lion baitha hai
                  ans+= findWays(x,y-1,z,w,1)+findWays(x,y,z-1,w,2) + findWays(x,y,z,w-1,3);//y-1 = ek tiger place kia and so on    
            }else if(last == 1){
                  ans+= findWays(x-1,y,z,w,0)+findWays(x,y,z-1,w,2) + findWays(x,y,z,w-1,3);
            }else if(last == 2){
                  ans+= findWays(x-1,y,z,w,0)+findWays(x,y-1,z,w,1) + findWays(x,y,z,w-1,3);
            }else if(last == 3){
                  ans+= findWays(x-1,y,z,w,0)+findWays(x,y-1,z,w,1) + findWays(x,y,z-1,w,2);
            }
            return ans;
      }
}