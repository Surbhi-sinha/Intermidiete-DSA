import java.io.*;
import java.util.*;

public class Abbreviations1usingBM {

      
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.nextLine();
            solve(str);
      }
      
      public static void solve(String str){
            for(int i = 0; i <(1 << str.length()); i++){
                  int count = 0;
                  StringBuilder sb = new StringBuilder();

                  for(int j = 0 ; j < str.length() ; j++){
                        char ch = str.charAt(j);
                        int bit = str.length() -1 - j;

                        if((i & (1 << bit)) == 0){
                              //off
                              if(count == 0){
                                    sb.append(ch);
                              }else{
                                    sb.append(count);
                                    sb.append(ch);
                                    count =0;
                              }
                        }else{
                              //on
                              count++;
                        }
                  }
                  if(count > 0){
                        sb.append(count);
                  }
                  System.out.println(sb);
            }
      }
}