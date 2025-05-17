package org.lessons.java.ab.animal;

public class Delfino extends Animale {
    String eta;
    String provenienza;

    public String getEta() {
        return this.eta;
    }

    public Delfino(String nome, String razza, int eta, String provenienza) {
        super(nome, razza);
        this.eta = Integer.toString(eta);
        this.provenienza = provenienza;

    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getProvenienza() {
        return this.provenienza;
    }

    public void setProvenienza(String provenienza) {
        this.provenienza = provenienza;
    }

    @Override
    public void verso() {
        System.out.println("fiiiiifffiiii");

    }

    @Override
    public void mangia() {
        System.out.println("pesciolini");
    }

    @Override
    public String getTipo() {
        return "Delfino";

    }

}
