package com.example.frehgestion.models;

public class items_reference {

    //fields
    private final String name;
    private final double price;
//constructeur
    public items_reference(String name, double price)
    {this.name=name;
    this.price=price;}

    //methods

    public String getName(){return name;}
    public double getPrice(){return price;}


}
