import java.io.*;
import java.util.*;

public class karnighansAlgo {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int counter = 0;
    while(n > 0){
        int rsbm = (n & -n);
        n = n - rsbm;
        counter++;
    }
    System.out.println(counter);
  }

}