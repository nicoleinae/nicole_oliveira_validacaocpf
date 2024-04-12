package cpf;

public class CPF {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método construtor
    public CPF(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return cpf;
    }
}
