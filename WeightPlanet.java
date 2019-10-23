/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weightplanet;

import java.util.Scanner;

/**
 *
 * @author Nikos
 */
public class WeightPlanet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("what is your weight");
        Scanner sc = new Scanner(System.in);
        int myWeight;
        myWeight = sc.nextInt();

        System.out.println("In which planet do you want to go?");
        Scanner sc1 = new Scanner(System.in);
        String planet = "";
        planet = sc1.nextLine();
        float newWeight;
        switch (planet) {
            case "Venus":
                newWeight = 0.78f * myWeight;
                System.out.println("Your weight in" + planet + " is " + newWeight);
                break;
            case "Mars":
                newWeight = 0.39f * myWeight;
                System.out.println("Your weight in" + planet + " is " + newWeight);
                break;
            case "Jupiter":
                newWeight = 2.65f * myWeight;
                System.out.println("Your weight in" + planet + " is " + newWeight);
                break;
            case "Saturn":
                newWeight = 1.17f * myWeight;
                System.out.println("Your weight in" + planet + " is " + newWeight);
                break;
            case "Uranus":
                newWeight = 1.05f * myWeight;
                System.out.println("Your weight in" + planet + " is " + newWeight);
                break;
            case "Neptune":
                newWeight = 1.23f * myWeight;
                System.out.println("Your weight in" + planet + " is " + newWeight);
                break;
        }

    }

}
