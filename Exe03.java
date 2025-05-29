package lista12;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Quantos termos triangulares deseja? ");
		        int n = scanner.nextInt();

		        for (int i = 1; i <= n; i++) {
		            int triangular = i * (i + 1) / 2;
		            System.out.println("Termo " + i + ": " + triangular);
		        }

		        scanner.close();
		    }
		}



