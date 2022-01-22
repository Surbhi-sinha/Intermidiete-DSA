/**
 * permutation1
 */
import java.io.*;
// import java.util.*;
public class permutation1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int ritems = Integer.parseInt(br.readLine());
        permutation1(new int[nboxes] , 1 , ritems);
    }

    public static void permutation1(int[] boxes , int item , int ti ){ // total items = ti
        if(item > ti){
            for(int i = 0 ; i < boxes.length ;i++){
                System.out.print(boxes[i]);
            }
            System.out.println();
            return;
        }
        for(int i = 0 ; i< boxes.length ;i++ ){
            if(boxes[i] == 0){
                boxes[i] = item;
                permutation1(boxes , item+1 , ti);
                boxes[i] = 0;
            }
        }
    }
    
}