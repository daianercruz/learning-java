public class OperadoresUnarios{


    public static void main (String[]args){


        int numero = 5;
		
//Imprimindo o numero negativo
            System.out.println(- numero);

//incrementando numero em mais 1 numero, imprime 6
        numero ++;
            System.out.println(numero);

//incrementando numero em mais 1 numero, imprime 7

            System.out.println(numero ++);// ops algo de errado não está certo, tornou o número em 6

           System.out.println(numero);// agora sim, numero virou 7

//ordem de precedencia conta aqui
            System.out.println(++ numero);

        boolean verdadeiro = true;

            System.out.println("Inverteu " + !verdadeiro);

    }
}