package Aula4.exer1;

public abstract class Person {
    String name;
    String endereco;

    public Person(String name, String endereco) {
        this.setName(name);
        this.setEndereco(endereco);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

}
