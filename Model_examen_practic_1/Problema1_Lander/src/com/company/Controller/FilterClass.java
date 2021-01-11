package com.company.Controller;

import com.company.Model.Land;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterClass {

    public List<Land> filteredLand(List<Land> lander){

        return lander.stream().filter(l -> (l.getName().startsWith("M") && l.getFlaecehe() > 10000)).collect(Collectors.toList());
    }
}
