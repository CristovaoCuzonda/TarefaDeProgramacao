package TarefaDeProgramacaoII;
import java.util.Scanner; 
public class ex28NumeroDeAzulejoDeUmaParede {
    public static void main(String[] args) {
        Scanner ler =new Scanner(System.in);

        //Quantos azulejos entram numa parede?
        //Dados da parede:
        System.out.println("Digite o altura da parede: ");
        float hp_AlturaDaParede = ler.nextInt();
        
        System.out.println("Digite a largura da parede: ");
        float lp_LarguraDaParede = ler.nextInt();

        //Dados do Azulejo
        System.out.println("Digite o altura do azulejo: ");
        float ha_AlturaDoAzulejo = ler.nextInt();
        
        System.out.println("Digite a largura do azulejo: ");
        float la_LarguraDoAzulejo= ler.nextInt();

        float areaDaParede = hp_AlturaDaParede * lp_LarguraDaParede;
        float areaDoAzulejo = ha_AlturaDoAzulejo * la_LarguraDoAzulejo;

        int qtDeAzulejo = (int) (areaDaParede/areaDoAzulejo);
        System.out.println("Para essa parede vamos precisar de: "+qtDeAzulejo);
        ler.close();

    }
}
