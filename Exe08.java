package lista12;

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Início do intervalo: ");
		        int inicio = scanner.nextInt();
		        System.out.print("Fim do intervalo: ");
		        int fim = scanner.nextInt();

		        System.out.println("Números primos:");
		        for (int num = inicio; num <= fim; num++) {
		            boolean primo = true;
		            if (num <= 1) primo = false;
		            for (int i = 2; i <= Math.sqrt(num); i++) {
		                if (num % i == 0) {
		                    primo = false;
		                    break;
		                }
		            }
		            if (primo) System.out.println(num);
		        }

		        scanner.close();
		    }
		}

