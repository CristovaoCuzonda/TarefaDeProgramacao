package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex27Alturas_e_Sexos {
    public static void main (String[] args){
        Scanner ler =new Scanner(System.in);
        double[] alturas = new double[10];
        double media = 0.0D, soma = 0.0D;
        int contMulher=0, contHomens=0;
        String [] sexo = new String[10];
        double maior=0D, menor=10000D;
        for (int i=0 ; i<alturas.length;i++){
            System.out.print("Digite a altura da pessoa "+(i+1)+": ");
            alturas[i]= ler.nextDouble();
            
            if(maior < alturas[i]){
                maior = alturas[i];
            }
            if(menor> alturas[i]){
                menor = alturas[i];
            }
            if(alturas[i]%2 > 0.0D){
                sexo[i] = "Masculino";
                soma =alturas[i];
                contHomens++;
            }else{
                sexo[i]= "Femenino";
                contMulher++;
            }
           
            

        } 
        media= (soma)/contHomens;
        System.out.println("Maior Altura: "+maior+"\nMenor altura: "+menor+"\nMedia das Alturas do sexo masculino: "+media+"\nNumero de mulheres: "+contMulher);
        ler.close();
    }
}
