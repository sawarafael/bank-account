
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 28;
        double novoSaldo;

        if (saldo > valorSolicitado) {
            novoSaldo = saldo - valorSolicitado;
            System.out.println("O novo saldo é de: " + novoSaldo);
        }

        if (saldo < valorSolicitado) {
            System.out.println("Saldo Insuficiente");
        }
    };
}