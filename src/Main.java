//import exer1.Produto;
//import exer2.Carro;
//import Aula4.exer1.Professor;
//import Aula4.exer1.ProfessorHorista;
import Aula4.exer2.GovPerson;
import Aula4.exer2.JurPerson;
import Aula4.exer2.PhysPerson;
//import exer3.reserva;
//import java.util.Scanner;

public class Main {

    //Constructor
    public Main() {
    }

    public static void main(String[] args) {
        PhysPerson physPerson = new PhysPerson(1002003004,"NOME DA PESSOA FISICA", "RUA SEI LA NUMERO NAO SEI AAAA");
        JurPerson jurPerson = new JurPerson(22312412,"NOME DA PESSOA Júridica", "RUA SEI LA NUMERO 2222 ? AAAA");
        GovPerson govPerson = new GovPerson(222222, "Governo de não sei oq", "RUA DO FULANO DE TAULS");
        System.out.println("Nome da pessoa física: " + physPerson.getName() + "\nCPF: " + physPerson.getCpf() + "\nENDERECO: " + physPerson.getEndereco());
        System.out.println("Nome da pessoa jurídica: " + jurPerson.getName() + "\nCPF: " + jurPerson.getCnpj() + "\nENDERECO: " + jurPerson.getEndereco());
        System.out.println("Nome da pessoa governamental: " + govPerson.getName() + "\nRegistroMunicipal: " + govPerson.getRegistroMunicipal() + "\nENDERECO: " + govPerson.getEndereco());
    }

//    public static void main(String[] args) {
//        ProfessorHorista prof1 = new ProfessorHorista("NOME GENERICO", 22, 11, 44, "sim?", 100, 10);
//        System.out.println("Professor: " + prof1.getName() + "\nid do professor: " + prof1.getIdProf() + "\nIdade: " + prof1.getAge() + "\nFormation: " + prof1.getFormation() + "\nSalario: " + prof1.getSalary());
//    }

//    public static void main(String[] args) {
//        Professor prof1 = new Professor(22, "ESSEESSSSSSSSSS", "Professor numero dois", 22, 3333333);
//        System.out.println("Professor: " + prof1.getName() + "\nid do professor: " + prof1.getIdProf() + "\nIdade: " + prof1.getAge());
//    }
//    public static void main(String[] args) {
//        reserva res1 = new reserva();
//
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
//    }
//    public static void main(String[] args) {
//        Carro carro1 = new Carro();
//
//        carro1.carro(22, 'd', 80, 20);
//        carro1.frear(22);
//    }
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