/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab06title;

import java.util.Scanner;






public class landtractnew {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the measurements of room 1:");
        double oneroomlength= sc.nextDouble();
              double oneroomwidth = sc.nextDouble();
       
        System.out.println("Please enter the measurements of room 2:");
        double secondroomlength = sc.nextDouble();
        double secondroomwidth=sc.nextDouble();
        
        landTRACKNEW room1= new landTRACKNEW(oneroomlength,oneroomwidth);
        landTRACKNEW room2 = new landTRACKNEW(secondroomlength, secondroomwidth);        
        
        
        double track1area= room1.landarea();
        
        double track2area = room2.landarea();
        
        System.out.println("DIMENSIONS OF THE ROOM1:-"+track1area);
        
        System.out.println("DIMENSIONS OF THE ROOM2:-" + track2area);
        
        String equal=room1.EQUALS(track1area, track2area);
        room1.landtoString(equal);
        
    }
}
