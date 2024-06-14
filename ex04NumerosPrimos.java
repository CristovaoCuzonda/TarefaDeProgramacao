package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex04NumerosPrimos {
        public static void main(String [] args){
            Scanner receba= new Scanner(System.in);
            
            
            System.out.println("O intervalo começa de ");
            int inicio = receba.nextInt();
            System.out.println("e vai até "); 
            int fim = receba.nextInt();
            int primo = 0;

            for (int i=inicio; i <= fim; i++ ){
                for (int j = 2; j <i; j++){
                    
                        if(i % j == 0){
                            primo = 0;
                            break;
                        }
                        else{
                            primo = i;
                           
                        }
                }
                if(primo > 0){
                    System.out.print(primo+", ");
                }
                
              
            }
            receba.close();
        }

}
