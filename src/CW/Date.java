/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CW;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author trist_w1549895
 */
public class Date {

    //variable related to date
    private int year;
    private int month;
    private int day;

    //constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    //empty constructor
    public Date() {
    }

    //set and get methods
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDate() {
        String dateStr = String.format("%02d/%02d/%04d", day, month, year);
        return dateStr;
    }

    @Override
    public String toString() {
        String dateStr = getDate();
        return dateStr;
    }

}
