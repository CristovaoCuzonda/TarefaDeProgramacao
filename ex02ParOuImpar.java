package TarefaDeProgramacaoII;
import java.util.Scanner;
/*
 * Autor: Cristóvão Cuzonda
 * Exercício 02: Numero Par ou Impar
 */
public class ex02ParOuImpar {
    public static void main(String[] args){
        Scanner receba = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero: ");
        numero = receba.nextInt();

        String mensagem = (numero % 2 == 0)? " O numero é Par " : " O numero é Impar ";

        System.out.println(mensagem);

        receba.close();
    }
}
