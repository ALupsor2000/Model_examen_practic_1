package com.company.Model;

public class Temperatur {

    private float Wert;
    private String Masseinheit;
    private int Monat;

    public Temperatur(float wert, String masseinheit, int monat) {
        Wert = wert;
        Masseinheit = masseinheit;
        Monat = monat;
    }

    public float getWert() {
        return Wert;
    }

    public String getMasseinheit() {
        return Masseinheit;
    }

    public int getMonat() {
        return Monat;
    }

    public void setWert(float wert) {
        Wert = wert;
    }

    public void setMasseinheit(String masseinheit) {
        Masseinheit = masseinheit;
    }

    public void setMonat(int monat) {
        Monat = monat;
    }

    @Override
    public String toString() {
        return "Temperatur{" +
                "Wert=" + Wert +
                ", Masseinheit='" + Masseinheit + '\'' +
                ", Monat=" + Monat +
                '}';
    }
}

