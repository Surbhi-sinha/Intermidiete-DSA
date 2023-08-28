import java.util.*;

public class Solution {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in); 
            int tc = scn.nextInt();
            while(tc-- >= 0) {
                  int n = scn.nextInt();
                  int m = scn.nextInt();
                  char[][] grid = new char[n][m];
                  for(int i = 0; i < n; i++){      
                        grid[i] = scn.next().toCharArray();                        
                  }

                  boolean ans = like(n,m,grid);
                  if(ans == true) System.out.println("YES");
                  else System.out.println("NO");
            }
      }

      public static boolean like(int n, int m, char[][] grid){
            StringBuilder name = new StringBuilder("vika");
            
            for(int j = 0 ; j < m ; j++){
                  for(int i = 0 ; i < n ; i++){
                        if(grid[i][j] == name.charAt(0)){
                              name.deleteCharAt(0);
                        }
                  }
            }
            if(name.length() == 0) return true;
            return false;
      }
}
