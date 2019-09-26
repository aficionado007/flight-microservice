package com.microassign.assignment1;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Flight {
    @Id
    private long id;
    @Column(name="flight_date")
    private String date;
    @Column(name="flight_from")
    private String from;
    @Column(name="flight_to")
    private String to;
    private Integer N;
    private long price;
    @Column(name="flight_name")
    private String name;
    public Flight() {
    }

    public Flight(long id, String date, String from, String to, Integer n, long price, String name) {
        this.id = id;
        this.date = date;
        this.from = from;
        this.to = to;
        N = n;
        this.price = price;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Integer getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
