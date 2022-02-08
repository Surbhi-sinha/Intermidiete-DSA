import java.io.*;
import java.util.*;

public class maxScore {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int noOfWords = scn.nextInt();
        String[] words = new String[noOfWords];
        for(int i = 0 ;i < words.length ; i++){
            words[i] = scn.next();
        }

        int noOfalpha = scn.nextInt();
        char[] letters = new char[noOfalpha];
        for(int i = 0; i< letters.length ; i++){
            letters[i] = scn.next().charAt(0);
        } 

        int[] score = new int[26];
        for(int i = 0 ; i < score.length ; i++){
            score[i] = scn.nextInt();
        }

        if(words.length == 0 || words == null || letters.length == 0 || letters == null || score == null || score.length == 0){
            System.out.println(0);
            return;
        }
        int[] farr = new int[score.length];
        for(char ch : letters){
            farr[ch - 'a']++;
        }

        System.out.println(solution(words , score , farr , 0));
    }    
    public static int solution(String[] words , int[] score , int[] farr , int idx){
        if(idx == words.length){
            return 0;
        }
        int sno = solution(words , score, farr , idx+1);

        int sword = 0;
        String word = words[idx];
        boolean flag = true;
        for(int i = 0 ; i < word.length() ;i++){
            char ch = word.charAt(i);

            if(farr[ch - 'a']==0){
                flag = false;
            }

            farr[ch - 'a']--;
            sword += score[ch - 'a'];
        }
        int syes = 0;
        if(flag == true){
            syes = sword + solution(words , score, farr , idx+1);
        }

        //backtracking time score vali array ko dubara theek krna padega
        for(int i = 0 ;i < word.length(); i++){
            char ch = word.charAt(i);
            farr[ch - 'a']++;
        }
        

        return(Math.max(sno, syes));
    }
}
