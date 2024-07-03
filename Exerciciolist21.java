import java.util.Scanner;

public class Exerciciolist21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        float numeroUm = sc.nextFloat();
        System.out.println("Digite outro número:");
        float numeroDois = sc.nextFloat();
        System.out.println("Digite mais um número:");
        float numeroTres = sc.nextFloat();

        float media = (numeroUm + numeroDois + numeroTres) / 3;
        float maior = Math.max(numeroUm, Math.max(numeroDois, numeroTres));
        float menor = Math.min(numeroUm, Math.min(numeroDois, numeroTres));

        System.out.println(String.format("O %.2f é o maior número", maior));
        System.out.println(String.format("O %.2f é o menor número", menor));
        System.out.println(String.format("A média entre %.1f, %.1f e %.1f é %.2f", numeroUm, numeroDois, numeroTres, media));

        sc.close();
    }
}
