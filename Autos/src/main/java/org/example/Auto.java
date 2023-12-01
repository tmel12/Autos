package org.example;

public class Auto {
    private String kennzeichen;
    private String modell;
    private String farbe;

    public Auto(String kennzeichen, String modell, String farbe) {
        this.kennzeichen = kennzeichen;
        this.modell = modell;
        this.farbe = farbe;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public String toString() {
        return kennzeichen + " - " + modell + " - " + farbe;
    }
}
