/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviequote;

import java.util.Scanner;

/**
 *
 * @author Nikos
 */
public class MovieQuote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("What is your favorite movie?");
        Scanner sc = new Scanner(System.in);
            
        String movie;
        movie = sc.nextLine();
        System.out.println("My Favorite movie is :" +movie);

        int count = 0;
        int thesh = 0;

        for (int i = 0; i <= movie.length(); i++) {
            thesh = movie.indexOf(" ", i);
            if (thesh > 0) {
                i = thesh;
                count++;

            } else {

            }
        }
        System.out.println("It has "+count+" spaces");

    }
}
