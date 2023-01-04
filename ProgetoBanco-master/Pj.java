public class Pj extends Pessoa{
    private long cnpj;

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public Pj(String nome, double numConta, double saldo, String tConta, long cnpj) {
        super(nome, numConta, saldo, tConta);

    }
    public Pj(String nome, double numConta, double saldo, long cnpj) {
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

