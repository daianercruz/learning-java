package ControleFluxo;

public class ControleFluxo {


    public static void main(String[] args) {
        
            double saldo = 25.0;
            double valorSolicitado = 50.0;
 
                if(valorSolicitado < saldo){
                    saldo = saldo - valorSolicitado;
                    System.out.println(saldo);
                }
                else {
                    System.out.println("Valor insuficiente: " + valorSolicitado);
                }
                 
 



    }
    
}
