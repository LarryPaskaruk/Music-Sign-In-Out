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
    public Student(int stuNumber, String fName, String lName){
      this.stuNumber=stuNumber;
      this.fName= fName;
      this.lName=lName;
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
    public int getStuNumber(){
        return stuNumber;
    }
    public String getFName(){
        return fName;
    }
    public String getLName(){
        return lName;
    }
    public String toString(Student s){
        return s.stuNumber+", "+s.fName+", "+s.lName;
    }   
}