package lista12;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite uma string: ");
		        String texto = scanner.nextLine();

		        System.out.print("Reverso: ");
		        for (int i = texto.length() - 1; i >= 0; i--) {
		            System.out.print(texto.charAt(i));
		        }

		        scanner.close();
		    }
		}
