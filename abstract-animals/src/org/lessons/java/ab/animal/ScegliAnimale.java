package org.lessons.java.ab.animal;

public class ScegliAnimale {
    public static void main(String[] args) {
        Cane pipppo = new Cane("Pippo", "Bassotto", "Bassottini", 33);
        pipppo.descriviAnimale();
        System.out.println(pipppo);

        Aquila aquila = new Aquila("Canterina", "Reale", "Marrone", 4);
        aquila.descriviAnimale();
        System.out.println(aquila);

        Delfino delfinuccio = new Delfino("Delfinuccio", "Delfide", 33, "mar caraibico");
        delfinuccio.descriviAnimale();
        System.out.println(delfinuccio);
    }
}
