/**
 * test
 */
import java.util.*;

public class test {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
		int Tc = scn.nextInt();
		for(int t=0; t<Tc; t++){
                  int X = scn.nextInt();
                  int N = scn.nextInt();
                  // boolean coin=true;
                  int count = 0;
                  while( X!= 1){
                        if(count %2 == 0){
                              if(X!=N){
                                    X +=1;
                              }
                             count++;
                        }else{
                              X-=1;
                             count++;
                        }
                        
                  }
                  System.out.println(count);
		}
      }
      
}