/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *Student engine done by Michelle
 * @author 068787845
 */
public class StudentEngine {
    
    
   //format of each record is in: time, instrument number, student number, in/out
    public static void signInOut (int stuNum, int instrumentNum) throws IOException{
        File history = new File("History.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(history,true));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        Scanner s = new Scanner(history);
        LocalDateTime now = LocalDateTime.now();
    //loop through the previous contents of the file to check if this instrument has been checked out or not
        //read every line into an arraylist
        ArrayList a=new ArrayList<String>();
        while(s.hasNextLine()){
            a.add(s.nextLine());
        }
        //create for loop that starts from the end of the arraylist (most recent)
        for(int i=a.size()-1;i>=0;i--){
            //for each line, chech if it is the current instrument
            String [] record=a.get(i).toString().split(",");
            if (record[1].equals(instrumentNum)){
                //if so, check if it was signed in or out
                if(record[1].equals("out")){
                    //if out, print a record signing the instrument in
                    pw.println(dtf.format(now)+","+instrumentNum+","+stuNum+",in"); 
                }
                else //if in, print a record signing the instrument out
                    pw.println(dtf.format(now)+","+instrumentNum+","+stuNum+",out"); 
                    
            }
            //if not go to the next record
            else continue;
        }
    }
    
}
