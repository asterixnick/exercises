/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candobasedonage;

/**
 *
 * @author Nikos
 */
public class CanDoBasedOnAge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int age = 16;

        if (age < 16) {
            System.out.println("You cannot drive");
        }
        if (age >= 16 && age <= 17) {
            System.out.println("You can drive but not vote");
        }
        if (age >= 18 && age <= 21) {
            System.out.println("You can vote but not drink");
        } 
        if (age>21){
            System.out.println("You can do anything");
        }
    }
}


