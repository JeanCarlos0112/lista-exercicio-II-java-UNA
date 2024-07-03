import java.util.Scanner;
public class Exerciciolist24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a operação desejada 1 - Calcular o perimetro do circulo, 2 - Calcular a área do circulo, 3 - Calcular o volume da esfera )");
        int operacao = sc.nextInt(); 
        System.out.println("Insira o valor do raio do circulo ou da esfera ");
        double r = sc.nextDouble();
        switch (operacao){
            case 1:
                double perimetro = 2 * Math.PI * r;
                System.out.println(String.format("O valor do perimetro do circulo é %.2f" , perimetro));
                break;
            case 2:
                double area = Math.PI * (r*r);
                System.out.println(String.format("O valor da área do circulo é %.2f ", area));
                break;
            case 3:
                double volume = (4/3) * Math.PI*(r*r*r);
                System.out.println(String.format("O valor do volume do circulo é %.2f" , volume));
                break;
            default:
                System.out.println("O código da operação é invalido, insira um valor de 1 a 3");    

        }
    }
}
