package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex08BuscaBinaria {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        
        boolean achou = false;
        System.out.println("Digite o tamanho do vector: ");
        int tamanho = ler.nextInt();
        int []BuscaBinaria = new int[tamanho];
        
        int fim =tamanho-1;
        int inicio =0, posicao=0, meio =0;
        for (int i=0; i<tamanho; i++){
            BuscaBinaria[i]= i*2;
            System.out.println(BuscaBinaria[i]);
            
        }
        System.out.println("O valor que gostaria de buscar: ");
        int valor = ler.nextInt();
        while(inicio <= fim ){
            meio = (int) ((inicio + fim)/2);
            if(BuscaBinaria[meio] == valor){
                achou = true;
                posicao = meio;
                break;
            }else{
                if(BuscaBinaria[meio] < valor){
                    inicio = meio+1;
                    
                }
                else{
                    fim = meio - 1;
                }
            }
        }
        if (achou == true){
            System.out.println("Achou! \nEstá na posição " + posicao+ "do vector");
        }
        else{
            System.out.println("Não achou");
        }

        ler.close();
    }
}
