package com.company.Repository;

import com.company.Model.Stadt;
import com.company.Model.Temperatur;

import java.util.List;
import java.util.Scanner;

public class StadtRepo {

    private List<Stadt> stadte;
    Scanner sc = new Scanner(System.in);

    public StadtRepo(List<Stadt> stadte) {
        this.stadte = stadte;
    }

    public List<Stadt> getStadte() {
        return stadte;
    }

    public void setStadte(List<Stadt> stadte) {
        this.stadte = stadte;
    }

    public boolean check_if_exists(Stadt stadt){
        return stadte.contains(stadt);
    }

    public boolean check_if_temperature_exist_for_month(Stadt stadt, Integer monat) {

        boolean exist = false;

        for (Temperatur t : stadt.getTemperaturen()) {
            if (t.getMonat() == monat) {
                exist = true;
                break;
            }
        }

        return exist;
    }

    public void update_temp(Stadt stadt, Integer monat, float wert){
        stadt.getTemperaturen().get(monat-1).setWert(wert);
    }

    public void add_with_condition(Stadt stadt){

        int monat = 0;
        boolean exist_stadt = true;

        if (!check_if_exists(stadt)){
            stadte.add(stadt);
            exist_stadt = false;
        }

        if (exist_stadt) {
            System.out.println("Please enter the month you want to check for temperature: ");
            monat = sc.nextInt();

            if (!check_if_temperature_exist_for_month(stadt, monat)){

                System.out.println("Please insert the value of temperature you want to add: ");
                float wert = sc.nextFloat();

                System.out.println("Please insert the type of temperature mass tou want to add: ");
                String mass = sc.next();

                Temperatur t = new Temperatur(wert, mass, monat);
                stadt.getTemperaturen().add(t);
            }
            else{
                System.out.println("Please insert the updated value of temperature you want to add: ");
                float wert2 = sc.nextFloat();
                update_temp(stadt, monat, wert2);
            }
        }
    }

}
