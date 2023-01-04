public class Pf extends Pessoa {
    private long cpf;



    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Pf(String nome, double numConta, double saldo,String tConta, long cpf) {
        super(nome, numConta, saldo, tConta);

    }
    public Pf(String nome, double numConta, double saldo, long cpf) {
        super(nome, numConta, saldo);

    }
    public Pf() {

    }

}

