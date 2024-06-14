package TarefaDeProgramacaoII;
import java.util.Scanner;
/*
 * Autor: Cristóvão Cuzonda
 * Exercício 03: Fatoial de um numero
 */
public class ex03FatorialDeUmNumero {
    public static void main(String[] args){
        Scanner receba = new Scanner(System.in);
        int numero,fatorial = 1; 


        System.out.println("Digite um numero: "); 
        numero = receba.nextInt();

        for (int i=1; i <= numero; i++){
            fatorial*= i;
        }
        System.out.println("Fatorial de "+ numero + " é igual a: " + fatorial);
        receba.close();
    }

}
