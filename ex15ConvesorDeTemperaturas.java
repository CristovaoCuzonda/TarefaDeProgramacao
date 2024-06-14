package TarefaDeProgramacaoII;
import java.util.Scanner;
public class ex15ConvesorDeTemperaturas {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Converter: \n1-Temperatura em Celsius \n2-Temperatura em Kelvin \n3-Temperatura em Fahrenheit  ");
        int opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor da temperatura em Celsius: ");
                int TCelsius = ler.nextInt();

                System.out.println("Gostaria de converter para: \n1-Kelvin \n2-Fahrenheit");
                int converte = ler.nextInt();
                int TKelvin = TCelsius + 273;
                int TFahrenheit = (int)((TCelsius*1.8) + 32);
                switch (converte) {
                    case 1:
                        
                        System.out.print("Temperatura em Kelvin: TK= "+ TKelvin);

                        break;
                    case 2: 
                       
                        System.out.print("Temperatura em Fahrenheit: TF = "+ TFahrenheit);
                        break;
                
                    default:
                        System.out.println("Opção Invalida|!|");

                        break;
                }
                break;
            
            case 2:
                
            System.out.println("Digite o valor da temperatura em Kelvin: ");
             TKelvin = ler.nextInt();

            System.out.println("Gostaria de converter para: \n1-Celsius \n2-Fahrenheit");
            converte = ler.nextInt();

            TCelsius = TKelvin - 273;
            TFahrenheit = (int)(((TKelvin-273)*1.8) + 32);

            switch (converte) {
                case 1:
                    
                    System.out.print("Temperatura em Celsius: TC= "+ TCelsius);

                    break;
                case 2: 
                   
                    System.out.print("Temperatura em Fahrenheit: TF = "+ TFahrenheit);
                    break;
            
                default:
                    System.out.println("Opção Invalida|!|");

                    break;
            }
            break;
        
            case 3:
            System.out.println("Digite o valor da temperatura em Kelvin: ");
             TFahrenheit = ler.nextInt();

            System.out.println("Gostaria de converter para: \n1-Celsius \n2-Kelvin");
            converte = ler.nextInt();
            
            TCelsius =(int) ((TFahrenheit + 32)/1.8);
            TKelvin = (int)(((TCelsius+273)*1.8) + 32);
            switch (converte) {
                case 1:
                    System.out.print("Temperatura em Celsius: TC= "+ TCelsius);
                    break;
                case 2: 
                    System.out.print("Temperatura em Kelvin: TK = "+ TKelvin);
                    break;
            
                default:
                    System.out.println("Opção Invalida|!|");
                    break;
            }

                break;             
            default:
                break;
        }
        System.out.println("");
        ler.close();
    }
}
