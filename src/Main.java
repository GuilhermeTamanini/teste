import exer1.Produto;
import exer2.Carro;

import java.time.LocalDate;

public class Main {

    //Constructor
    public Main() {
    }
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.carro(22, 'd', 80, 20);
        carro1.frear('');
    }
/*
    public static void main(String[] args) {
//        Produto prod1 = new Produto("PRODUTO1", "DESCDOPRODUTO1", LocalDate.of(2024, 8, 20));
//        Produto prod2 = new Produto("PRODUTO2", "DESCDOPRODUTO2", LocalDate.of(2022, 1, 12));
        Produto prod1 = new Produto();
        Produto prod2 = new Produto();

        prod1.setName("Among Us");
        prod1.setDesc("Sinistro");
        prod1.setDate(LocalDate.of(2000,4,20));

        prod2.setName("Coringa");
        prod2.setDesc("Risos");
        prod2.setDate(LocalDate.of(2000,4,20));

        prod1.printProduct();
        prod2.printProduct();
    }
    */
}