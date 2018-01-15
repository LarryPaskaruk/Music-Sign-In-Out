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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *Student engine done by Michelle
 * @author 068787845
 */
public class StudentEngine {
    File checkOut = new File("");
   
    public void signOut (int stuNum, int instrumentNum) throws IOException{
            PrintWriter pw = new PrintWriter(new FileWriter(checkOut,true));
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDateTime now = LocalDateTime.now();
            //format of each record is in: time, instrument number, student number, out
            pw.println(dtf.format(now)+","+instrumentNum+","+stuNum+",out"); 
    }
    
    public void signIn (int stuNum, int instrumentNum) throws IOException{
            PrintWriter pw = new PrintWriter(new FileWriter(checkOut,true));
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDateTime now = LocalDateTime.now();
            //format of each record is in: time, instrument number, student number, in
            pw.println(dtf.format(now)+","+instrumentNum+","+stuNum+",in"); 
    }
}
