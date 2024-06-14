package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex05MatrizSomaLinhaEColuna {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);
        
        
        System.out.println("Digite o tamanho da matriz");
        System.out.println("Linhas: ");
        int numDeLinha = ler.nextInt();
        System.out.println("Colunas: ");
        int numDeColuna = ler.nextInt();
        int [] somaLinha = new int[numDeLinha];
        int [][]matriz = new int[numDeLinha][numDeColuna];
        System.out.println("introduza o valores da matriz:");
        for (int i=0; i <= numDeLinha; i++){
            for(int j=0; j <= numDeColuna; j++){      
                matriz[i][j]= i + 1;

            }
        }
        for (int i=0; i<numDeLinha; i++){
            for (int j =0 ; j <numDeColuna; j++){
                somaLinha[i] = matriz[i][j];
            }
        }
        for (int i=0; i < somaLinha.length; i++){
            System.out.println("A soma da linha"+(i+1)+": " + somaLinha[i]);
        }
        ler.close();

    }
}
