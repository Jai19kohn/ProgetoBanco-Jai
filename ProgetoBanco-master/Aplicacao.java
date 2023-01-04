import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num;
        String cren; //Criar e entrar
        String tipo;


        do {
            System.out.println("Digite se você é PF(Pessoa fisica) PJ(Pessoa juridica)");
            tipo = ler.nextLine();
        } while (!tipo.equalsIgnoreCase("pf") && !tipo.equalsIgnoreCase("pj"));
        if ("PF".equalsIgnoreCase(tipo)) {
            System.out.println("voce deseja criar ou entrar em uma conta");
            cren = ler.nextLine();
            if ("CRIAR".equalsIgnoreCase(cren)) {
                System.out.println("Digite seu nome");
                String nome = ler.nextLine();
                System.out.println("Digite seu cpf");
                long cpf = ler.nextLong();
                Pf pf = new Pf(nome, 9999, 0, cpf);
                System.out.println("numero da conta\n" + pf.getNumConta());
                do {
                    System.out.println("Digite qual função voce deseja \n1 Sacar \n 2 Depositar \n 3 transferir\n " +
                            "4 Consultar saldo\n 5 Investir \n 6 Conta polpança \n 7 encerrar visita");
                    num = ler.nextInt();
                    suitPF(pf, num);
                } while (num < 7);
            } else if ("ENTRAR".equalsIgnoreCase(cren)) {
            }

        } else if ("PJ".equalsIgnoreCase(tipo)) {
            System.out.println("voce deseja criar ou entrar em uma conta");
            cren = ler.nextLine();
            if ("CRIAR".equalsIgnoreCase(cren)) {
                System.out.println("digite o nome da sua empresa");
                String nome = ler.nextLine();

                System.out.println("Digite o CNPJ");
                long cnpj = ler.nextLong();
                Pj pj = new Pj(nome, 00000, 0, cnpj);
                System.out.println("O numero da conta é" + pj.getNumConta());
                do {
                    System.out.println("\n Digite qual função voce deseja \n1 Sacar \n2 Depositar \n3 transferir \n" +
                            "4 Consultar saldo\n5 Investir \n6 Conta polpança \n7 encerrar visita");
                    num = ler.nextInt();
                    suitPF(pj, num);
                } while (num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 6);
            } else if ("ENTRAR".equalsIgnoreCase(cren)) {

            }
        }
    }


    public static void suitPF(Pessoa obj, Integer num) {
        Scanner sc = new Scanner(System.in);
        switch (num) {

            case 1:
                double val;

                System.out.println("Digite a quntidade que voce quer sacar");
                val = sc.nextDouble();
                obj.sacar(val);
                System.out.println("Seu saldo é: " + obj.mostrarSaldo());

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
                System.out.println("A quantidade transferida é de" + val3 + "e seu saldo da conta é" + obj.getSaldo());
                break;
            case 4:
                System.out.println("Seu saldo é " + obj.mostrarSaldo());
                break;
            case 5:
                double val4;
                System.out.println("Digite a quantidade que voce quer investir");
                val4 = sc.nextDouble();
                obj.investir(val4);
                System.out.println("a quntidade investida é" + val4 + "e seu saldo é de " + obj.getSaldo());
                break;
            case 6:
                double val5;

                if (obj instanceof Pf) {
                    System.out.println("Digite a quantia que voce quer colocar na sua conta poupança");
                    val5 = sc.nextDouble();
                    obj.contaPoupanca(val5);
                    System.out.println("voce colocou" + val5 + "na sua popança");

                } else {
                    System.out.println("Pj nao abre pupança");
                }

        }
    }
}
