package com.company.Controller;

import com.company.Model.Land;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Aceasta clasa se ocupa de citirea din fisier a datelor
 */
public class Reader {

    public List<Land> read_from_file() throws IOException
    {

        //lista goala care o sa contina tarile din fisier
        List<Land> lander = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Lander"))) {

            String line;
            //citim din fisier fiecare linie in parte pana ajungem la capatul fisierului
            //fiecare linie citita va fi introdusa in lista 'quest'
            while ((line = br.readLine()) != null) {
                String[] spliter = line.split(" ");
                Land land = new Land(spliter[0], spliter[1], Long.parseLong(spliter[2]), Long.parseLong(spliter[3]), spliter[4]);
                lander.add(land);
            }
            return lander;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
