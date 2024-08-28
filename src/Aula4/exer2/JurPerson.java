package Aula4.exer2;

import Aula4.exer1.Person;

public class JurPerson extends Person {
    int cnpj;

    public JurPerson(int cnpj, String name, String endereco) {
        super(name, endereco);
        this.setCnpj(cnpj);
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return this.cnpj;
    }
}
