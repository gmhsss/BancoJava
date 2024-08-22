import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastrar cliente
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        Cliente cliente = new Cliente(nome, cpf);
        ContaBancaria conta = new ContaBancaria(cliente);

        int opcao;
        do {
            System.out.println("\n1. Sacar\n2. Depositar\n3. Pagar conta\n4. Verificar saldo\n5. Alterar informações\n6. Emitir fatura\n7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para sacar: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 2:
                    System.out.print("Digite o valor para depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor da conta a pagar: ");
                    double valorConta = scanner.nextDouble();
                    conta.pagarConta(valorConta);
                    break;
                case 4:
                    conta.verificarSaldo();
                    break;
                case 5:
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Digite o novo CPF: ");
                    String novoCpf = scanner.nextLine();
                    cliente.alterarInformacoes(novoNome, novoCpf);
                    break;
                case 6:
                    conta.emitirFatura();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 7);

        scanner.close();
    }
}
