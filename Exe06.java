package lista12;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int soma = 0, count = 0;

		        for (;;) {
		            System.out.print("Digite um número (negativo para encerrar): ");
		            int num = scanner.nextInt();
		            if (num < 0) break;
		            soma += num;
		            count++;
		        }

		        if (count > 0) {
		            System.out.println("Média: " + (soma / (double) count));
		        } else {
		            System.out.println("Nenhum número válido foi informado.");
		        }

		        scanner.close();
		    }
		}
