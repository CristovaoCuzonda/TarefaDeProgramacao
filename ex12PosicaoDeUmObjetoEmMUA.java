package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex12PosicaoDeUmObjetoEmMUA {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Cálculo da posição de um objeto \nInforme os dados t= ");
        double tempo = ler.nextDouble();
        System.out.print("S(inicial)= ");
        double posicaoInicial = ler.nextDouble();
        System.out.print("V(inicial)= ");
        double velocidadeInicial = ler.nextDouble();
        System.out.print("a = ");
        double aceleracao = ler.nextDouble();

        double posicaoFinal = ((posicaoInicial) + (velocidadeInicial * tempo) + (0.5*aceleracao*tempo*tempo));
        System.out.println("Pretende-se calcular : S = ? \nSabe-se que: S = Si + Vi.t + (1/2).a.t.t \nEntão S= "+ posicaoFinal);

        ler.close();
    }
}
