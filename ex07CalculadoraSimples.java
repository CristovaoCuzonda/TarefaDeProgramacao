package TarefaDeProgramacaoII;
import java.util.Scanner;

public class ex07CalculadoraSimples {
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);
        double resultado =0;
        System.out.println("Digite o primeiro numero: ");
        double num1 = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        double num2 = ler.nextInt();

        System.out.println("Operações:\n (+)- Adição \n (-) Subtração \n (/)- Divisão \n (*)- Multiplicação");
        System.out.print(" Escolha uma operação:");
        char operacao = ler.next().charAt(0);
        
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;

            case '/': 
                if (num2 != 0){
                    resultado = num1 / num2;
                }
                else{
                    System.out.print("Erro");
                }
                break;
             
            case '*':
                resultado = num1 * num2;
                break;
        
            default:
                System.out.println("Operação Invalida");
                break;
        }
        System.out.println("O resultado é: "+resultado);
        ler.close();
    }

}
