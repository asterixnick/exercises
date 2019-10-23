/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchagecolor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nikos
 */
public class MatchAgeColor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
               
        String x = name(sc);
        Integer y = age(sc);
        Integer z = weight(sc);
        
        System.out.println("Hey " + x +", it is cool to be " + y +" years old!" 
                + " You should buy a " + color(y) +" " +size(z) + " shirt");
             
    }
    
    static String name(Scanner sc){
        //Scanner sc = new Scanner(System.in);
        System.out.println("What is your name ?");
        String name ="";
        return sc.nextLine();
    }
    
    static Integer age(Scanner sc){
        //Scanner sc = new Scanner(System.in);
        System.out.println("What is your age ?");
        int age ;
        return age = sc.nextInt();
    }
    
    static Integer weight(Scanner sc){
        //Scanner sc = new Scanner(System.in);
        System.out.println("What is your weight ?");
        int weight ;
        return weight = sc.nextInt();
    }
    
    static String color(Integer x){
        String xrwma;
        if (x<18){
            xrwma = "White";
        } else if (x>=18 && x<25){
            xrwma = "Pink";
        }else if (x>=25 && x < 35){
            xrwma = "Red";
        }else if (x>=35 && x< 45){
            xrwma = "Green";
        }else if (x>=45 && x< 55){
            xrwma = "Blue";
        }else {
            xrwma = "Black";
        }
        return xrwma; 
    }
    
    static String size(Integer x){
        String  sizeShirt;
        if (x<50){
            sizeShirt = "Small";
        } else if (x>=50 && x< 65){
            sizeShirt = "Medium";
        }else if (x>=65 && x <=79){
            sizeShirt = "Large";
        }else {
            sizeShirt = "XLarge";
        }
        return sizeShirt; 
        
//    ArrayList<String> colorArray = new ArrayList<String>();
//        int i;
//        for (i=0 ; i<=17; i++){
//            colorArray.add("White");
//    }
//        for (i=18 ; i<=24; i++){
//            colorArray.add("Pink");
//    }
//        for (i=25 ; i<=35; i++){
//            colorArray.add("Red");
//    }
//        for (i=36 ; i<=45; i++){
//            colorArray.add("Green");
//    }
//        for (i=46 ; i<=55; i++){
//            colorArray.add("Blue");
//    }
//        for (i=56 ; i<150; i++){
//            colorArray.add("Black");
//    }
//        System.out.println(colorArray);
          
   }
