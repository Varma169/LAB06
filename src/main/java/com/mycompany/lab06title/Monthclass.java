
package com.mycompany.lab06title;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Monthclass
{
 private int NUMMONTH;
 

 public Monthclass()
 {
 NUMMONTH = 1;
 }

 
 public Monthclass(int month_num)
 {
 if(month_num < 1 || month_num > 12) NUMMONTH = 1;
 else NUMMONTH = month_num;
 }

 public Monthclass(String month_name)
 {
 if(month_name.equalsIgnoreCase("January")) NUMMONTH = 1;
 else if(month_name.equalsIgnoreCase("February")) NUMMONTH = 2;
 else if(month_name.equalsIgnoreCase("March")) NUMMONTH = 3;
 else if(month_name.equalsIgnoreCase("April")) NUMMONTH = 4;
 else if(month_name.equalsIgnoreCase("May")) NUMMONTH = 5;
 else if(month_name.equalsIgnoreCase("June")) NUMMONTH = 6;
 else if(month_name.equalsIgnoreCase("July")) NUMMONTH = 7;
 else if(month_name.equalsIgnoreCase("August")) NUMMONTH = 8;
 else if(month_name.equalsIgnoreCase("September")) NUMMONTH = 9;
 else if(month_name.equalsIgnoreCase("October")) NUMMONTH = 10;
 else if(month_name.equalsIgnoreCase("November")) NUMMONTH = 11;
 else if(month_name.equalsIgnoreCase("December")) NUMMONTH = 12;
 }
 
 public void setMonthNumber(int month_num)
 {
 if(month_num < 1 || month_num > 12) NUMMONTH = 1;
 else NUMMONTH = month_num;
 }
 
 public int getmonthNumber()
 {
 return NUMMONTH;
 }
 
 public String getMonthName()
 {
 if(NUMMONTH==1) return "January";
 else if(NUMMONTH==2) return "February";
 else if(NUMMONTH==3) return "March";
 else if(NUMMONTH==4) return "April";
 else if(NUMMONTH==5) return "May";
 else if(NUMMONTH==6) return "June";
 else if(NUMMONTH==7) return "July";
 else if(NUMMONTH==8) return "August";
 else if(NUMMONTH==9) return "September";
 else if(NUMMONTH==10) return "October";
 else if(NUMMONTH==11) return "November";
 else if(NUMMONTH==12) return "December";
 return "January";
 }
 
 public String toString()
 {
 return getMonthName();
 }
 
 public boolean equals(Monthclass M)
 {
 return NUMMONTH==M.NUMMONTH;
 }
 public boolean greaterThan(Monthclass M)
 {
 return NUMMONTH>M.NUMMONTH;
 }
 public boolean lessThan(Monthclass M)
 {
 return NUMMONTH<M.NUMMONTH;
 }
 

}