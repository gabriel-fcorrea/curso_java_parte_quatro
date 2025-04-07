package application;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira dois números inteiros: ");
		System.out.print("Primeiro número: ");
		Integer m = sc.nextInt();
		System.out.print("Segundo número: ");
		Integer n = sc.nextInt();

		Integer matriz[][] = new Integer[m][n];

		System.out.println("Preencha as linhas e colunas da matriz:");

		for (Integer i = 0; i < matriz.length; i++) {
			for (Integer j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.print("Escolha um número pertencente à matriz: ");
		int x = sc.nextInt();

		for (Integer i = 0; i < matriz.length; i++) {
			for (Integer j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == x) {
					System.out.println("Position: " + i + ", " + j);
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}
					if (j > matriz[i].length - 1) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i - 1][j]);
					}
					if (i < matriz.length - 1) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}
				}

			}
		}

		sc.close();
	}

}
