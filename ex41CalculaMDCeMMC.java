package TarefaDeProgramacaoII;
import java.util.Scanner;


public class ex41CalculaMDCeMMC {

   public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
        
    System.out.print("Digite o primeiro número: ");
    int num1 = ler.nextInt();
    
    System.out.print("Digite o segundo número: ");
    int num2 = ler.nextInt();

  
        int mdc = calcularMDC(num1, num2);
        int mmc = mmc(num2, mdc);

        
        System.out.println("MDC de " + num1 + " e " + num2 + ": " + mdc);
        System.out.println("MMC de " + num1 + " e " + num2 + ": " + mmc);

    ler.close();    
   }

private static int calcularMDC(int num1, int num2){
    while (num2 != 0) {
        int temp = num2;
        num2 = num1 % num2;
        num1 = temp;
    }
    return num1;

}
private static int mmc(int a, int b) {
    return a * (b / calcularMDC(a, b));
}}