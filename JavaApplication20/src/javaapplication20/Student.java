/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *LARRY
 * @author 068787845
 */
public class Student {
    int stuNumber;
    String fName;
    String lName;
    String email;
    public Student(int stuNumber, String fName, String lName, String email){
      this.stuNumber=stuNumber;
      this.fName= fName;
      this.lName=lName;
      this.email=email;
    }
    public void setStuNumber(int stuNumber){
       this.stuNumber=stuNumber; 
    }
    public void setFName(String fName){
       this.fName=fName; 
    }
    public void setLName(String lName){
       this.lName=lName; 
    }
    public void setEmail(String email){
       this.email=email; 
    }
    public int getStuNumber(){
        return stuNumber;
    }
    public String getFName(){
        return fName;
    }
    public String getLName(){
        return lName;
    }
    public String getEmail(){
        return email;
    }
    public String toString(Student s){
        return s.stuNumber+", "+s.fName+", "+s.lName+", "+s.email;
    }   
}