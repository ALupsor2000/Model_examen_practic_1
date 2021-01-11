package com.company.Model;

/**
 * Aceasta clasa se ocupa de Lander
 */
public class Land {

    private String Name, Kontinent;
    private long Flaecehe, Bevolkerung;
    private String Hauptstadt;

    //Constructor pentru clasa Land
    public Land(String name, String kontinent, long flaecehe, long bevolkerung, String hauptstadt) {
        Name = name;
        Kontinent = kontinent;
        Flaecehe = flaecehe;
        Bevolkerung = bevolkerung;
        Hauptstadt = hauptstadt;
    }

    //gettere si setter pentru a putea accesa atributele clasei
    public String getName() {
        return Name;
    }

    public String getKontinent() {
        return Kontinent;
    }

    public String getHauptstadt() {
        return Hauptstadt;
    }

    public long getFlaecehe() {
        return Flaecehe;
    }

    public long getBevolkerung() {
        return Bevolkerung;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setKontinent(String kontinent) {
        Kontinent = kontinent;
    }

    public void setHauptstadt(String hauptstadt) {
        Hauptstadt = hauptstadt;
    }

    public void setFlaecehe(long flaecehe) {
        Flaecehe = flaecehe;
    }

    public void setBevolkerung(long bevolkerung) {
        Bevolkerung = bevolkerung;
    }

    @Override
    public String toString() {
        return "Land{" +
                "Name='" + Name + '\'' +
                ", Kontinent='" + Kontinent + '\'' +
                ", Flaecehe=" + Flaecehe +
                ", Bevolkerung=" + Bevolkerung +
                ", Hauptstadt='" + Hauptstadt + '\'' +
                '}';
    }
}
