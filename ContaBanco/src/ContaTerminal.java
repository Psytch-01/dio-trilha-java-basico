import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta (apenas números): ");
        int numeroConta = entradaScanner.nextInt();  
        entradaScanner.nextLine(); // Essa entrada serve para consumir a quebra deixada para tras pelo nextInt. Isso garante a limpeza do buffer.
        
        System.out.println("Por favor, digite o número da Agência (ex: 067-8): ");
        String agencia = entradaScanner.nextLine(); 

        System.out.println("Por favor, digite o seu Nome: ");
        String nomeCliente = entradaScanner.nextLine(); 
        
        System.out.println("Por favor, digite o seu Saldo: ");
        String saldoTexto = entradaScanner.nextLine().replace(",", "."); // Troca vírgula por ponto caso necessário
        double saldoDisponivel = Double.parseDouble(saldoTexto); // Converte de String para Double
        
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldoDisponivel + " já está disponível para saque.");
     
        entradaScanner.close();
    }
}
