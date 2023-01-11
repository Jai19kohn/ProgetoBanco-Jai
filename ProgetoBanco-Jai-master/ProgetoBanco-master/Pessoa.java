import java.util.Scanner;

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

            System.out.println("Seu saldo é: " + saldo);
        }
        return saldo;
    }
    public double depositar(double val){
        return saldo += val;
    }
    public double transferir(double val3){
        if(val3 > saldo){
            System.out.println("Seu saldo é insuficiente");
        } else{
            double saldoAtual = saldo -= val3;
            saldo = saldoAtual;
            System.out.println("A quantidade transferida é de " + val3 + "e seu saldo da conta é " + saldo);
        }
        return saldo;
    }
    public double mostrarSaldo(){
        return getSaldo();
    }
    public double investir(double val5){
        if(val5 > saldo){
            System.out.println("Seu saldo é insuficiente");
        } else{
            double saldoAtual = saldo -= val5;
            saldo = saldoAtual;
            System.out.println("a quntidade investida é " + val5 + "e seu saldo é de " + saldo);
        }
        return saldo;
    }
    public double contaPoupanca(double val6){
        if(val6 > saldo){
            System.out.println("Seu saldo é insuficiente");
        } else{
            double saldoAtual = saldo -= val6;
            saldo = saldoAtual;
            System.out.println("a quntidade investida é" + val6 + "e seu saldo é de " + saldo);
        }
        return saldo;
    }

    public int numAcao() {
        int num;
        Scanner ler = new Scanner(System.in);
        do {
            System.out.println("\n\nDigite qual função voce deseja \n 1 Sacar \n 2 Depositar \n 3 transferir\n " +
                    "4 Consultar saldo\n 5 Investir \n 6 Conta polpança \n 7 encerrar visita");
            num = ler.nextInt();
        } while (num>7);
        return num;
    }
    public void acao(Pessoa obj, int num) {
        Scanner sc = new Scanner(System.in);
        switch (num) {
            case 1:
                double val;
                System.out.println("Digite a quntidade que voce quer sacar");
                val = sc.nextDouble();
                obj.sacar(val);
                break;

            case 2:
                double val2;
                System.out.println("digite a quntidade que voce quer depositar");
                val2 = sc.nextDouble();
                obj.depositar(val2);
                System.out.println("Seu saldo é" + obj.getSaldo());
                break;

            case 3:
                double val3;
                System.out.println("Digite a quntidade que voce quer transferir");
                val3 = sc.nextDouble();
                obj.transferir(val3);
                break;

            case 4:
                System.out.println("Seu saldo é " + obj.mostrarSaldo());
                break;

            case 5:
                double val5;
                System.out.println("Digite a quantidade que voce quer investir");
                val5 = sc.nextDouble();
                obj.investir(val5);
                break;

            case 6:
                double val6;
                if (obj instanceof Pf) {
                    System.out.println("Digite a quantia que voce quer colocar na sua conta poupança");
                    val6 = sc.nextDouble();
                    obj.contaPoupanca(val6);
                    System.out.println("voce colocou" + val6 + "na sua popança");

                } else {
                    System.out.println("Pj nao abre pupança");
                }

        }
}
}
