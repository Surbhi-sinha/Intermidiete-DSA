import java.util.*;

public class swapp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int k = scn.nextInt();

        
        System.out.println(swap(str , 2 , k));
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
}
