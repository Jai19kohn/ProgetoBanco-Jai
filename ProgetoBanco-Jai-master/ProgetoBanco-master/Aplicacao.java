import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        String numeroC;
        String numCPF;
        Scanner ler = new Scanner(System.in);
        int num = 0;
        String cren; //Criar e entrar
        String tipo;


        do {
            System.out.println("Digite se você é PF(Pessoa fisica) PJ(Pessoa juridica)");
            tipo = ler.nextLine();
        } while (!tipo.equalsIgnoreCase("pf") && !tipo.equalsIgnoreCase("pj"));
        if ("PF".equalsIgnoreCase(tipo)) {
            System.out.println("voce deseja criar ou entrar em uma conta");
            cren = ler.nextLine();
            //Pf pf = null;
            if ("CRIAR".equalsIgnoreCase(cren)) {
                System.out.println("Digite seu nome");
                String nome = ler.nextLine();
                System.out.println("Digite seu cpf");
                String cpf = ler.nextLine();
                Pf pf = new Pf(nome, 9999, 0, cpf);
                System.out.println("numero da conta\n" + pf.getNumConta());
                num = pf.numAcao();
                pf.acao(pf, num);
            } else if ("ENTRAR".equalsIgnoreCase(cren)) {
                Pf pf = new Pf("Rosangela", 1234, 35240, "09072832457");
                do {
                    System.out.println("Digite o número da conta");
                    numeroC = ler.nextLine();
                } while (!numeroC.equalsIgnoreCase("1234"));
                do {
                    System.out.println("Digite o seu cpf: ");
                    numCPF = ler.nextLine();
                } while (!numCPF.equalsIgnoreCase("09072832457"));
                num = pf.numAcao();
                pf.acao(pf, num);
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
                num = pj.numAcao();
                pj.acao(pj,num);
            } else if ("ENTRAR".equalsIgnoreCase(cren)) {
                Pj pj = new Pj("Lojita", 4321, 3563565, "13624635789");
                do {
                    System.out.println("Digite o número da conta");
                    numeroC = ler.nextLine();
                } while (!numeroC.equalsIgnoreCase("4321"));
                do {
                    System.out.println("Digite o seu cpf: ");
                    numCPF = ler.nextLine();
                } while (!numCPF.equalsIgnoreCase("13624635789"));
                num = pj.numAcao();
                pj.acao(pj, num);
            }
        }
    }


}
