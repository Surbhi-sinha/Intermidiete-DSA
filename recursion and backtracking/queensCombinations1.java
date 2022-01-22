import java.io.*;
import java.util.*;

public class queensCombinations1 {
    public static void queensCombinations(int qpsf, int tq, int row, int col, String asf){
        //qpsf = queens paths so far
        // tq = total queensCombinations
        //asf = asf so far
        if(row == tq){
            if(qpsf == tq){
                System.out.println(asf);
            }
            return;
        }
        int nr = 0;
        int nc = 0;
        String yasf = "";
        String nasf = "";
        if(col == tq-1){
            nr = row+1;
            nc = 0;
            yasf = asf+"q\n";
            nasf= asf+"-\n";

        }else{
            nr = row;
            nc = col+1;
            yasf= asf+"q";
            nasf = asf+"-";
        }
        queensCombinations(qpsf+1 , tq , nr , nc , yasf);//pehle yes vali call
        queensCombinations(qpsf+0, tq , nr , nc , nasf);//pehle yes vali call

    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        queensCombinations(0, n, 0, 0, "");
    } 
}
