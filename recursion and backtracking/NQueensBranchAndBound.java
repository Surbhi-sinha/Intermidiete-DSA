
import java.util.*;

public class NQueensBranchAndBound {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    boolean[][] board = new boolean[n][n];
    
    boolean[] cols = new boolean[n]; // columns
    boolean[] nd = new boolean[2*n -1]; // nd = normal diagonal
    boolean[] rd = new boolean[2*n -1]; // rd = reverse diagonal
    
    solve(0 , board , cols, nd , rd , "");
  }
  public static void solve(int row , boolean[][] board , boolean[] cols , boolean[] nd , boolean[] rd , String asf ){
    if(row == board.length){
      System.out.println(asf+".");
      return;
    }
    //ek hi for loop kyuki vo b sirf rows me lag rhi hai baaki saari problems ko cols , nd , rd sambhal lenge
    for(int col = 0 ; col < board.length ; col++){
      if(cols[col] == false && nd[row+col] == false && rd[row-col+board.length -1] == false){
        cols[col] = true;
        nd[row+col] = true;
        rd[row-col+board.length -1] = true;
        solve(row+1 , board , cols , nd , rd , asf+row+"-"+col+", ");
        cols[col] = false;
        nd[row+col] = false;
        rd[row-col+board.length -1] = false;
      }
    }
  }

}