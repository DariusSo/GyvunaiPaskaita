package com.example.gyvunaipaskaita;

public class Gyvunas {
    String vardas;
    int amzius;
    String rusis;

    public Gyvunas(String vardas, int amzius, String rusis) {
        this.vardas = vardas;
        this.amzius = amzius;
        this.rusis = rusis;
    }

    @Override
    public String toString() {
        return "Gyvuno vardas: " + vardas + ", Amzius: " + amzius + ", Rusis: " + rusis + "\n";
    }
}
