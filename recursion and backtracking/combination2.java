import java.io.*;

public class combination2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int ritems= Integer.parseInt(br.readLine());
        
        combinations2(new boolean[nboxes] , 1 , ritems , -1);
    }
    public static void combinations2(boolean[] items , int ci , int ti , int llb ){
        //items array vo hai jo yeah bataegi ki iss position pr pehle se koi baitha hai ya nhi hum traverse to sabko krenge but calls sorf unki lagegi jo false ho 
        // kyuki iss tarike se 123- or 132- vale b baar baar iii- vali repeat krenge;
        //ci = current index;
        // ti = total index;
        // llb = last level vala box. ek levele pr 1 ka d=fir 2 fir 3 fir4 ka kaam hoga
        if(ci > ti){
            for(int i = 0; i < items.length ;i++){
                if(items[i] == true){
                    System.out.print("i");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
            return;
        }
        for(int b = llb +1 ; b < items.length ;b++){
            if(items[b] == false){
                items[b] = true;
                combinations2(items , ci+1 , ti , b);
                items[b] = false;
            }
        }

    }
}
