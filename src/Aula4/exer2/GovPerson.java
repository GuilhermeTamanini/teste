package Aula4.exer2;

import Aula4.exer1.Person;

public class GovPerson extends Person {
    int registroMunicipal;

    public GovPerson(int registroMunicipal, String name, String endereco) {
        super(name, endereco);
        this.setRegistroMunicipal(registroMunicipal);
    }

    public void setRegistroMunicipal(int registroMunicipal) {
        this.registroMunicipal = registroMunicipal;
    }

    public int getRegistroMunicipal() {
        return this.registroMunicipal;
    }
}
