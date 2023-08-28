import java.util.*;
import java.io.*;
public class codechefJuneLongChallenge {
      // --------------------------question 2--------------------------------------
      public static void main(String[] args) {
            // question2
            Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
            int[] grparr = new int[n];
            int[] pricearr = new int[n];
		for(int i = 0; i < n ; i++){
		    int grp = scn.nextInt();
		    int price = scn.nextInt();

                grparr[i] = grp;
                pricearr[i] = price;
		    
		}

            for(int i = 0 ; i < n ; i++){
                  float grpvalue = (float)grparr[i]/6;
                  
                  int grprice = (int)Math.ceil(grpvalue);
                  
                  System.out.println(grprice * pricearr[i]);
            }


      }

      // another method without using memory

      // public static void main (String[] args) throws java.lang.Exception
	// {
	// 	// your code goes here
	// 	Scanner scn = new Scanner(System.in);
	// 	int n = scn.nextInt();
	// 	for(int i = 1; i <= n ; i++){
	// 	    int grp = scn.nextInt();
	// 	    int price = scn.nextInt();
		    
	// 	  //  int grpprice = (int)Math.ceil(grp/6);
	// 	  //  System.out.println(grpprice*price);
		    
		    
	// 	    float grpvalue = (float)grp/6;
                  
      //       int grpmon = (int)Math.ceil(grpvalue);
                  
      //       System.out.println(grpmon * price);
	// 	}
	// }
}


// -----------------question-----(3)----------
// public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
//       int n = scn.nextInt();
//       for(int i=0; i<n; i++){
//           int a = scn.nextInt();
//           int b = scn.nextInt();
//           if((b-a)%3==2){
//               System.out.println("NO");
//           }
//           else{
//               System.out.println("YES");
//           }
//       }
//       }
// }



// -----------------------------question(4)-----------------------------------
// public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
//       int n = scn.nextInt();
//       for(int k=0; k<n; k++){
//           int len = scn.nextInt();
//           String str1 = scn.next();
//           String str2 = scn.next();

//           HashSet<Character> charset = new HashSet<Character>();
//           int i = 0 , j = 0;
//           while(i < len){
//             if(str1.charAt(i) != str2.charAt(j)){
//                   if(!charset.contains(str2.charAt(j))){
//                         charset.add(str2.charAt(j));
//                   }
//             }
//             i++;
//             j++;
//           }
//           System.out.println(charset.size());
          
//       }

// ----------------------------question 5------------------------------------
// public static void main(String[] args) {
      //       Scanner scn = new Scanner(System.in);
	// 	int t = scn.nextInt();
	// 	for(int k = 1 ; k <= t ; k++ ){
      //             int n = scn.nextInt();

      //             int[] arr = new int[n];
      //             int val = 0;
      //             if(n % 2 ==0){
      //                   val = n/2;
      //             }else{
      //                   val = n/2 +1;
      //             }
      //             for(int i = 0 ; i < arr.length ; i = i+2){
      //                   arr[i] = val;
      //                   val++;
      //             } 


      //             int val2 = 0;
      //             if(n % 2 == 0){
      //                   val2 = n/2+1;
      //             }else{
      //                   val2 = n/2;
      //             }
      //             for(int i = 1; i < arr.length ; i = i+2 ){
      //                   arr[i] = val2;
      //                   val2--;
      //             }


      //             String ans = "";
      //             for(int num : arr){
      //                   ans+=num+" ";
      //             }
      //             System.out.println(ans);
      //       }
            
      // }

      // public static void main(String[] args) {
      //       Scanner scn = new Scanner(System.in);
      //       int Testcase = scn.nextInt();
      //       for(int t = 0 ; t < Testcase ; t++) {
      //             int N = scn.nextInt();
      //             int[] arr = new int[N];
      //             boolean flag = true;

      //             for(int  i = N-1 ; i>= 0 ; i--){
      //                   if(i == N-1){
      //                         arr[i] = N;
      //                   }else if(flag){
      //                         arr[i] = arr[i+1]- (i+1);
      //                         flag = false;
      //                   }else{
      //                         arr[i] = arr[i+1] + (i+1);
      //                         flag = true;
      //                   }
      //             }

      //             for(int val : arr){
      //                   System.out.print(val + " ");
      //             }
      //             System.out.println();
      //       }
      // }



      // ------------------------------question 6----------------------------------
      // public static void main(String[] args) {
      //       Scanner scn = new Scanner(System.in);
	// 	int Tc = scn.nextInt();
	// 	for(int t=0; t<Tc; t++){
	// 	      int num1 = scn.nextInt();
      //             int num2 = scn.nextInt();
                 
      //             int count = 0;
                  
      //             int diff  = Math.abs(num1-num2);
                  
      //             for(int j=1; j*j<=diff; j++){
      //                   if(diff%j==0){
      //                         if(diff/j==j){
      //                               count++;
      //                         }else{
      //                               count+=2;
      //                         }
      //                   }
      //             }
      //             System.out.println(count);
	// 	}
      // }

      // -------------------question 7,  reduce to 0----------------------------------------------------------------
      // public static void main(String[] args) {
      //       Scanner scn = new Scanner(System.in);
	// 	int Tc = scn.nextInt();
	// 	for(int t=0; t<Tc; t++){
      //             long num1 = scn.nextLong();
      //             long num2 = scn.nextLong();
      //             if(num1 == num2) System.out.println(num1);
      //             if(num1 == 0 || num2 == 0) System.out.println(-1);

      //             else{
      //                   long max = Math.max(num1,num2);
      //                   long min = Math.min(num1,num2);

      //                   long opr = 0;
      //                   while(min < max){
      //                         min*=2;
      //                         opr++;
      //                   }
      //                   if(min >= max){
      //                         min/= 2;
      //                         opr--;
      //                   }


      //                   long rop = min -(max-min);
      //                   min-=rop;
      //                   max-=rop;
      //                   opr += rop;
      //                   opr++;
      //                   opr+=max;
      //                   System.out.println(opr);
      //             }

	// 	}
      // } 
      
// }


