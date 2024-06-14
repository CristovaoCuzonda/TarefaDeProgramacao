package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex29SubstituiPalavraDaString {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 
       System.out.println("Digite uma frase: ");
        String str= scanner.nextLine();
        System.out.println("Digite a palavra que pretende da frase: ");
        String oldWord = scanner.nextLine();
        System.out.println("Digite a nova palavra: ");
        String newPalavra = scanner.nextLine();
       System.out.println("Nova frase: "+ SubstituiPalavraDaFrase(str, oldWord, newPalavra));
        
        scanner.close();
        
    }
    public static String SubstituiPalavraDaFrase(String str,String oldWord,String newPalavra){
        str = str.replace(oldWord, newPalavra);
        return str;

    }
}
