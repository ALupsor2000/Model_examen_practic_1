package com.company.Model;

import java.util.List;

public class Stadt {

    private String name, land;
    private List<Temperatur> temperaturen;

    public Stadt(String name, String land, List<Temperatur> temperaturen) {
        this.name = name;
        this.land = land;
        this.temperaturen = temperaturen;
    }

    public String getName() {
        return name;
    }

    public String getLand() {
        return land;
    }

    public List<Temperatur> getTemperaturen() {
        return temperaturen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public void setTemperaturen(List<Temperatur> temperaturen) {
        this.temperaturen = temperaturen;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", land='" + land + '\'' +
                ", temperaturen=" + temperaturen;
    }
}
