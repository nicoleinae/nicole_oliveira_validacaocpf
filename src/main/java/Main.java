import java.util.ArrayList;
import java.util.List;

import cpf.CPF;

public class Main {
    public static void main(String[] args) {
        List<CPF> listaCPF = new ArrayList<>();

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


    }
}