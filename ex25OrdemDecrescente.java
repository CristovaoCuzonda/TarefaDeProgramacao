package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex25OrdemDecrescente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num = ler.nextInt();

        for(int i = num; i >=0; i--){
            System.out.println(i);
        }
        ler.close();
    }
}
