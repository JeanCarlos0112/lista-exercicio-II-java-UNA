import java.util.Scanner;
public class Exerciciolist23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor de a: ");
        double a= sc.nextInt();
        System.out.println("Insira o valor de b: ");
        double b= sc.nextInt();
        System.out.println("Insira o valor de c: ");
        double c= sc.nextInt();
        if (a == 0 && b == 0 && c !=0){
            System.out.println("Coeficientes informados incorretamente.");
        }
        else if (a == 0 && b != 0){
            System.out.println("Essa é uma equação de primeiro grau");
            double x = -c / b;
            System.out.println(String.format("A raíz real da equação de primeiro grau é %.2f." , x));
        }
        else {
            double delta = (b*b) - (4*a* c);
        
            if (delta < 0){
                System.out.println("Esta equação não possuí raizes reais.");
            }
            else if (delta == 0){
                System.out.println("Esta equação possui duas raízes reais iguais. ");
                double x = (-b + delta)/(2*a);
                System.out.println(String.format("O valor da raíz da equação é %.2f.", x ));
            }
            else {
                System.out.println("Esta equação possui duas raízes reais diferentes." );
                double x = (-b + delta)/(2*a);
                double x1 = (-b - delta)/(2*a);
                System.out.println(String.format("Os valores reais dessa equação quadrática é %.2f, %.2f.",x,x1));
        close.sc();        
            }

        }
    }
    
    
}
