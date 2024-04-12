import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import cpf.CPF;
import validacoes.Validacoes;

public class Main {
    public static void main(String[] args) {
        List<CPF> listaCPF = new ArrayList<>();

        // lista de cpfs na situação problema do desafio
        listaCPF.add(new CPF("98765432100"));
        listaCPF.add(new CPF("11122233344"));
        listaCPF.add(new CPF("12345678910"));
        listaCPF.add(new CPF("55566677788"));
        listaCPF.add(new CPF("12345678912312"));
        listaCPF.add(new CPF("12312312"));
        listaCPF.add(new CPF("12"));
        listaCPF.add(new CPF("12345678944"));
        listaCPF.add(new CPF("A12547"));
        listaCPF.add(new CPF("A1231231232"));
        listaCPF.add(new CPF("123.123.123-22"));
        listaCPF.add(new CPF("123.123.123-23"));
        listaCPF.add(new CPF("123.123.123-24"));
        listaCPF.add(new CPF("123.123.123-241"));

        Set<CPF> setCPFsValidos = new HashSet<>();
        List<CPF> listaCPFsInvalidos = new ArrayList<>();
        Validacoes validacoes = new Validacoes();

        // task 01 que verifica o tamanho
        for (CPF cpf : listaCPF) {
            String stringcpf = cpf.toString();
            if (validacoes.tamanho(stringcpf)) {
                if (!setCPFsValidos.contains(cpf)) {
                    setCPFsValidos.add(cpf);
                }
            } else {
                listaCPFsInvalidos.add(cpf);
            }
        }

        // print dos CPFs válidos
        System.out.println("Lista de CPFs válidos:");
        for (CPF cpf : setCPFsValidos) {
            System.out.println(cpf.getCpf());
        }

        // print dos CPFs inválidos
        System.out.println("Lista de CPFs inválidos:");
        for (CPF cpf : listaCPFsInvalidos) {
            System.out.println(cpf.getCpf());
        }
    }
}
