import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente !");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da conta !");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o número da agência !");
        int agencia = sc.nextInt();


        System.out.println("Por favor, digite o valor do saldo !");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);


    }
}