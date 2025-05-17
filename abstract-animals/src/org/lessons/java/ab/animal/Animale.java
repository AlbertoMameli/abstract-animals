package org.lessons.java.ab.animal;

public abstract class Animale {
    protected String nome;
    private String razza;

    public Animale(String nome, String razza) {
        this.razza = razza;
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getRazza() {
        return this.razza;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }


    public void dormi(){
        System.out.println("zzzzzZzzzzz");
    }

    ;

    public abstract void verso();

    public abstract void mangia();


    public abstract String getTipo();

    public void descriviAnimale(){
        System.out.println(getTipo());
        System.out.println("Nome : " + nome);
        System.out.println("Razza : " + razza);
        dormi();
        mangia();
        verso();
        System.out.println("_________________");

    }

}
