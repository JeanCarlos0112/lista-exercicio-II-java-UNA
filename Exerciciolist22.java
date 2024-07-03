import java.util.Scanner;

public class Exerciciolist22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int valorCompra, valorPago, troco;
        int notas50 = 0, notas20 = 0, notas10 = 0, notas5 = 0, notas2 = 0, notas1 = 0;
        
        System.out.print("Valor da compra: R$ ");
        valorCompra = sc.nextInt();
        
        System.out.print("Valor pago: R$ ");
        valorPago = sc.nextInt();
        
        if (valorPago < valorCompra) {
            System.out.println("Quantia paga é insuficiente para realizar a compra.");
        } else {
            troco = valorPago - valorCompra;
            System.out.println("Troco: R$ " + troco);
            
            if (troco >= 50) {
                notas50 = troco / 50;
                troco = troco % 50;
            }
            if (troco >= 20) {
                notas20 = troco / 20;
                troco = troco % 20;
            }
            if (troco >= 10) {
                notas10 = troco / 10;
                troco = troco % 10;
            }
            if (troco >= 5) {
                notas5 = troco / 5;
                troco = troco % 5;
            }
            if (troco >= 2) {
                notas2 = troco / 2;
                troco = troco % 2;
            }
            if (troco >= 1) {
                notas1 = troco;
            }
            
            System.out.println("Notas de R$ 50,00: " + notas50);
            System.out.println("Notas de R$ 20,00: " + notas20);
            System.out.println("Notas de R$ 10,00: " + notas10);
            System.out.println("Notas de R$ 5,00: " + notas5);
            System.out.println("Notas de R$ 2,00: " + notas2);
            System.out.println("Notas de R$ 1,00: " + notas1);
        }
        
        sc.close();
    }

}