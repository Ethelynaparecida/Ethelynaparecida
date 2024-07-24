import java.util.Scanner;

public class ContaBanco {
 public  void coletarDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a agencia: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o numero da conta: ");
        int conta = scanner.nextInt();

        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua Agencia é " + agencia + " sua conta " + conta + " e seu saldo R$ " + saldo + "já está disponivel para saque.");
       
         
    }
}
