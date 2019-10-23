/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaveragearray;

/**
 *
 * @author Nikos
 */
public class SumAverageArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Integer [] array = {5 , 11, 8, 12, 20};
        int megethosPinaka = array.length;
        int i =0;
        int sumPinaka=0 ;
        while(i < megethosPinaka){
            sumPinaka = sumPinaka + array[i];
            i++;
        }
            System.out.println("The sum of the array is :" +sumPinaka);
            
            float averagePinaka = sumPinaka/megethosPinaka; // gt den bgazei 11,2
            
            System.out.println("The average of the array is :" +averagePinaka);
        
        
    }
    
}
