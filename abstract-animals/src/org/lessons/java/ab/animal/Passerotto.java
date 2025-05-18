package org.lessons.java.ab.animal;

public class Passerotto extends Animale implements Volatili {
    private String colorePiume;
    private String larghezzaAli;

    public Passerotto(String nome, String razza, String colorePiume, int larghezzaAli) {
        super(nome, razza);
        this.colorePiume = colorePiume;
        this.larghezzaAli = Integer.toString(larghezzaAli);

    }

    public String getColorePiume() {
        return this.colorePiume;
    }

    public void setColorePiume(String colorePiume) {
        this.colorePiume = colorePiume;
    }

    public String getLarghezzaAli() {
        return this.larghezzaAli;
    }

    public void setLarghezzaAli(String larghezzaAli) {
        this.larghezzaAli = larghezzaAli;
    }

    @Override
    public void verso() {
        System.out.println("il mio verso è cip cip");

    }

    @Override
    public void mangia() {
        System.out.println("mangio quasi sempre briciole di pane");

    }

    @Override
    public String getTipo() {
        return "Passerotto";

    }

    @Override
    public String toString() {
        return "Passerotto [nome = " + getNome() +
                ", razza = " + getRazza() +
                ", colore piume = " + colorePiume +
                ", larghezza ali = " + larghezzaAli + "]";
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!!");

    }
}
