package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex14ContandoVogais {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra=ler.nextLine();
        int contador = 0;
        for (int i = 0; i < palavra.length(); i++){
            char word = palavra.charAt(i);
            if(word == 'a' || word == 'A'){
                contador++;
            }
            else{
                if(word == 'e'|| word == 'E'){
                    contador++;
                }
                else{
                    if(word == 'i'|| word == 'I'){
                    contador++;
                    }
                    else{
                        if(word == 'o'|| word == 'O'){
                            contador++;
                        }
                        else{
                            if(word == 'u'|| word == 'U'){
                                contador++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(contador);
        ler.close();
    }
}
