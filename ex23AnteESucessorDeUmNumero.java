package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex23AnteESucessorDeUmNumero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = ler.nextInt();

        int sucessor = numero + 1;
        int antecessor = numero -1;
        System.out.println("Sucessor: "+sucessor+"\nAntecessor: "+antecessor);
        ler.close();

    }
}
