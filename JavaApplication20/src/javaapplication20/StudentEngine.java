/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.io.File;
import java.io.FileNotFoundException;
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
    public static void signInOut (String stuNum, String instrumentNum) throws IOException{
        File history = new File("History.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(history,true));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        Scanner s = new Scanner(history);
        LocalDateTime now = LocalDateTime.now();
        // check that student and instrument are in system
        
    //loop through the previous contents of the file to check if this instrument has been checked out or not
        //read every line into an arraylist
        ArrayList a=new ArrayList<String>();
        while(s.hasNextLine()){
            a.add(s.nextLine());
        }
        int j=0;//variable to check if the instrument is a new instrument
        //create for loop that starts from the end of the arraylist (most recent)
        for(int i=a.size()-1;i>=0;i--){
            //for each line, chech if it is the current instrument
            String [] record=a.get(i).toString().split(",");
            if (record[1].equals(instrumentNum)){
                //if so, change j to show instrument have been found, and then check if it was signed in or out
                j=1;
                if(record[3].equals("out")){
                    //if out, print a record signing the instrument in
                    pw.println(dtf.format(now)+","+instrumentNum+","+stuNum+",in"); 
                    break;
                }
                else //if in, print a record signing the instrument out
                    pw.println(dtf.format(now)+","+instrumentNum+","+stuNum+",out"); 
                    break;
            }
            //if not go to the next record
            else continue;
        }
        //print the record signing the instrument out if there is no previous record of this instrument
        if(j==0){
            pw.println(dtf.format(now)+","+instrumentNum+","+stuNum+",out"); 
        }
        pw.close();
        s.close();
    }
    //LARRY
    public static int errorCases(String stuNum, String instrumentNum){
        boolean stu=false;
        boolean inst=false;
        File students = new File("Students.txt");
        File instruments = new File("Instruments.txt");
        Scanner sScan;
        try {
            sScan = new Scanner(students);
            while (sScan.hasNextLine()){
            String line = sScan.nextLine();
            String[] tempStu = line.split(",");
            //check if user matches each line in the file
            if(tempStu[0].equals(stuNum)){
                stu=true; 
                break;
            }
        } 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentEngine.class.getName()).log(Level.SEVERE, null, ex);
        }  
        try {
            Scanner iScan = new Scanner(instruments);
            while (iScan.hasNextLine()){
            String line = iScan.nextLine();
            String[] tempInst = line.split(",");
            //check if user matches each line in the file
            if(tempInst[0].equals(instrumentNum)){
                inst=true; 
                break;
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentEngine.class.getName()).log(Level.SEVERE, null, ex);
        }
        //if instrument and student are in system
            if(inst==true&&stu==true){
                return 0;
            }
        // if only instrument is in system
            else if(inst==true&&stu==false){
                return 1;
            }
        //if only student is in system
            else if(inst==false&&stu==true){
                return 2;
            }
        //if neither are in system
            else{
                return 3;
            }
    }
}
