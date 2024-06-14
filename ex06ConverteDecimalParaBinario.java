package TarefaDeProgramacaoII;
/*
 * Autor : Cristóvão Cuzonda
 * Conversão de decimal para binario;
 */
import java.util.Scanner;
public class ex06ConverteDecimalParaBinario {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
    
        System.out.print("Digite um numero decimal: ");
        int decimal = ler.nextInt();
        int decimal1 = decimal;
        int decimal2 = decimal;
        String Binario="";
        String octal = "";
        String hexadecimal = "";
            while(decimal > 0){
                int resto = decimal%2;
                Binario= resto + Binario;
                decimal/=2;
            }
            while(decimal1 > 0){
                int resto = decimal1 % 8;
                octal = resto + octal;
                decimal1/=8; 
            }
            while(decimal2 > 0){
                int resto = decimal2 % 16;
                hexadecimal = resto + hexadecimal;
                decimal2/=16; 
            }

            System.out.print("Conversão em binario: "+Binario+"\nConversão em octal: "+ octal+ "\nConversão em hexadecimal: "+hexadecimal);
        
             ler.close();
    }

}
