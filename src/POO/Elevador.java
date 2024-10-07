package POO;

public class Elevador {
    int andarAtual;
    int totalAndares;
    int capacidade;
    int pessoasPresentes;

    boolean entrar() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Pessoa adicionada. Total de pessoas: " + pessoasPresentes);
            return true;
        } else {
            System.out.println("Capacidade máxima atingida. Não é possível adicionar mais pessoas.");
            return false;
        }
    }

    void sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Pessoa removida. Total de pessoas: " + pessoasPresentes);
        }
    }

    void subir() {
        if (andarAtual >= 0) {
            andarAtual++;
            System.out.println("Andar Atual: " + andarAtual);
        }
    }

    void descer() {
        if (andarAtual > 1) {
            andarAtual--;
            System.out.println("Andar Atual: " + andarAtual);
        }
    }

    void mostraStatus() {
        System.out.println("Andar atual: " + andarAtual + "; Número de pessoas: " + pessoasPresentes);
    }
}

