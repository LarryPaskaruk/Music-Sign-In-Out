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

/**
 *
 * @author 068787845
 */
public class JavaApplication20 {
    File checkOut = new File("");
   
    public void signOut (int stuNum, int instrumentNum){
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(checkOut,true));
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDateTime now = LocalDateTime.now();
            pw.println(dtf.format(now)+","+instrumentNum+","+stuNum+",out");
        } catch (IOException ex) {
            //Logger.getLogger(JavaApplication20.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    //how to change contents of a previously written record in the file
}
