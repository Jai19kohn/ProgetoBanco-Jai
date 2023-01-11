public class Pf extends Pessoa {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pf(String nome, double numConta, double saldo,String tConta, String cpf) {
        super(nome, numConta, saldo, tConta);

    }
    public Pf(String nome, double numConta, double saldo, String cpf) {
        super(nome, numConta, saldo);

    }
    public Pf() {

    }

}

