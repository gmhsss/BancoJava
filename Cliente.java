public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void alterarInformacoes(String novoNome, String novoCpf) {
        this.nome = novoNome;
        this.cpf = novoCpf;
        System.out.println("Informações alteradas com sucesso!");
    }
}
