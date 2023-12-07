package org.example.exercices.strategy_navVehicle;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        NavigationSystem navigationSystem = new NavigationSystem.NavigationSystemBuilder().destination("New York").build();

        String choice;
        do {
            System.out.println("1 -- Eco");
            System.out.println("2 -- Offroad");
            System.out.println("3 -- Road");
            System.out.println("0 -- destination reached");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    navigationSystem.kitt(new EconomicStrategy());
                    break;
                case "2":
                    navigationSystem.kitt(new OffroadStrategy());
                    break;
                case "3":
                    navigationSystem.kitt(new RoadStrategy());
                    break;
            }
        }while (!choice.equals("0"));

    }

}
