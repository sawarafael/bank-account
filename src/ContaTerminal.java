import java.util.Scanner;
public class ContaTerminal {
    public static void main(String args[]) {
        Scanner scanInput = new Scanner(System.in);

        System.out.println("Por favor, informe o número da sua agência: ");
        int Number = scanInput.nextInt();

        scanInput.nextLine();

        System.out.println("Por favor, informe a sua agência: ");
        String Agency = scanInput.nextLine();

        System.out.println("Por favor, informe o seu nome: ");
        String Name = scanInput.nextLine();

        System.out.println("Por favor, informe o seu saldo inicial: ");
        double Balance = scanInput.nextDouble();

        if (Number != 0 || Agency != null || Name != null) {
            if (Balance == 0) {
                System.out.println("Não é possível criar uma conta sem saldo!");
            } else {
                System.out.println("Olá " + Name + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agency + ", conta " + Number + " e seu saldo inicial é de " + Balance + "Reais e já está disponível para saque.");
            }
        } else {
            System.out.println("Não foi possível criar a conta.");
        }
    };
};
