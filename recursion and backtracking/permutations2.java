import java.io.*;

public class permutations2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int ritems = Integer.parseInt(br.readLine());
        permutations2(1 , nboxes , new boolean[ritems] , 0 , ritems , "");
    }    
    public static void permutations2(int cb , int tb , boolean[] items , int ssf , int ts , String asf){
        if(cb > tb){
            if(ssf == ts){
                System.out.println(asf);
            }
            return;
        }
        //yes vali call me condotion hai ki agar pehle se filled hai vo nuber to dubara nh repeat hoga isiliye boolean vali array use ki hai

        for(int i = 0 ; i < items.length ; i++){
            if(items[i] == false){
                items[i] = true;
                permutations2(cb+1 , tb , items , ssf + 1 , ts , asf + (i+1));
                items[i] = false;
            }
        }
        //no vali call me to kuch hai nhi direct call lagegi
        permutations2( cb+1 , tb , items , ssf , ts ,asf + 0);
    }
}
