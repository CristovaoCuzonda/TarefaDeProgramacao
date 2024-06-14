package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ConversaoDeMoeda {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor mónetario: ");
        double valor = ler.nextDouble();
        
        System.out.println("Taxa de Cambio: ");
        double cambio = ler.nextDouble();
        

        double outroValorMonetaria = valor * cambio;

        System.out.println("Com o cambio de "+cambio+", convertendo o"+valor+" em outra moeda é: "+outroValorMonetaria+"(u.m)");
        ler.close();
    }
}
