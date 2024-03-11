package com.example.ex3;

import java.io.Serializable;

public class Persoane implements Serializable {

    public String nume;
    public String numar;

    Persoane(String nume, String numar){
        this.numar = numar;
        this.nume = nume;
    }
}
