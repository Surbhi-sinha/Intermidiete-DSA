import java.io.*;
import java.util.*;

public class swapEvenandODDbits {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int evenmask = 0b10101010101010101010101010101010;
    int oddmask = 0b01010101010101010101010101010101;

    int evensave = n & evenmask;
    evensave = evensave >>1;

    int oddsave = n & oddmask;
    oddsave = oddsave << 1;

    System.out.println(evensave | oddsave);
    
  }

}
