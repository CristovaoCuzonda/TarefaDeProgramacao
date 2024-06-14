package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex32NumerosRepetidosEmVector {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int[] duplicados= new int[5];
        int contador=0;
        String s="12345";
        boolean b = false;
        int[]repetidos=new int[5];
        System.out.println("Digite 50 números: ");
        for( int i=0; i< duplicados.length; i++){
            duplicados[i] =s.charAt(i);
            System.out.println(""+duplicados);
            System.out.print((i+1)+": ");
            duplicados[i] =  ler.nextInt();
        }
        for(int i =0; i<duplicados.length;i++){
            for(int j=0; j<duplicados.length; j++){
                
                    
                
            }
        }
        ler.close();
    }

}
