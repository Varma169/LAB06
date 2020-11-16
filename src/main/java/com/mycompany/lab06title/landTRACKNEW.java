/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab06title;



public class landTRACKNEW {
    
    double len=0;
    double wid=0;
    
 public landTRACKNEW(double length, double width)
    {
    this.len= length;
    this.wid=width;
 
    }

    public landTRACKNEW() {
    }

    public double getLength() {
        return len;
    }

    public double getWidth() {
        return wid;
    }

    public void setLength(double length) {
        this.len = length;
    }

    public void setWidth(double width) {
        this.wid = width;
    }
    
   public double landarea()
   {
       double area= len* wid;
       return area;
   }
   
   public String EQUALS(double a1, double a2)
   {
       String isEQUAL;
       if(a1== a2)
       {
           isEQUAL="BOTH ROOM SIZE ARE EQUAL";
       }
       else
       {
           isEQUAL="BOTH ROOM SIZE ARE NOT EQAUL";
       }
       return isEQUAL;
       
       
   }
   
   public void landtoString(String EQUALS)
   {
   System.out.println(EQUALS);
   }
}