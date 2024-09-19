import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {

        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário e armazenar as informações
        System.out.println("Por favor, digite o número da Conta!");
        System.out.print("Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        System.out.print("Agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome!");
        System.out.print("Nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("");
        System.out.println("Por favor, digite o seu saldo!");
        System.out.print("Saldo: ");
        Double saldo = scanner.nextDouble();
        scanner.nextLine();


        //Exibir a mensagem conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, numeroAgencia, numeroConta, saldo);

        // Fecha o scanner
        scanner.close();
    }
}