package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int matriz[][] = new int[n][n];

		System.out.println("Insira os valores: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Main diagonal: ");
		for (int i = 0; i < n; i++) {
			System.out.print(matriz[i][i] + " "); // imprime os números na diagonal
		}
		int sum = 0;
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					System.out.print(matriz[i][j] + " "); // imprime os números negativos
					sum++;
				}
			}
		}
		System.out.println("\nNegative numbers: " + sum);

		sc.close();
	}
}