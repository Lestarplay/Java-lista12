package lista12;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite um número: ");
		        int num = scanner.nextInt();
		        int soma = 0;

		        for (int i = 1; i < num; i++) {
		            if (num % i == 0) soma += i;
		        }

		        if (soma == num) {
		            System.out.println(num + " é um número perfeito.");
		        } else {
		            System.out.println(num + " não é um número perfeito.");
		        }

		        scanner.close();
		    }
		}

