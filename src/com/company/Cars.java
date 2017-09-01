package com.company;

public class Cars {

    private String marka;
    private int ciężar;
    private int przebieg;
    private String nrRej;


    public Cars(String marka, int ciężar, int przebieg) {
        this.marka = marka;
        this.ciężar = ciężar;
        this.przebieg = przebieg;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getCiężar() {
        return ciężar;
    }

    public void setCiężar(int ciężar) {
        this.ciężar = ciężar;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public String getNrRej() {
        return nrRej;
    }

    public void setNrRej(String nrRej) {
        this.nrRej = nrRej;
    }

}
