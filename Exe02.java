package lista12;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite um número inteiro: ");
		        int numero = scanner.nextInt();
		        int soma = 0;

		        String numStr = Integer.toString(Math.abs(numero));
		        for (int i = 0; i < numStr.length(); i++) {
		            soma += Character.getNumericValue(numStr.charAt(i));
		        }

		        System.out.println("Soma dos dígitos: " + soma);
		        scanner.close();
		    }
		}

