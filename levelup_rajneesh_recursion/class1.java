import java.util.*;
import java.io.*;
/**
 * class1
 */
public class class1 {
// --------------main for maze path------------/
      // public static void main(String[] args) {
      //       int[][] dir = {{0,1} , {1,0} , {1,1}};
      //       String[] dirS = {"V" , "H" , "D"};
      //       System.out.println(mazePathJumpsGeneralised(0 , 0 , 2 ,3 , dir , dirS , ""));
      // }


      // MAZE PATH WITHOUT JUMPS GENERALISED BY CIRCLE THEORY
      public static int mazePathGeneralised(int sr ,int sc , int er , int ec , int[][] dir , String[] dirS , String psf){
            if(sr == er && sc == ec){
                  System.out.println(psf);
                  return 1;
            }

            int count = 0;
            // changing the direction for making a circle;
            for(int d = 0 ; d < dir.length ; d++){
                  int r = sr + dir[d][0];
                  int c = sc + dir[d][1];

                  if(r >= 0 && c >= 0 && r <= er && c <= ec ){
                        count += mazePathGeneralised(r , c , er,ec,dir , dirS , psf + dirS[d]);
                  }

            }
            
            return count;
      }

      // MAZE PATH WITH JUMPS GENERALISED BY CIRCLE THEORY 

      public static int mazePathJumpsGeneralised(int sr ,int sc , int er , int ec , int[][] dir , String[] dirS , String psf){
            if(sr == er && sc == ec){
                  System.out.println(psf);
                  return 1;
            }

            int count = 0;
            for(int d = 0 ; d < dir.length ; d++){
                  // math.max isiliye kia hai kyuki jaruri nhi hai ki square matrix ho agar rectabgular matrix ban gayi to max lena padega

                  for(int rad = 1; rad <= Math.max(er , ec) ; rad++){
                        int r = sr + dir[d][0] * rad;
                        int c = sc + dir[d][1] * rad;

                        if(r >= 0 && c >=0 && r <= er && c <= ec){
                              count += mazePathJumpsGeneralised(r , c , er ,ec, dir , dirS, psf+dirS[d] + rad);
                        }
                  }

            }

            return count;
      }
      // flood fill matlb same question maze path vala bas isme 3 direction horizontal ,vertical , diagonal na hoke sare eight directions hongi



      // --------------------main for flood fill ----------------------
      // public static void main(String[] args) {
      //       int[][] dir = {{-1,0},{-1,0},{0,1},{1,1} , {1,0} , {1,-1}, {0 , -1} , {-1 , -1}};
      //       String[] dirS = {"U", "E" , "R" , "W" , "D" , "N" , "L" , "S"};
      //       boolean[][] vis = new boolean[3][3];
      //       for(int i = 0 ; i < vis.length ; i++) {
      //             for(int j = 0 ; j < vis[0].length ; j++) {
      //                   vis[i][j] = false;
      //             }
      //       }
      //       System.out.println(floodfillJumpsGeneralized(0 , 0 , 2 , 2,vis, dir , dirS , ""));
      // }
      public static int floodfillGeneralized (int sr , int sc , int er , int ec ,  boolean[][] vis,int[][] dir , String[] dirS , String psf){
            if(sr == er && sc == ec){
                  System.out.println(psf);
                  return 1;
            }
            int count = 0;
            vis[sr][sc] = true;
            for(int d = 0; d < dir.length ; d++){
                  int r = sr + dir[d][0];
                  int c = sc + dir[d][1];

                  if(r >= 0 && c >= 0 && r <= er && c <= ec && vis[r][c] == false){
                        count += floodfillGeneralized(r , c , er , ec , vis,dir , dirS , psf+dirS[d]);
                  }

            }
            vis[sr][sc] = false;
            return count;
      }
      public static int floodfillJumpsGeneralized(int sr, int sc, int er , int ec ,boolean[][] vis, int[][] dir , String[] dirS, String psf){
            if(sr == er && sc == ec){
                  System.out.println(psf);
                  return 1;
            }

            int count = 0;
            vis[sr][sc] = true;
            for(int d = 0 ; d < dir.length ; d++){
                  for(int rad = 1 ; rad <= Math.max(er,ec); rad++){
                        int r = sr + rad*dir[d][0];
                        int c = sc + rad*dir[d][1];

                        if(r>=0 && c>= 0 && r <= er && c <= ec ){
                              if(vis[r][c] == false){

                                    count += floodfillJumpsGeneralized(r , c , er, ec , vis , dir , dirS , psf+dirS[d]+rad);
                              }
                        }else{
                              break;
                        }
                  }
            }
            vis[sr][sc] = false;
            return count;
      }

      // rat in a maze GFG
      public static void main(String[] args) {
            
            int[][] arr = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
            int n = arr.length;
            int m = arr[0].length;
            int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
            String[] dirS= {"U","D","L","R"};
            boolean[][] vis = new boolean[n][m];

            for(int i = 0 ; i < n ; i++){
                  for(int j = 0 ; j < m ; j++){
                        vis[i][j] = false;
                  }
            }

            ArrayList<String> ans =  ratInMaze(0 , 0 , 3 , 3 , vis , dir, dirS , arr,"");
            System.out.println(ans);

      }

      public  static ArrayList<String> list = new ArrayList<String>();
      public static ArrayList<String> ratInMaze(int sr , int sc , int er , int ec , boolean[][] vis , int[][] dir , String[]dirS , int[][] arr , String asf){
            if(sr == er && sc == ec){
                  list.add(asf);
                  // System.out.println(asf);
            }

            for(int d = 0 ;d < dir.length ; d++){
                  int r = sr + dir[d][0];
                  int c = sc + dir[d][1];
                  if(r >= 0 && c >= 0 && r <= arr.length-1 && c <= arr[0].length-1 && vis[r][c] == false && arr[r][c] != 0){
                        vis[r][c] = true;
                        ratInMaze(r,c,er,ec, vis, dir, dirS, arr,asf+dirS[d]);
                        vis[r][c] = false;
                  }
            }

            return list;
      }
      
      // rat in maze with jumps GFG in copy you must check;
      // there are some good points in that question.
}