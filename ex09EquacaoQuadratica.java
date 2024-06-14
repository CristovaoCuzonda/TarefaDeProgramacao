package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex09EquacaoQuadratica {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        double a,b,c;

        System.out.print("Digite o valor de: \na = ");
        a = ler.nextDouble();
        System.out.print("b = ");
        b = ler.nextDouble();
        System.out.print("c = ");
        c = ler.nextDouble();

        double delta = (b*b)-4*a*c;

        if(delta > 0){
            double x1 = (-b - Math.sqrt(delta))/2*a;
            double x2 = (-b + Math.sqrt(delta))/2*a;
            System.out.println("Como Delta > 0: \nEntão existem duas soluções possiveis\nRaizes ou zeros da equação: {"+x1+","+x2+"}");
        }else{
            if(delta == 0){
                double x1 = (-b/(2*a));
                double x2=x1;

                System.out.println("Como Delta = 0: \nEntão existe apenas uma solução\n Solução: X1 = X2 ="+ x2);

            }else{
                System.out.println("Não existe solução em R");
    
            }
        }
        ler.close();
    }
}
