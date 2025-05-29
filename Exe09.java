package lista12;

import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Quantos elementos na lista? ");
		        int n = scanner.nextInt();
		        int[] lista = new int[n];

		        for (int i = 0; i < n; i++) {
		            System.out.print("Elemento " + (i + 1) + ": ");
		            lista[i] = scanner.nextInt();
		        }

		        System.out.println("Lista em ordem inversa:");
		        for (int i = n - 1; i >= 0; i--) {
		            System.out.println(lista[i]);
		        }

		        scanner.close();
		    }
		}

