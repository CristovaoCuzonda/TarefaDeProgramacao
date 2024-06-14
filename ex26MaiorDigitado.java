package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex26MaiorDigitado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos numeros quer digitar: ");
        int qtNumeros = ler.nextInt();
        int num1, maior=0;
        System.out.println("Os numeros: ");
        for(int i=1; i <= qtNumeros; i++){
            num1 = ler.nextInt();
            if(num1 > maior){
                maior= num1;
            }
        }
        System.out.println("O maior numero digitado foi: "+maior);
        ler.close();
    }
}
