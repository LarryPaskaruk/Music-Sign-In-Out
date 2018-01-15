/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *Done by Michelle
 * @author 348948605
 */
public class Instrument {
    private int barNum;
    private String name;
    private String history;

    public int getBarNum() {
        return barNum;
    }

    public String getName() {
        return name;
    }

    public void setBarNum(int barNum) {
        this.barNum = barNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHistory(String h) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.history+=("\n"+dtf.format(now)+h);
    }

    @Override
    public String toString() {
        return(name+"\n"+history);
    }
    
    
}
