package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex13PolimdromoOuCapicua {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        String word = ler.nextLine();
        String palvaraInvertida ="";
        for(int i = word.length()-1 ; i>=0; i--){
            palvaraInvertida += word.charAt(i) ;
        }
        if(palvaraInvertida.equals(word)){
            System.out.println("É um polimdromo!");
        }
        else{
            
            System.out.println("Não é um polimdromo!");
        }
        
        ler.close();
    }
}
