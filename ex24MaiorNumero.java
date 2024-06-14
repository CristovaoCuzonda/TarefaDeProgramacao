package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex24MaiorNumero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1= ler.nextInt();
        System.out.println("Digite o segundoo numero: ");
        int num2= ler.nextInt();

        int maior = Math.max(num1, num2);
        System.out.println("O maior numro digitado: "+ maior);
        ler.close();
         
    }
}
