public class Pj extends Pessoa{
    private String cnpj;

    public Pj(String nome, int numConta, int saldo, long cnpj) {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Pj(String nome, double numConta, double saldo, String tConta, String cnpj) {
        super(nome, numConta, saldo, tConta);

    }
    public Pj(String nome, double numConta, double saldo, String cnpj) {
        super(nome, numConta, saldo);

    }

    public Pj() {}
    @Override
    public double sacar(double val){
        val += val *0.005;
        return super.sacar(val);
    }
    public double transferir(double val){
        val+= val*0.005;
        return super.transferir(val);
    }

    public double investir(double val){
         val+=val * 0.02;
         return super.investir(val);
    }

}

