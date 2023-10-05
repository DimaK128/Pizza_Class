package pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create arrays for prices and names of pizzas
        double[] prices = new double[5];
        String[] names = new String[5];

        // Asks the user to type information about pizza (price and name)
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of Pizza #" + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Enter the price of Pizza #" + (i + 1) + " (in UAH): ");
            prices[i] = scanner.nextDouble();
            scanner.nextLine(); // Helps to keep my code organized
        }

        // Creates an array of pizza objects which have name and price
        Pizza[] pizzas = new Pizza[5];
        for (int i = 0; i < 5; i++) {
            pizzas[i] = new Pizza(prices[i], names[i]);
        }

        // Sorts the array of pizzas by price using Bubble Sort
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < pizzas.length - 1; i++) {
                if (pizzas[i].getPrice() > pizzas[i + 1].getPrice()) {
                    // Swap pizzas[i] and pizzas[i+1]
                    Pizza temp = pizzas[i];
                    pizzas[i] = pizzas[i + 1];
                    pizzas[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        System.out.println();

        // Display the sorted list of pizzas
        System.out.println("Sorted list of pizzas:");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.getPizzaInfo());
        }
    }
}
