package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex22SalarioMinimo {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite o seu salário");
    float salario = ler.nextFloat();

    float salarioMinimo = 32181.15f;
    System.out.println("Sendo o salario mínimo de: "+ salarioMinimo);

    int vezes =(int)(salario/salarioMinimo);
    System.out.println("O seu salário é: "+vezes+" vezes o salário mínimo"); 
    ler.close();
  }
    
}
