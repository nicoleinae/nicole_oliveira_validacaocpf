package validacoes;

public class Validacoes {

    public boolean tamanho(String cpf) {
        return cpf != null && cpf.length() == 11;
    }

}
