package com.company;

import com.company.Model.Stadt;
import com.company.Model.Temperatur;
import com.company.Repository.StadtRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Temperatur t1 = new Temperatur( -15, "C", 1);
        Temperatur t2 = new Temperatur( -10, "C", 2);
        Temperatur t3 = new Temperatur( 0, "C", 3);
        Temperatur t4 = new Temperatur( 7, "C", 4);
        Temperatur t5 = new Temperatur( 15, "C", 5);
        Temperatur t6 = new Temperatur( 23, "C", 6);
        Temperatur t7 = new Temperatur( 60, "F", 7);
        Temperatur t8 = new Temperatur( 72, "F", 8);
        Temperatur t9 = new Temperatur( 20, "C", 9);
        Temperatur t10 = new Temperatur( 12, "C", 10);
        Temperatur t11 = new Temperatur( 3, "C", 11);
        Temperatur t12 = new Temperatur( -8, "C", 12);

        Temperatur t13 = new Temperatur(4, "C", 5);

        List<Temperatur> temperaturs1 = new ArrayList<>();
        List<Temperatur> temperaturs2 = new ArrayList<>();
        List<Stadt> stadts = new ArrayList<>();

        temperaturs1.add(t1);
        temperaturs1.add(t2);
        temperaturs1.add(t3);
        temperaturs1.add(t4);
        temperaturs1.add(t5);
        temperaturs1.add(t6);
        temperaturs1.add(t7);
        temperaturs1.add(t8);
        temperaturs1.add(t9);
        temperaturs1.add(t10);
        temperaturs1.add(t11);
        temperaturs1.add(t12);

        temperaturs2.add(t13);

        Stadt s1 = new Stadt("Sighisoara", "Romania", temperaturs1);
        Stadt s2 = new Stadt("Medias", "Romania", temperaturs2);

        stadts.add(s1);
        stadts.add(s2);

        StadtRepo sr = new StadtRepo(stadts);

        System.out.println("""
                How do you want to display the temperature?
                1. Clesius
                2. Fahrenheit
                
                Input option: """);

        String opt = sc.next();

        if (opt.equals("1")) {
            List<Stadt> stadte = sr.getStadte();
            stadte.forEach(s -> {
                System.out.println(s.getName() + " ");
                s.getTemperaturen().forEach(t -> {
                    if (t.getMasseinheit().equals("C")) {
                        System.out.println("Temperatur{" +
                                "Wert=" + t.getWert() +
                                ", Masseinheit='" + "C" + '\'' +
                                ", Monat=" + t.getMonat() +
                                '}');
                    } else {
                        System.out.println("Temperatur{" +
                                "Wert=" + (t.getWert() - 33.8) +
                                ", Masseinheit='" + "C" + '\'' +
                                ", Monat=" + t.getMonat() +
                                '}');

                    }
                });
            });
        }
        else if(opt.equals("2")) {
            List<Stadt> stadte = sr.getStadte();
            stadte.forEach(s -> {
                System.out.println(s.getName() + " ");
                s.getTemperaturen().forEach(t -> {if (t.getMasseinheit().equals("F")){
                    System.out.println("Temperatur{" +
                        "Wert=" + t.getWert() +
                        ", Masseinheit='" + "F" + '\'' +
                        ", Monat=" + t.getMonat() +
                        '}');
                }
                else{
                            System.out.println("Temperatur{" +
                                    "Wert=" + (t.getWert()+33.8) +
                                    ", Masseinheit='" + "F" + '\'' +
                                    ", Monat=" + t.getMonat() +
                                    '}');
                            }
                }
                );
            });
        }

    }
}
