package validacoes;

public class Validacoes {

    public boolean tamanho(String cpf) {
        String cpfcopia = removerPontosTracos(cpf);
        if (cpfcopia.length() == 11) {
            return true;
        }
        else {
            return false;
        }
    }
<<<<<<< Updated upstream
    
=======
    public boolean numeros(String cpf) {
        String cpfcopia = removerPontosTracos(cpf);
        try {
            Long.parseLong(cpfcopia);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
>>>>>>> Stashed changes
    }

    public String removerPontosTracos(String cpf) {
        return cpf.replaceAll("[.-]", "");
    }

}
