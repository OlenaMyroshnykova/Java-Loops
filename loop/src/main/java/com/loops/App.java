package com.loops;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        while (true) {
            System.out.print("\nIngrese un número para la tabla de multiplicar: ");
            int number = scanner.nextInt();

            MultiplicationTable table = new MultiplicationTable();
            table.printTable(number);

            String response;
            do {
                System.out.print("\nPresiona Y para continuar... Y/N: ");
                response = scanner.next().trim(); 

                if (!response.equalsIgnoreCase("Y") && !response.equalsIgnoreCase("N")) {
                    System.out.println("Por favor, ingrese Y o N.");
                }

            } while (!response.equalsIgnoreCase("Y") && !response.equalsIgnoreCase("N"));

            if (response.equalsIgnoreCase("N")) {
                System.out.println("\nChao!");
                break; 
            }
        }

        scanner.close();
    }    
}
