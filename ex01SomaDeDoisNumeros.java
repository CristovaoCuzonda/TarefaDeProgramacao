package TarefaDeProgramacaoII;
import java.util.Scanner;
//Autor: Cristóvão Cuzonda
//Exercicio 01: A soma de dois numeros digitados pelo usuário
public class ex01SomaDeDoisNumeros {
    public static void main (String [] args){
        
        Scanner receba = new Scanner(System.in);
        int num1, num2, soma;

        System.out.println("Digite o primeiro numero: ");
        num1 = receba.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = receba.nextInt();
        soma = num1 + num2;
        System.out.println("A soma entre "+ num1 + " e " + num2 + " é igual a: "+ soma);

        receba.close();

    }
}
