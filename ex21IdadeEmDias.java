package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex21IdadeEmDias {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a sua idade: \nAnos: ");
        int Anos = ler.nextInt();
        System.out.print("meses: ");
        int meses = ler.nextInt();
        System.out.print("Dias: ");
        int dias = ler.nextInt();

        int idadeEmAnos = Anos*365 + meses*30 + dias;
        System.out.println("Idade em dias: "+idadeEmAnos);
        ler.close();
    }
}
