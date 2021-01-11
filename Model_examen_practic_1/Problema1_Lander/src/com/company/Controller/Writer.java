package com.company.Controller;

import com.company.Model.Land;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Aceasta clasa se ocupa de scrierea in fisier
 */
public class Writer {

    public void write_to_file(Land land) {
        try {
            FileWriter myWriter = new FileWriter("LanderOutput.txt", true);
            myWriter.write(land.getName() + " " + " " + land.getKontinent() + " " + land.getFlaecehe() + " " + land.getBevolkerung() + " " + land.getHauptstadt() + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
