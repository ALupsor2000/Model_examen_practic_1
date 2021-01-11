package com.company;

import com.company.Controller.FilterClass;
import com.company.Controller.Reader;
import com.company.Controller.Writer;
import com.company.Model.Land;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        Reader r = new Reader();
        Writer w = new Writer();
        FilterClass fc = new FilterClass();

        List<Land> land = r.read_from_file();
        List<Land> filtered = fc.filteredLand(land);
        for(Land l : filtered){
            w.write_to_file(l);
        }
    }
}
