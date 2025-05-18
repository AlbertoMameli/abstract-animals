package org.lessons.java.ab.animal;

public class Cane extends Animale {
    private String famiglia;
    private String eta;

    public Cane(String nome, String razza, String famiglia, int eta) {
        super(nome, razza);
        this.famiglia = famiglia;
        this.eta = Integer.toString(eta);
    }


    @Override
    public void verso() {
        System.out.println("il mio verso è Bau bau");
    }

    @Override
    public void mangia() {
        System.out.println("amo le crocchette");
    }

    @Override
    public String getTipo(){
        return "Cane";
    }

    public String getFamiglia() {
        return this.famiglia;
    }

    public String getEta() {
        return eta;
    }

    public void setFamiglia(String famiglia) {
        this.famiglia = famiglia;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Cane [nome = " + getNome() +
                ", razza = " + getRazza() +
                ", famiglia = " + famiglia +
                ", eta = " + eta + " anni]";

    }
}
