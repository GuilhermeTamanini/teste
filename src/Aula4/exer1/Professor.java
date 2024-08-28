package Aula4.exer1;

public class Professor extends Person {
    int idProf;
    String formation;
    String title;

    public Professor(int idProf, String formation, String name, String endereco, String title){
        super(name, endereco);
        this.setIdProf(idProf);
        this.setFormation(formation);
    }

    public void Professor(String args[]) {

    }

    public void setIdProf(int idProf) {
        this.idProf = idProf;
    }

    public int getIdProf() {
        return this.idProf;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public String getFormation() {
        return this.formation;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
