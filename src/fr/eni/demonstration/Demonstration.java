package fr.eni.demonstration;

import java.util.Scanner;

public class Demonstration {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un entier :");
		int premierEntier = scanner.nextInt();
		
		
		System.out.println("Veuillez saisir un second entier :");
		int secondEntier = scanner.nextInt();
		scanner.close();
		
		int somme = premierEntier + secondEntier;
		System.out.println("La sommme des entiers est égale à " + somme);
	}

}