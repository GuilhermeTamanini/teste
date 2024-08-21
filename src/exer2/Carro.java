package exer2;

public class Carro {
    public int numCarro;
    public char nomePiloto;
    private float velocidadeMaxima;
    private float velocidade;
    private float velocidadeMinima;
    private boolean carroLigado;

    //Constructor
    public Carro() {

    }

    public void carro(int numCarro, char nomePiloto, float velocidadeMaxima, float velocidadeMinima) {
    this.numCarro = numCarro;
    this.nomePiloto = nomePiloto;
    this.velocidadeMaxima = velocidadeMaxima;
    this.velocidadeMinima = velocidadeMinima;
    }
    //Aumenta a velocidade do carro de acordo com a porcentagem fornecida
    public void acelerar(int porcentagem) {
        float novaVelocidade = velocidade * (porcentagem / 100);

        if(novaVelocidade > this.velocidadeMaxima) {
            System.out.println("Velocidade ultrapassou o limite!");
        } else {
            this.velocidade = novaVelocidade;
        }
    }

    //Faz o carro parar, velocidade = 0
    public void parar() {
        this.velocidade = 0;
    }

    //Diminui a velocidade do carro de acordo com a porcentagem fornecida
    public void frear(int porcentagem) {
        float novaVelocidade = this.velocidade * (porcentagem / 100);

        if(novaVelocidade < velocidadeMinima) {
            System.out.println("Passou da velocidade mínima, reajuste o valor");
        } else {
            this.velocidade = novaVelocidade;
        }
    }

    public void desligar() {
        if(this.carroLigado) {
            this.carroLigado = false;
            this.parar();
        } else {
            System.out.println("Carro já está desligado!");
        }
    }

    public void ligar() {
        if(!this.carroLigado) {
            this.carroLigado = true;
            this.velocidade = velocidadeMinima;
        } else {
            System.out.println("Carro já está ligado!");
        }
    }

}
