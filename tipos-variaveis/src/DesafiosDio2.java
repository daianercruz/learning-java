//Leia dois valores inteiros identificados como variáveis A e B.
//Calcule a soma entre elas e chame essa variável de SOMA.
//A seguir escreva o valor desta variável.

//Primeira Entrada 30 10 saida soma = 40
//Segunda Entrada -30 10 saida soma = -20
//Terceira Entrada 0 0 saida soma =0

import java.util.Scanner;

public class DesafiosDio2 {

	public static void main(String[] args) {
	 	Scanner sc = new Scanner (System.in);
 
		int A, B, soma;
 
 		A = sc.nextInt();
		B = sc.nextInt();

 		soma = A+B;  
 
 		System.out.println("SOMA = " + soma);
	}
}