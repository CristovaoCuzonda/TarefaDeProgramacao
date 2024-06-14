package TarefaDeProgramacaoII;
import java.util.*;
public class ex16SenhasSeguras {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("-------Gerador de senhas--------\nDiga o comprimento da senha: ");
        int comprimentoDaSenha = ler.nextInt();
        int[] senha1= new int[comprimentoDaSenha]; 
        String[] senha2= new String[comprimentoDaSenha];
        String []s ={"a", "b", "c","d","f","g","t"};

        System.out.println("Tipo de caractere permetidos: \n1-numeros \n2-caracteres");
        int escolha = ler.nextInt();
        int j =7;
        switch (escolha) {
            case 1:
                for(int i=0; i<comprimentoDaSenha;i++){
                 j = (int) (((Math.random())*10) + j);
                
                 senha1[i]= j;  
                 System.out.print(senha1[i]); 
                
                j--;
                }
                break;
            case 2:
            for(int i=0; i<comprimentoDaSenha;i++){
                j = (int) (((Math.random())*1) + j);
               
              
               if(i%2==0){
                    if(i>0){
                        s[i]=null;
                        s[i] =""+ j;
                    }
                    
               }
               senha2[i]=  s[i];  
               System.out.print(senha2[i]);               
               }
                break;
        
            default:
                break;
        }
        ler.close();
    }
}
