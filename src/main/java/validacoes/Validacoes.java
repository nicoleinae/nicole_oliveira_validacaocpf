package validacoes;

public class Validacoes {

    public boolean tamanho(String cpf) {
        if (cpf.length() == 11) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean numeros(String cpf) {
        try {
            Long.parseLong(cpf);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
