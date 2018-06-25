/*Copyright (c) 06-Jun-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: MemoriseMe.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter23Arrays;

//import for Scanner and other utility classes
import java.util.Scanner;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class MemoriseMe {
    public static void main(String args[] ) throws Exception {
        /* SampMemorise Mele code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 */
      
        Scanner s = new Scanner(System.in);
        int T = s.nextInt(); 
        // Reading input from STDIN
        int[] array = new int[T];
        for(int i=0;i<T;i++){
           array[i]= s.nextInt();
           
           
        }
        
         int Q = s.nextInt();

       for(int i=0;i<Q;i++){
           int cout=0;
           int a = s.nextInt();
          for(int j=0;j<T;j++){
             if(a== array[j]){
                cout++; 
             }
          
        }
        if(cout!=0){
            System.out.println(cout);
        }else{
             System.out.println("NOT PRESENT");
        }
           
         
        }
        

       

    }
}
