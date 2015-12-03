package com.hawasy.Model;

public class Devise {
    //Attribut

    private String name;
    private double tauxDeChangeEnEuro;

    //Constructeur
    public Devise (String name, double tauxDeChangeEnEuro)
    {
        this.name=name;
        this.tauxDeChangeEnEuro=tauxDeChangeEnEuro;
    }

    public String getName() {
        return this.name;
    }                       //retourne le nom


    public double tauxDeChangeEnEuro() {
        return this.tauxDeChangeEnEuro;
    }

    public void changerTauxDeChangeEnEuro(double nouveauTaux) {
        tauxDeChangeEnEuro = nouveauTaux;
    }

    public double conversionEnEuro(double somme) {
        return somme / tauxDeChangeEnEuro;
    }

    public double conversionDepuisEuro(double somme) {
        return somme * tauxDeChangeEnEuro;
    }

    public boolean equals(Object o) {
        return o instanceof Devise && name.equals(((Devise) o).name);
    }

    @Override
    public String toString() {
        return name;
    }
}
