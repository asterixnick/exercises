/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divideby3;

/**
 *
 * @author Nikos
 */
public class DivideBy3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int number = 8;
        int x = number % 3;
        if (x == 0) {
            System.out.println(number + " can be divided by 3");
        } else {
            System.out.println(number + " can not be divided by 3");
        }
    }

}
