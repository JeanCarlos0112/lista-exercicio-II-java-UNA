import java.util.Scanner;
public class Exerciciolist25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, insira um valor:");
        double numeroUm = sc.nextDouble();                                                   
        System.out.println("Digite uma das operações a seguir: + (adição), - (subtração), / (divisão), * (multiplicação), ^ (potenciação)");
        double operador = sc.nextDouble();
        System.out.println("Por favor, insira outro valor");
        double numeroDois = sc.nextDouble();
        switch(operador){
            case '+':
                double soma = numeroUm + numeroDois;
                System.out.println(String.format("O resultado da soma é %.2f.", soma));
            case '-':
                double subtracao = numeroUm - numeroDois;
                System.out.println(String.format("O resultado da subtração é %.2f", subtracao));
            case '/':
                double divisao = numeroUm / numeroDois;
                System.out.println(String.format("O resultado da divisão é %.2f", divisao));
            case '*':
                double multiplicar = numeroUm * numeroDois;
                System.out.println(String.format("O resultado da divisão é %.2f", multiplicar));
            case '^':
                double potencia = Math.pow(numeroUm, numeroDois);
                System.out.println(String.format("O resultado da potenciação é %.2f", potencia));
            default:
                System.out.println("o símbolo da operação é inválido.");
        close.sc();        
        }          
                                                      
    }                     
    
}
