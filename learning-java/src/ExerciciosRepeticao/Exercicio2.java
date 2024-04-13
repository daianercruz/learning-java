import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] nomes = new String[ 10    ];
		for (int i = 0; i < 10; i++) {
    	String nome = sc.nextLine();
    	if (i == 2 || i == 6 || i == 8)
        System.out.println(nome);
}

	}
}