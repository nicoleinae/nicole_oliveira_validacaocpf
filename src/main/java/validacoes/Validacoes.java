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
    
    }


}
