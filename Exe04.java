package lista12;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Quantos números você quer informar? ");
		        int n = scanner.nextInt();
		        int pares = 0, impares = 0;

		        for (int i = 0; i < n; i++) {
		            System.out.print("Digite o " + (i + 1) + "º número: ");
		            int valor = scanner.nextInt();
		            if (valor % 2 == 0) pares++;
		            else impares++;
		        }

		        System.out.println("Pares: " + pares + " | Ímpares: " + impares);
		        scanner.close();
		    }
		}


