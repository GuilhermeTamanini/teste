package Aula4.exer1;

public class ProfessorHorista  extends Professor{
    int cashPerHour;
    int qtDayWorked;
    int salary;

    public ProfessorHorista(String name, int idProf, String formation, String endereco, String title, int qtDayWorked) {
        super(idProf, formation, name, endereco, title);
        this.setQtDayWorked(qtDayWorked);
    }

    public int getCashPerHour() {
        if (this.getTitle() == "Esp") {
            this.cashPerHour = 45;
            return this.cashPerHour;
        } else if (this.getTitle() == "Mest") {
            this.cashPerHour = 55;
            return this.cashPerHour;
        } else if (this.getTitle() == "Dout") {
            this.cashPerHour = 65;
            return this.cashPerHour;
        }
    }

    public void setQtDayWorked(int qtDayWorked) {
        this.qtDayWorked = qtDayWorked;
    }

    public int getQtDayWorked() {
        return this.qtDayWorked;
    }

    public int getSalary() {
        if(this.getCashPerHour() != 0) {
            return this.salary = (this.getCashPerHour() * 40) * 3;
        } else {
            System.out.println("Salário por hora ou dias trabalhados não fornecidos!");
            return 000;
        }
    }
}
