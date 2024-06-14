package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex31Area_e_PerimetroDeUmCirculo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o raio de do circulo: ");
        double raio = ler.nextDouble();
        double  PI = Math.PI;
        double area = PI * raio * raio;
        double perimetro = (2 *PI) * raio;

        System.out.println("A area do circulo: "+area+"\nPerimetro do circulo: "+perimetro);
        ler.close();
    
    }
    
}
