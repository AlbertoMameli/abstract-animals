package org.lessons.java.ab.animal;

public class Testing {
    public static void main(String[] args) {
        Delfino delf = new Delfino("pippo", "delfinus", 33, "sardegna");

        delf.descriviAnimale();
        delf.nuota();

        System.out.println("________________________________");

        Aquila aqui = new Aquila("Gina", "reale", "nero", 3);
        aqui.descriviAnimale();
        aqui.vola();

        System.out.println("________________________________");

        Passerotto passi = new Passerotto("gino", "passero", "verde", 10);
        passi.descriviAnimale();
        passi.vola();
        System.out.println("________________________________");

    }

}
