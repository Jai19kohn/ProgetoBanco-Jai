public class Pessoa {
    public Pessoa(String nome, double numConta, double saldo ) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;

    }public Pessoa(String nome, double numConta, double saldo, String tConta) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
        this.tConta = tConta;
    }
    public Pessoa() {

    }
    private String nome;
    private double numConta;
    private double saldo;
    private String tConta;

    public String gettConta() {
        return tConta;
    }

    public void settConta(String tConta) {
        this.tConta = tConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(float numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public double sacar(double val){

        if(val > saldo){
            System.out.println("Seu saldo é insuficiente");
        } else{
            double saldoAtual = saldo -= val;
           saldo = saldoAtual;
        }
        return saldo;
    }
    public double depositar(double val){
        return saldo += val;
    }
    public double transferir(double val){
        return saldo -=val;
    }
    public double mostrarSaldo(){
        return getSaldo();
    }
    public double investir(double val){
        return saldo -=val;
    }
    public double contaPoupanca(double val){
        return saldo -= val;
    }

}
