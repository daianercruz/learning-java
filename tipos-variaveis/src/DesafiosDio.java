//Você receberá dois valores inteiros.
// Faça a leitura e em seguida calcule o produto entre estes dois valores. 
//Atribua esta operação à variável PROD,
//mostrando esta de acordo com a mensagem de saída esperada

// primeira entrada deverá ser 3 9 
//A saida deverá ser PROD=27

// A segunda deverá ser -30 10 
//A saida deverá ser PROD=-300

// terceira entrada deverá ser 0 9 
//A saida deverá ser PROD=0

import java.util.Scanner;

public class DesafiosDio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		
		A = sc.nextInt();
		B = sc.nextInt();
		 
		PROD = A*B; //Preenchendo esse campo realizando a multiplicação do A e B


		System.out.println("PROD = " + PROD);
	}
}

