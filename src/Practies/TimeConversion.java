package Practies;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
       
        
           String[] out=  s.split(":");
             int out1=Integer.parseInt(out[0]);
         if(s.contains("PM")){
            int d=out1+12;
            if(d == 24){
               d=12; 
            }
            s=s.replace(out[0],String.valueOf(d));
        }
        if(s.contains("AM")){
             if(out1 == 12){
               out1=00; 
            }
            s=s.replace(out[0],String.valueOf(out1));
           
        }
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        s=s.replace("PM","");
        s=s.replace("AM","");
        Date date = new Date(s); // also pass milliseconds
        String time = dateFormat.format(date);
        System.out.println(time);
        return s;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("raja.txt")));

        String s = "12:00:00AM";//scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
