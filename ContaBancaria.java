public class ContaBancaria {
    private Cliente cliente;
    private double saldo;

    public ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso. Saldo atual: R$ " + saldo);
    }

    public void pagarConta(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Conta paga com sucesso. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void emitirFatura() {
        System.out.println("Emitindo fatura para " + cliente.getNome() + " (CPF: " + cliente.getCpf() + ")");
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
