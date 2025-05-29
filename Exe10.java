package lista12;

import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite um número: ");
		        String numero = scanner.next();

		        int zeros = 0;
		        for (int i = 0; i < numero.length(); i++) {
		            if (numero.charAt(i) == '0') zeros++;
		        }

		        System.out.println("Quantidade de zeros: " + zeros);
		        scanner.close();
		    }
		}



