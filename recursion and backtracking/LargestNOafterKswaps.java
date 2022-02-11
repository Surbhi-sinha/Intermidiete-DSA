import java.io.*;
import java.util.*;

public class LargestNOafterKswaps {

	static String max;
	public static void findMaximum(String str, int k) {
        if(Integer.parseInt(str) > Integer.parseInt(max)){
            max = str;
        }
        if(k == 0){
            return;
        }
		//write your code here
        for(int i =0 ; i< str.length() -1 ;i++){
            for(int j = i+1 ; j < str.length() ; j++){
                if(str.charAt(j) > str.charAt(i)){
                    str = swap(str , i , j);
                    findMaximum(str , k-1 );
                    str = swap(str , i , j);
                }
            }
        }
		
	}
    public static String swap(String str , int i , int j){
        char[] charArr= str.toCharArray();

        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;
        String swapped = "";
        for(int k = 0;  k< charArr.length ; k++){
            swapped += charArr[k];
        }
        return swapped;
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int k = scn.nextInt();
		max = str;
		findMaximum(str, k);
		System.out.println(max);
	}

}
