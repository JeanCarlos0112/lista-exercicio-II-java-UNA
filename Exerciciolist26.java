import java.util.Scanner;
public class Exerciciolist26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int num2 = sc.nextInt();
        
        int maior = Math.max(num1, num2);
        int menor = Math.min(num1, num2);
        
        int sorteio = (int) (Math.random() * (maior - menor + 1)) + menor;
        System.out.println("O número sorteado foi: " + sorteio);
        
        if (sorteio % 2 == 0) {
            System.out.println("O número sorteado é par.");
        } else {
            System.out.println("O número sorteado é ímpar.");
        }
        
        sc.close();
    }
    
}
