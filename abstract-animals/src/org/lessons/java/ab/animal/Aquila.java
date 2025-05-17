package org.lessons.java.ab.animal;

public class Aquila extends Animale implements Volatili{
    private String colorePiume;
    private String larghezzaAli;

    public Aquila(String nome, String razza, String colorePiume, int larghezzaAli) {
        super(nome, razza);
        this.colorePiume = colorePiume;
        this.larghezzaAli = Integer.toString(larghezzaAli);
    }

    public String getColorePiume() {
        return this.colorePiume;
    }

    public String getLarghezzaAli() {
        return this.larghezzaAli;
    }

    public void setColorePiume(String colorePiume) {
        this.colorePiume = colorePiume;
    }

    public void setLarghezzaAli(String larghezzaAli) {
        this.larghezzaAli = larghezzaAli;
    }

    


    @Override
    public void verso() {
        System.out.println("AAAhAAHAAHAHAHHAh");

    }

    @Override
    public void mangia() {
        System.out.println("Picoli animali");
    }

    @Override
    public String getTipo() {
        return "Aquila";

    }

    @Override
    public String toString() {
        return "Aquila [nome = " + getNome() +
                ", razza = " + getRazza() +
                ", apertura alare = " + larghezzaAli +
                ", piumaggio = " + getColorePiume() + "]";
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
