package model;

import java.util.ArrayList;
//Kald alle arraylists
public class Hotel {
    private String name;
    private String adresse;
    private int singlePris;
    private int doublePris;
    private final ArrayList<model.Tillæg> tillæg = new ArrayList<>();
    private final ArrayList<model.Konference> konferencer = new ArrayList<>();
    private final ArrayList<model.HotelBooking> hotelBookinger = new ArrayList<>();

    public Hotel(String name, String adresse, int singlePris, int doublePris) {
        this.name = name;
        this.adresse = adresse;
        this.singlePris = singlePris;
        this.doublePris = doublePris;
    }

    public String getNavn() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSinglePris() {
        return singlePris;
    }

    public int getDoublePris() {
        return doublePris;
    }

    public ArrayList<model.Konference> getKonferencer() {
        return konferencer;
    }

    public ArrayList<model.HotelBooking> getHotelBookinger() {
        return hotelBookinger;
    }

    public void addHotelBooking(model.HotelBooking hotelBooking){
        this.hotelBookinger.add(hotelBooking);
    }

    public void removeHotelBooking(model.HotelBooking hotelBooking) {
        this.hotelBookinger.remove(hotelBooking);
    }

    public void addKonference(model.Konference konference){
        this.konferencer.add(konference);
    }

    public void removeKonference(model.Konference konference) {
        this.konferencer.remove(konference);
    }

    public ArrayList<model.Tillæg> getTillæg() {
        return tillæg;
    }

    public void addTillæg(model.Tillæg tillæg) {
        this.tillæg.add(tillæg);
    }

    public void removeTillæg(model.Tillæg tillæg) {
        this.tillæg.remove(tillæg);
    }

    @Override
    public String toString() {
        return getNavn();
    }

    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setSinglePris(int singlePris) {
        this.singlePris = singlePris;
    }

    public void setDoublePris(int doublePris) {
        this.doublePris = doublePris;
    }
}