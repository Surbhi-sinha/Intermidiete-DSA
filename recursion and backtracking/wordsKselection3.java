import java.io.*;
import java.util.*;


public class wordsKselection3 {

  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());

    HashMap<Character, Integer> unique = new HashMap<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (unique.containsKey(ch) == false) {
        unique.put(ch, 1);
        ustr += ch;
      } else {
        unique.put(ch, unique.get(ch) + 1);
      }
    }

  //  generateWords(ustr, unique, 0 , "",k);
   generateWords2(ustr , unique , 0 , "" ,k );
  }
  public static void generateWords(String ustr , HashMap< Character , Integer > unique , int idx , String asf , int k){
    if(k < 0){
      return;
    }
    if(idx == ustr.length()){
      if(k == 0){
        System.out.println(asf);
      }
      return;
    }
    char ch = ustr.charAt(idx);
    for(int i = unique.get(ch) ; i>=0 ; i--){
      String s = "";
      for(int j = 0 ;j < i ; j++){
        s+=ch;
      }
      generateWords(ustr , unique , idx+1 , asf + s , k-i);
    }
  }

  public static void generateWords2(String ustr , HashMap<Character , Integer> unique , int idx , String asf , int k  ){
    if(k < 0){
      return;
    }
    if(idx == ustr.length()){
      if(k == 0){
        System.out.println(asf);
      }
      return;
    }
    char ch = ustr.charAt(idx);
    if(unique.get(ch) > 0){
      unique.put(ch,unique.get(ch)-1);
      //yess ki call
      generateWords2(ustr , unique , idx, asf + ch , k-1 );
      unique.put(ch,unique.get(ch)+1);
    }
    //no ki  calls
    generateWords2(ustr , unique , idx +1 , asf , k );
  }

}