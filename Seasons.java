/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seasons;

/**
 *
 * @author Nikos
 */
public class Seasons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String month = "June";
        if(month == "January" || month == "February" || month == "March"){
            System.out.println("We have Winter");
        } else if (month == "April" || month == "May" || month == "June"){ 
            System.out.println("We have Spring");
        }else if (month == "July" || month == "August" || month == "September"){
            System.out.println("We have Summer");
        } else {
            System.out.println("We have Autumn");
        }
        
        
    }
    
}
