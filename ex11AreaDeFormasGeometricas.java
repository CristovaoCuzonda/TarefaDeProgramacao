package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex11AreaDeFormasGeometricas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char resp;    
    do{
        System.out.println("Cálculo da área de formas geometricas");
        System.out.println("Pretede calcular: ");
        System.out.println("1-Triângulo \n2-Retângulo \n3-Quadrado \n4-Círculo \nEscolha uma opção: ");
        int opcao = ler.nextInt();
    
        switch (opcao) {
            case 1:
                System.out.println("Digite o valor da base: ");
                float baseDoTriangulo = ler.nextFloat();
                System.out.println("Digite o valor da altura: ");
                float alturaDoTriangulo = ler.nextFloat();
                float areaDoTriangulo = (baseDoTriangulo * alturaDoTriangulo)/2;
                System.out.println("A área do triangulo é: " +areaDoTriangulo);
            
                break;
            case 2:
                    
                System.out.println("Digite o valor da base: ");
                float baseDoRetangulo = ler.nextFloat();
                System.out.println("Digite o valor da altura: ");
                float alturaDoRetangulo = ler.nextFloat();
                double areaDoRetangulo = alturaDoRetangulo * baseDoRetangulo;
                System.out.println("A area do retângulo: "+ areaDoRetangulo);
                break;
            case 3:
                
                System.out.println("Digite o valor do comprimento do quadrado: ");
                float ladoDoQuadrado = ler.nextFloat();
                
                double areaDoQuadrado = ladoDoQuadrado * ladoDoQuadrado;
                
                System.out.println("A área do quadrado: "+areaDoQuadrado);
                break;
            case 4:
                System.out.println("Digite o valor do raio: ");
                float raio = ler.nextFloat();
                double pi = Math.PI;
                double areaDoCirculo = (raio*raio*pi); 
                System.out.println("A área do quadrado: "+areaDoCirculo);
                break;     
            default:
                System.out.println("Opção Invalida");
                break;
        }
        System.out.println("Pretende continuar?(S/N)");
        resp = ler.next().charAt(0);
    }while(resp == 'S');
        ler.close();
    }
}
