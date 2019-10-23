/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borndate;

/**
 *
 * @author Nikos
 */
public class BornDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int thisYear = 2019;
        int myAge = 77;
        //int agePerson2 = 55;
        //int agePerson3 = 75;
        
        int bornDate = thisYear - myAge;
        System.out.println("i borded in "+ bornDate);

        int pastYear = 1960;
        int laterYear = 2040;
        int age1;
        if (bornDate > pastYear){
            System.out.println("I was not borned");
        }else{
            age1 = pastYear - bornDate;
            System.out.println("In " + pastYear +" i was " +age1+ " year old");
        }
        int age2 = laterYear - bornDate;
        
        System.out.println("In " + pastYear +" i will be " +age2+ " year old");
         
    }
    
}
