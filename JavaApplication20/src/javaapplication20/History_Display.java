/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 069982957
 */
public class History_Display {
    public static File history = new File ("History.txt");
    public static Scanner s;
    
    
public static void historyDisplay(){
        String [] hisEnt = new String[4];
        try {
            s = new Scanner(history);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        while (s.hasNextLine()) {
            String hisData = s.nextLine();
            hisEnt = hisData.split(",");
    }
}
