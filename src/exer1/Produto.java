package exer1;

import java.time.LocalDate;

public class Produto {
    private String nomeProduto;
    private String descProduto;
    private LocalDate dataProduto;

    //Constructor
    public Produto() {
    }

    //Printa o produto na tela
    public void printProduct() {
        System.out.println("Produto: " + this.getName() + "\nDescrição: " + this.getDesc() + "\nData: " + this.getDate() + "\n");
    }

    //Busca o nome do produto
    public String getName() {
        return this.nomeProduto;
    }

    //Seta o nome do produto
    public void setName(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    //Busca a descrição do produto
    public String getDesc() {
        return this.descProduto;
    }

    //Seta a descrição do produto
    public void setDesc(String descProduto) {
        this.descProduto = descProduto;
    }

    //Busca a data do produto
    public LocalDate getDate() {
        return this.dataProduto;
    }

    //Seta a data do produto
    public void setDate( LocalDate dataProduto) {
        this.dataProduto = dataProduto;
    }

}
