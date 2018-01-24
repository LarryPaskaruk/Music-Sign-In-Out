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
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 *
 * @author 348948605
 */
public class Password {//password class done by Michelle
    static File password = new File("Password.txt");
    /**
     * Encrypt and save a new password to replace the old password
     * @param pw the new password
     * @throws IOException 
     * @throws NoSuchAlgorithmException 
     */
    //Done by Michelle
    public static void newPassword(String pw) throws IOException, NoSuchAlgorithmException{
        PrintWriter writer = new PrintWriter(new FileWriter(password,true));
        MessageDigest mesd = MessageDigest.getInstance("SHA-256");
        mesd.update(pw.getBytes());//perform the encryption
        byte byteData[]=mesd.digest();
        String sb1="";
        for (int i = 0; i < byteData.length; ++i) {//express the byte data as a hexadecimal number
            sb1 += (Integer.toHexString((byteData[i] & 0xFF) | 0x100).substring(1,3));
        }
        writer.println(sb1);//print the encrypted password
        writer.close();//close the print writer
    }
    /**
     * Checking if the user entered the right password when logging in
     * @param pw the password entered by the user
     * @return true if the password is correct, false if password is incorrect
     * @throws FileNotFoundException
     * @throws NoSuchAlgorithmException 
     */
    //Done by Michelle
    public static boolean login(String pw) throws FileNotFoundException, NoSuchAlgorithmException{
        MessageDigest mesd = MessageDigest.getInstance("SHA-256");
        boolean pW=false;
        Scanner s=new Scanner(password);
        String encrypted="";
            //get the last record on the file for the most current password
        while(s.hasNextLine()){
            encrypted=s.nextLine();
        }
            //encrypt the password to check it it matches the one on the record
            mesd.update(pw.getBytes());
            byte byteData[]=mesd.digest();
            String sb1="";
            for (int j = 0; j < byteData.length; j++) {//express the byte data as a hexadecimal number
                sb1 += (Integer.toHexString((byteData[j] & 0xFF) | 0x100).substring(1,3));
                //somehow cannot encrypt right
            }
            if(encrypted.equals(sb1)){
                pW=true;//if the password matches, pW becomes true
            }
            return pW;
    }
}
