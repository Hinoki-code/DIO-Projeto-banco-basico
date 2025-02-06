import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Digite o numero da conta: ");
            int Numero = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o nome da Agencia:");
            String Agencia = scanner.nextLine();

            System.out.println("Digite o nome do Cliente:");
            String Cliente = scanner.nextLine();
        
            System.out.println("Digite o saldo da conta:");
            double Saldo = scanner.nextDouble();
            scanner.nextLine();  

            scanner.close();

    
            System.out.println("Olá " + Cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " +  Numero + " e seu saldo " + Saldo+ " já está disponível para saque.");
        }
    }
}