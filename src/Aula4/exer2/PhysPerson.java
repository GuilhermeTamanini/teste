package Aula4.exer2;

import Aula4.exer1.Person;

public class PhysPerson extends Person {
    int cpf;

    public PhysPerson(int cpf, String name, String endereco) {
        super(name, endereco);
        this.setCpf(cpf);
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCpf() {
        return this.cpf;
    }

}
