package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex36CalculoDaNotaParaAprovacaoOuReprovacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("---Aluno Aprovado Ou Reprovado---");
        System.out.print("Digite a nota da P1: ");
        float P1 = ler.nextFloat();
        System.out.print("Digite a nota da P2: ");
        float P2 = ler.nextFloat(); 

        float media = (P1+P2)/2;
        if (media >= 5 && P1 >= 3.0 && P2>=3 ){
            System.out.println("A sua média foi de: "+media+"\nParabéns você foi Aprovado nesta cadeira!");
        }else{
            System.out.println("A sua média foi de:"+media+"\nInfelizmente nota insuficiente para passar direito \nDigite a nota da P3: ");
            float P3 = ler.nextFloat();

            if (P1 > P2){
                float media2 = (P3 + P1)/2;
                if(media2 >=5.0){
                    System.out.println("A sua média foi de: "+media+" \nAluno aprovado!");
                }else{
                    if(media2 < 5.0){
                        System.out.println("A sua média foi de: "+media+" \nAluno Reprovado!");
                    }
                }
            }
            else{
                float media2 = (P3 + P2)/2;
                if(media2 >=5.0){
                    System.out.println("A sua média foi de: "+media+" \nAluno aprovado!");
                }else{
                    if(media2 <5.0){
                        System.out.println("A sua média foi de: "+media+" \nAluno Reprovado!");
                    }
                }
            }

        }
        ler.close();
    }
}
