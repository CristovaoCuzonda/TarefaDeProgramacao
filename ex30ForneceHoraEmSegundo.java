package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex30ForneceHoraEmSegundo {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a hora: ");
        int hora= ler.nextInt();
        System.out.print("Digite o minuto: ");
        int minuto = ler.nextInt();
        System.out.print("Digite o segundo: ");
        int segundos=ler.nextInt();

        int segundosPassados =(hora * 60*60) + (minuto * 60)+ segundos;
        int segundosParaMeiaNoite = 86400-segundosPassados;

        System.out.println("Se passaram: "+segundosPassados+"s\nFaltam "+segundosParaMeiaNoite+"s para meia-noite");
        ler.close();
    }
}
