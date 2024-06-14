package TarefaDeProgramacaoII;
import java.util.Scanner;
/*
 * Autor: Cristóvão Cuzonda
 * Calculo da media e do Desvio Padrão
 */
public class ex10MediaEDesvioPadrao {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        double soma=0.0d, desvio=0.0d, media=0.0d;
        String fenomeno="";

        System.out.println("Defina a tamanho da amostra: ");
        int amostra = ler.nextInt();
        System.out.println("O que quer analisar (para calcular a Média e o Desvio Padrão)? ");
         fenomeno = ler.nextLine();
        
        double[] x = new double[amostra];
        System.out.println("Digite o valor de cada: ");

        for (int contador=0; contador < amostra; contador++ ){
            System.out.print("Valor"+(contador+1)+": ");
             x[contador] = ler.nextDouble();

            soma = x[contador] + soma;
        }
        media = soma/amostra;
        for (int i=0; i< amostra;i++){
            desvio = ((x[i]-media)*(x[i]-media)) + desvio;
        }
        double varianca = desvio/amostra;
        System.out.println("Sendo a variança = "+varianca);
        double DesvioPadrao = Math.sqrt(varianca);
        System.out.println("A média é"+fenomeno+" : "+ media+ "\nO Desvio Padrão é: "+DesvioPadrao); 
        
        ler.close();
    }
}
