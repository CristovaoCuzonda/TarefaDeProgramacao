package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex34DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o as coordenadas do ponto1: ");
        System.out.print("X1 = ");
        float x1 = ler.nextFloat();
        System.out.print("Y1 = ");
        float y1 = ler.nextFloat();
        
        System.out.println("Digite o as coordenadas do ponto2: ");
        System.out.print("X2 = ");
        float x2 = ler.nextFloat();
        System.out.print("Y2 = ");
        float y2 = ler.nextFloat();
        
        float distancia = (float) Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println("A distância entre P1("+x1+","+y1+") e P2("+x2+","+y2+") é: "+ distancia);
        ler.close();
    }
}
