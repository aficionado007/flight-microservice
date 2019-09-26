package com.microassign.assignment1;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.*;

@RestController
public class Controller {
    @Autowired
    private FlightRepository repository;
    private Map<String,List<data> > AvailableFlights= new HashMap<>();
    @PostMapping ("/flights/from/{from}/to/{to}")
    public Map<String,List<data> > retrieveFlights(@PathVariable String from, @PathVariable String to )
    {
        System.out.println("hiGeetika");
        List<Flight> flight = repository.findByFromAndTo(from, to);

        for(Flight fentry: flight)
        {
            if(!AvailableFlights.containsKey(fentry.getName()))
            {
                List<data> dat=new ArrayList<>() ;
                dat.add(new data(fentry));
                AvailableFlights.put(fentry.getName(),dat);
            }
            else
            {
                AvailableFlights.get(fentry.getName()).get(0).getAvailaibleDatesAndPrices().add(fentry.getDate()+":"+fentry.getPrice());
                AvailableFlights.get(fentry.getName()).get(0).getNumberOfSeatsAvailable().add(fentry.getDate()+":" +fentry.getN());

            }

        }
        for (String name : AvailableFlights.keySet())
            System.out.println("key: " + name);
        for (List<data> name : AvailableFlights.values())
        {
            for ( data obj:name)
            {
                System.out.println(obj.getAvailaibleDatesAndPrices().size());
                System.out.println(obj.getNumberOfSeatsAvailable().size());
            }
        }
        // using values() for iteration over keys


        return AvailableFlights;
    }


}
