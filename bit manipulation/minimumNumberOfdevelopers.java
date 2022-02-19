import java.io.*;
import java.util.*;

public class minimumNumberOfdevelopers {
    static ArrayList<Integer> sol = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int skillsRequired = scn.nextInt();
        HashMap<String , Integer> map = new HashMap<>();
        for(int i =0 ; i < skillsRequired ; i++){
            map.put(scn.next() , i);
        }

        int nop = scn.nextInt(); //nop = number of people / developers
        int[] people = new int[nop];
        for(int i = 0; i < nop; i++){
            int ps = scn.nextInt(); // ps = personal skills
            for(int j = 0 ; j < ps ; j++){
                String skill = scn.next();
                int snum = map.get(skill); // snum = skill number
                people[i] = people[i]|(1<<snum);
            }
        }

        Solution(people , skillsRequired , 0 , new ArrayList<>() , 0);
        System.out.println(sol);

    }    

    public static void Solution(int[] people , int nskills , int cp , ArrayList<Integer> onesol , int smask){
        if(cp == people.length){
            if(smask == ((1 << nskills ) -1)){
                if(sol.size() == 0 || sol.size() > onesol.size()){
                    sol = new ArrayList<>(onesol);
                }
            }
            return;
        }
        //nskills = total skills required 
        // cp = current people
        //onesol = one solution for one person 
        //smask = bit representation of the skills of the that person

        //no
        Solution(people , nskills , cp+1 , onesol , smask);
        //yes
        onesol.add(cp);
        Solution(people , nskills , cp+1 , onesol , (smask | people[cp]));
        onesol.remove(onesol.size() -1);
    }
}
