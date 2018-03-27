/*Copyright (c) 26-Mar-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: Staircase.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package Practies;

import java.util.Scanner;

public class Staircase {

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
     
        for(int i=0;i<n;i++){
           for(int j=1;j<=n;j++){
               if(j<n-i){
            System.out.print(" ");
               }else{
                 System.out.print("#");  
               }
              
        }
           
             System.out.println("");
        }
         

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}
