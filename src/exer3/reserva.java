package exer3;

import java.time.LocalDate;
import java.util.Scanner;

public class reserva {
    protected String key;
    protected int date;

    public reserva() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        reserva myObj = new reserva();
        if (myObj.key == "STUDENT") {
            myObj.date = 4;
        } else if (myObj.key == "PROFESSOR") {

        } else if (myObj.key == "COMUNITY") {

        } else {
            System.out.println("Chave invalida, reserva não efetuada!");
        }

    }
}
