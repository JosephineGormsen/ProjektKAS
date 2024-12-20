package model;


import java.util.ArrayList;

public class Deltager extends model.Person {

    private String adresse;
    private String land;
    private String by;
    private String tlfNr;
    private final ArrayList<model.Registration> registrationer = new ArrayList<model.Registration>();

    public Deltager(String navn, String adresse, String land, String by, String tlfNr) {
        this.navn = navn;
        this.adresse = adresse;
        this.land = land;
        this.by = by;
        this.tlfNr = tlfNr;
    }


    public String getNavn() {
        return navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getLand() {
        return land;
    }

    public String getBy() {
        return by;
    }

    public String getTlfNr() {
        return tlfNr;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public void setTlfNr(String tlfNr) {
        this.tlfNr = tlfNr;
    }

    public ArrayList<model.Registration> getRegistrationer() {
        return registrationer;
    }

    public void addRegistration(model.Registration registration) {
        registrationer.add(registration);
    }

    public void removeRegistration(model.Registration registration){
        registrationer.remove(registration);
    }

    @Override
    public String toString() {
        return getNavn();
    }

    /**
     * Metoden anvendes til at sætte deltagere i rækkeføge
     */
    public int compareTo(Deltager other){
        return this.navn.compareTo(other.navn);
    }
}
