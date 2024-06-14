package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex19MediaPonderada {
    public static void main(String[] args) {
        Scanner ler = new Scanner ( System.in);
        System.out.println("Digite a quatidade de notas: ");
        int elemento = ler.nextInt();
        int soma=0, amostra=0;

        int[] notas = new int[elemento];
        int[] frequencia = new int[elemento];
        System.out.println("Digite as notas e suas frequencias: ");
        for (int i=0; i < elemento; i++){
            System.out.print("Nota"+(i+1)+"= ");
            int nota = ler.nextInt();
            System.out.print("Frequencia"+(i+1)+"= ");
            int fi = ler.nextInt();

            notas[i] = nota;
            frequencia[i] = fi;
        }
        for (int j=0; j< elemento; j++){

             soma += notas[j]*frequencia[j];
             amostra += frequencia[j];
        }
        double mediaPonderada = (soma / amostra);
        System.out.println("A média ponderada das notas \nMédia = "+mediaPonderada);
        ler.close();
    }
}
