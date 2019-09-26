package com.microassign.assignment1;

import org.springframework.data.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class data {
     private  List<String> AvailaibleDatesAndPrices = new ArrayList<>();
     private  List<String> NumberOfSeatsAvailable = new ArrayList<>();

    public data() {
    }

    public data(Flight f)
    {
        AvailaibleDatesAndPrices.add(f.getDate()+":"+f.getPrice());
        NumberOfSeatsAvailable.add(f.getDate()+":" +f.getN());

    }

    public List<String >getAvailaibleDatesAndPrices() {
        return AvailaibleDatesAndPrices;
    }

    public  List<String> getNumberOfSeatsAvailable() {
        return NumberOfSeatsAvailable;
    }
    /*public String traverselistA(List<Flight> l)
    {
        String s="";
        for(Flight f:l)
        {
            s=s+f.getDate()+":"+f.getPrice()+"\n";
        }
        return s;
    }
    public String traverselistB(List<Flight> l)
    {
        String s="";
        for(Flight f:l)
        {
            s=s+f.getDate()+":"+f.getN()+"\n";
        }
        return s;
    }
*/
}
