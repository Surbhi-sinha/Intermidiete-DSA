import java.util.*;

public class greyCode {

    public static ArrayList<String> greycode(int n){
        if(n == 1){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("0");
            bres.add("1");
            return bres;

        }
        ArrayList<String> rres = greycode(n-1);
        ArrayList<String> mres = new ArrayList<>();
        for(int i = 0 ;i < rres.size() ; i++){
            mres.add(0+rres.get(i));
        }
        for(int i = rres.size() -1 ; i >=0 ; i--){
            mres.add(1+rres.get(i));
        }
        return mres;

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> ans = greycode(n);
        Collections.sort(ans);
        // int[] arr = new int[ans.size()];
        for(int i = 0 ;i < ans.size() ;i++){
             Integer.parseInt(ans.get(i) , 2);
        }
        System.out.println(ans);

        
        
    }
}
