package Conta;

public class RepositorioContasArray {
    private Conta[] contas;
    private int proxima;

    RepositorioContasArray(int tamanho) {
        contas = new Conta[tamanho];
        proxima = 0;
    }

    public void inserir(Conta conta) {

        if (conta.getSaldo() == 0.0) {
            throw new RuntimeException("Não pode conta com saldo 0");
        }

        for (int i = 0; i < proxima; i++) {
            if (contas[i].getIdentificador().equals(conta.getIdentificador())) {
                throw new RuntimeException("Conta já existe" + conta.getIdentificador());
            }
        }

        if (proxima >= contas.length) {
            throw new RuntimeException("Não tem mais espaço para criar a conta");
        }

        contas[proxima] = conta;
        proxima++;
    }


    public static void main(String[] args) {
        Conta c1 = new Conta("123", 100.0);
        Conta c2 = new Conta("321", 0.0);
        Conta c3 = new Conta("123", 200.0);
        Conta c4 = new Conta("135", 1000.0);
        Conta c5 = new Conta("246", 500.0);


        RepositorioContasArray repo = new RepositorioContasArray(3);

        try {
            repo.inserir(c4);
            System.out.println("Conta inserida com sucesso: ID" + c4.getIdentificador());
        } catch (Exception e) {
            System.out.println("Erro" + e.getMessage());

        }

        try {
            repo.inserir(c3);
            System.out.println("Conta inserida com sucesso: ID" + c3.getIdentificador());
        } catch (Exception e) {
            System.out.println("Erro" + e.getMessage());

        }

        try {
            repo.inserir(c2);
            System.out.println("Conta inserida com sucesso" + c2.getIdentificador());
        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());

        }

        try {
            repo.inserir(c1);
            System.out.println("Conta inserida com sucesso" + c1.getIdentificador());
        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());

        }
    }
}
